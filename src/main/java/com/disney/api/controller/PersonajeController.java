package com.disney.api.controller;

import com.disney.api.model.Personaje;
import com.disney.api.service.PersonajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonajeController {

    @Autowired
    private PersonajeServiceImpl serviosREST;

    @GetMapping("/characters")
    public List<Personaje> findByNombre(@RequestParam("nombre") String nombre){
        return serviosREST.findByNombre(nombre);
    }
}
