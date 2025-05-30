package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.service;

import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model.Persona;
import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonaService implements IPersonaService {

    private final PersonaRepository personaRepository;


    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> obtenerTodos() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);

    }
}
