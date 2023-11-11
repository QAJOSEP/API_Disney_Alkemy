package com.disney.api.repo;

import com.disney.api.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonajeRepo extends JpaRepository<Personaje,Integer> {

    @Query("SELECT c FROM Personaje c WHERE c.nombre = :nombre")
    List<Personaje> findByNombre(String nombre);
}
