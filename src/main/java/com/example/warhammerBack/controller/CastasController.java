package com.example.warhammerBack.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.warhammerBack.model.entity.Castas;
import com.example.warhammerBack.repository.CastasRepository;

import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("api/castas")
@RestController
public class CastasController {
    @Autowired
    private CastasRepository repo;

    @GetMapping("/")
    public  List<Castas> getCastas(){
        return repo.findAll();
    }
    
}
