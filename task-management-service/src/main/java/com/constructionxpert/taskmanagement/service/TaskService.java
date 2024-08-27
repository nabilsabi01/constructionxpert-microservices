package com.constructionxpert.taskmanagement.service;

import com.constructionxpert.taskmanagement.exception.ProjectNotFoundException;
import com.constructionxpert.taskmanagement.model.Task;
import com.constructionxpert.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final RestTemplate restTemplate;
    private static final String PROJECT_SERVICE_URL = "http://project-management-service/api/projects";

    public TaskService(TaskRepository taskRepository, RestTemplate restTemplate) {
        this.taskRepository = taskRepository;
        this.restTemplate = restTemplate;
    }

    private void checkProjectExists(Long projectId) {
        Boolean projectExists = restTemplate.getForObject(PROJECT_SERVICE_URL + "/" + projectId + "/exists", Boolean.class);
        if (Boolean.FALSE.equals(projectExists)) {
            throw new ProjectNotFoundException("Project with ID " + projectId + " does not exist");
        }
    }

    public boolean taskExists(Long taskId) {
        return taskRepository.existsById(taskId);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long taskId) {
        return taskRepository.findById(taskId);
    }

    public List<Task> getTasksByProjectId(Long projectId) {
        return taskRepository.findByProjectId(projectId);
    }

    public Task createTask(Task task) {
        checkProjectExists(task.getProjectId());
        return taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        checkProjectExists(task.getProjectId());
        return taskRepository.save(task);
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
