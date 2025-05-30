package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.service;

import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> obtenerTodos();
    Persona obtenerPorId(Long id);
    void guardarPersona(Persona persona);

}
