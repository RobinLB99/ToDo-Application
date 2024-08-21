package com.robinlb.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robinlb.todo.model.Task;
import com.robinlb.todo.service.TaskService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequestMapping("/Task")
public class TaskController {

  @Autowired
  private TaskService service;

  @PostMapping("guardar")
  public String guardarTarea(Task tarea) {
    service.save(tarea);
    return "redirect:/";
  }

}
