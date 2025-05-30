package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.service;

import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model.Persona;
import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


//Aqui cambiamos la implementacion de PersonaRepository a IPersonaRepository
public class PersonaService implements IPersonaService {

    private final IPersonaRepository personaRepository;


    @Autowired
    public PersonaService(IPersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> obtenerTodos() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null); //la última parte .orElse, se agregó porque el necesita saber que pasa si no encuentra el ID
    }

    @Override
    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);



    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public void editarPersona(Long id, Persona personaActualizada) {
    //primero saber si existe
        Persona personaExistente = personaRepository.findById(id).orElse(null);

        if(personaExistente != null){
            //Actualizar los campos de la persona existente
        personaExistente.setNombre(personaActualizada.getNombre());
        personaExistente.setCargo(personaActualizada.getCargo());

        //guardo a la persona actualizada
            personaRepository.save(personaExistente);
        }else {
            throw new RuntimeException("Persona no encontrada con el id: " + id);
        }
    }
}
