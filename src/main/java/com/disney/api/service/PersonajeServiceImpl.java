package com.disney.api.service;

import com.disney.api.model.Personaje;
import com.disney.api.repo.PersonajeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService<Personaje,Integer>{

    @Autowired
    private PersonajeRepo repository;

    @Override
    public List<Personaje> findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }

    @Override
    public Personaje save(Personaje personaje) {
        return repository.save(personaje);
    }

    @Override
    public Personaje update(Personaje personaje, Integer id) {
        personaje.setId(id);
        return repository.save(personaje);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
