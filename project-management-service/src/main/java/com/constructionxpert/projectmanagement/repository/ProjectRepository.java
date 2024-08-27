package com.constructionxpert.projectmanagement.repository;

import com.constructionxpert.projectmanagement.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}