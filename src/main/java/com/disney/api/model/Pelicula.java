package com.disney.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imagen;
    private String titulo;
    private String calificacion;
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "FK")
    private Personaje personajes;
}
