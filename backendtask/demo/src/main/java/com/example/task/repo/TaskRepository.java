package com.example.task.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.model.*;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task save(Task task);
    void deleteById(Long id);
}
