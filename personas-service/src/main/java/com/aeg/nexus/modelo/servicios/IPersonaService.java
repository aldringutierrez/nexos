package com.aeg.nexus.modelo.servicios;

import java.util.List;

import com.aeg.nexus.modelo.entity.Persona;

public interface IPersonaService {
	public List <Persona> findAll();
	public Persona findById(Long Id);
	public void salvar(Persona per);
	public void modificar(Persona per);
	public void borrar(Long id);

}
