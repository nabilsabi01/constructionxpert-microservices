CREATE TABLE tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    project_id BIGINT NOT NULL,
    description TEXT NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    status ENUM('TO_DO', 'IN_PROGRESS', 'COMPLETED') NOT NULL
);