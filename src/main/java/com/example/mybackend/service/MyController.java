package com.example.mybackend.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.List;
@RestController
@RequestMapping("student")
public class MyController {
    private final EtudiantRepository repo;
    public MyController(EtudiantRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/all")
    public
    List<EtudiantEntity> getAll(){
        return  repo.findAll();
    }
}
