package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.repository;

import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model.Persona;
import java.util.List;

public interface IPersonaRepository {
    List<Persona> findAll();
    Persona findById(Long id);
    public void save(Persona persona);

}
