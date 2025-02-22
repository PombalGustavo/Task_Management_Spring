package com.gustavoPombal.task_management_spring.controllers;

import com.gustavoPombal.task_management_spring.repositories.ToDoRepository;
import org.h2.engine.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    private final ToDoRepository toDoRepository;

    public HomeController(ToDoRepository toDoRepository){
        this.toDoRepository = toDoRepository;
    }

    @GetMapping("/")
    public ModelAndView home(){
        var modelAndView = new ModelAndView("home");
        modelAndView.addObject("nome", "Gustavo Pombal");
        var alunos = List.of("clayson lima", "Wesley alemão", "Gustavo Pombal");
        modelAndView.addObject("alunos", alunos);
        modelAndView.addObject("ehProgramador", false);




        var toDos = toDoRepository.findAll();
        System.out.println(toDos);

        return modelAndView;
    }

}
