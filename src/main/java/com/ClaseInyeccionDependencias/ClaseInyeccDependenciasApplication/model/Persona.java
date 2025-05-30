package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model;

import jakarta.persistence.*;
import lombok.*;

@Data

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Aqui se establece como un AUTOINCREMENT
    private Long id_Persona;
    @Column(nullable = false, length = 100) //este es como el VARCHAR(100) NOT NULL
    private String nombre;
    private String cargo;


    public Persona() {
    }

    public Persona(Long id_Persona, String nombre, String cargo) {
        this.id_Persona = id_Persona;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public Long getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(Long id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
