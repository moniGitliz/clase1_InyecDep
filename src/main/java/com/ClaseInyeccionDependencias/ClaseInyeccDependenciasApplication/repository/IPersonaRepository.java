package com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.repository;

import com.ClaseInyeccionDependencias.ClaseInyeccDependenciasApplication.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {


//    List<Persona> findAll();
//    Persona findById(Long id);
//    public void save(Persona persona);

}
