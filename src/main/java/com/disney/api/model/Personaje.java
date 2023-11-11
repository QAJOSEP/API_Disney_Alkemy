package com.disney.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imagen;
    private String nombre;
    private int peso;
    private String historia;
    @OneToMany(mappedBy = "personajes")
    private List<Pelicula> peliculas;
}
