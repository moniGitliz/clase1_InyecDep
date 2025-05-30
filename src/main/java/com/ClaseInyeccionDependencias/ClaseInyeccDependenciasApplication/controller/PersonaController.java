package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.controller;

import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model.Persona;
import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/personas")

public class PersonaController {

    private final PersonaService personaService;
    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping //Traer a todo el mundo
    public List<Persona> listarPersona(){
        return personaService.obtenerTodos();
    }

    @GetMapping("/{id}") //Mapeando pero por id puerto 8080/personas/id(variable)
    public Persona obtenerPorId(@PathVariable Long id){
        return personaService.obtenerPorId(id);
    }

    @PostMapping //POST 8080/personas
    public ResponseEntity<String> guardarPersona(@RequestBody Persona persona) {
        personaService.guardarPersona(persona);
        return ResponseEntity.ok("Persona agregada con éxito");
    }


}

