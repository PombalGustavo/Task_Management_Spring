package com.gustavoPombal.task_management_spring.controllers;

import com.gustavoPombal.task_management_spring.repositories.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ToDoController {

    private final ToDoRepository toDoRepository;

    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @GetMapping("/")
    public ModelAndView list() {
        return new ModelAndView(
                "todo/list",
                Map.of("todos", toDoRepository.findAll())
        );
    }

}
