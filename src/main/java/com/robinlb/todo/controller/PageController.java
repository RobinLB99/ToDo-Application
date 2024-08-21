package com.robinlb.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robinlb.todo.configuration.Page;
import com.robinlb.todo.model.Task;
import com.robinlb.todo.service.TaskService;

@Slf4j
@Controller
@RequestMapping
public class PageController {

  @Autowired
  private TaskService taskService;

  @GetMapping(path = { "/" })
  public String goHome(Model model) {
    List<Task> tareas = taskService.findAll();
    model.addAttribute("lista_tareas", tareas.isEmpty() ? null : tareas);
    model.addAttribute("nueva_tarea", new Task());
    return Page.home;
  }

}
