package com.gustavoPombal.task_management_spring.repositories;

import com.gustavoPombal.task_management_spring.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
