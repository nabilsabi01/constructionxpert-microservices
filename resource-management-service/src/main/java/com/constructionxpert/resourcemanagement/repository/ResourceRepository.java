package com.constructionxpert.resourcemanagement.repository;

import com.constructionxpert.resourcemanagement.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findByTaskId(Long taskId);
}
