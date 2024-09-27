package com.example.lab520182048gtics242.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "viajes")
public class Viajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idViajes")
    private int id;
    private String punto_recojo;
    private String cant_personas;
    private String cant_perros;
    @ManyToOne
    @JoinColumn(name = "Persona_idPersona")
    private Persona Persona_idPersona;
    @ManyToOne
    @JoinColumn(name = "Lugares_idLugares")
    private Persona Lugares_idLugares;
}
