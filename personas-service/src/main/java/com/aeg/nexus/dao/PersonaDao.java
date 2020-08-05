package com.aeg.nexus.dao;

import org.springframework.data.repository.CrudRepository;

import com.aeg.nexus.modelo.entity.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
