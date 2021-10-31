package ru.progwards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.progwards.jpa.ProjectRespository;
import ru.progwards.jpa.TaskRespository;
import ru.progwards.model.Project;
import ru.progwards.model.Task;

import java.util.List;

@RestController
@RequestMapping ("/list")
public class EndPointContr {

    @Autowired
    ProjectRespository pResp;
    TaskRespository tResp;

    @GetMapping("/tasks")
    List <Task> getTasks(){
        return   tResp.findAll();
    }
    @GetMapping("/projects")
    List <Project> getpPojects(){
      return   pResp.findAll();
    }


}
