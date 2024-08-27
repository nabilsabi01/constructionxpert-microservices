package com.constructionxpert.resourcemanagement.service;

import com.constructionxpert.resourcemanagement.exception.TaskNotFoundException;
import com.constructionxpert.resourcemanagement.model.Resource;
import com.constructionxpert.resourcemanagement.repository.ResourceRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceService {
    private final ResourceRepository resourceRepository;
    private final RestTemplate restTemplate;
    private static final String TASK_SERVICE_URL = "http://task-management-service/api/tasks";

    public ResourceService(ResourceRepository resourceRepository, RestTemplate restTemplate) {
        this.resourceRepository = resourceRepository;
        this.restTemplate = restTemplate;
    }

    private void checkTaskExists(Long taskId) {
        Boolean taskExists = restTemplate.getForObject(TASK_SERVICE_URL + "/" + taskId + "/exists", Boolean.class);
        if (Boolean.FALSE.equals(taskExists)) {
            throw new TaskNotFoundException("Task with ID " + taskId + " does not exist");
        }
    }

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public Optional<Resource> getResourceById(Long resourceId) {
        return resourceRepository.findById(resourceId);
    }

    public Resource createResource(Resource resource) {
        checkTaskExists(resource.getTaskId());
        return resourceRepository.save(resource);
    }

    public Resource updateResource(Long resourceId, Resource resource) {
        checkTaskExists(resource.getTaskId());
        resource.setId(resourceId);
        return resourceRepository.save(resource);
    }

    public void deleteResource(Long resourceId) {
        resourceRepository.deleteById(resourceId);
    }
}
