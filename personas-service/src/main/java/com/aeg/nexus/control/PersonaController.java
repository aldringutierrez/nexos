package com.aeg.nexus.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aeg.nexus.modelo.entity.Persona;
import com.aeg.nexus.modelo.servicios.IPersonaService;

@RestController
public class PersonaController {
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/listar") 
	public List<Persona> listar(){
		return personaService.findAll();
	}
	
	@GetMapping("/ver/{id}") 
	public Persona detalle(@PathVariable Long id) {
		return personaService.findById(id);
		
	}
	
	@PostMapping("/nuevo") 
	public void insertar(@RequestBody Persona per) {
		personaService.salvar(per);
	}
	
	@PutMapping("/modificar") 
	public void modificar(@RequestBody Persona per) {
		personaService.salvar(per);
	}
	
	@DeleteMapping("/borrar/{id}") 
	public void borrar(@PathVariable Long id) {
		personaService.borrar(id);
	}
	


	
	
}
