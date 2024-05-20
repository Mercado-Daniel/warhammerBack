package com.example.warhammerBack.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.warhammerBack.model.entity.Facciones;
import com.example.warhammerBack.repository.FaccionesRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RequestMapping("api/facciones")
@RestController
public class FaccionesController {
    @Autowired
    private FaccionesRepository repo;

    @GetMapping("/")
    public List<Facciones> getFacciones(){
        return repo.findAll();
    }

    @PostMapping("/create")
    public Facciones saveFaccion(@RequestBody Facciones faccion){
        return repo.save(faccion);
    }
    
    @GetMapping("/faccion/{id}")
    public Optional<Facciones> getFaccionById(@PathVariable Long id){
        return repo.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFaccion(@RequestBody Long id){
        repo.deleteById(id);
    }

    @PutMapping("path/{id}")
    public Facciones updateFaccion(@RequestBody Facciones faccion){
        Optional<Facciones> facc = repo.findById(faccion.getId());
        Facciones faccionF = facc.get();
        faccionF.setNombre(faccion.getNombre());
        faccionF.setLider(faccion.getLider());
        faccionF.setDogma(faccion.getDogma());
        faccionF.setCapital(faccion.getCapital());
        faccionF.setTransfondo(faccion.getTransfondo());
        return repo.save(faccionF);
    }
    
    
    
}
