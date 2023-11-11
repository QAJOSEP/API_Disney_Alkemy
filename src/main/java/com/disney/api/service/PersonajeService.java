package com.disney.api.service;

import com.disney.api.model.Personaje;

import java.util.List;

public interface PersonajeService<T, ID> {
    List<T> findByNombre(String nombre);
    T save(T t);
    T update(T t,ID id);
    void delete(ID id);
}
