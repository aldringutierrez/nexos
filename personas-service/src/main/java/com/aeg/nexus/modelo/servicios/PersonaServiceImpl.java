package com.aeg.nexus.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aeg.nexus.dao.PersonaDao;
import com.aeg.nexus.modelo.entity.Persona;

import brave.Tracer;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private PersonaDao personaDao;
	
	@Autowired
	private Tracer tracer;
	
	@Override
	@Transactional(readOnly=true)
	public List<Persona> findAll() {
		System.out.println("***aeg*** PersonaServiceImpl.findAll");
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Persona findById(Long id) {
		try {
			System.out.println("***aeg*** PersonaServiceImpl.findById");
			if (id==1) {
				throw new Exception();
			}
		} catch (Exception e) {
			tracer.currentSpan().tag("***aeg*** error id :",id.toString());
			e.printStackTrace();
		}
		return personaDao.findById(id).orElse(null);
	}

	@Override
	public void salvar(Persona per) {
		personaDao.save(per);
	}

	@Override
	public void modificar(Persona per) {
		personaDao.save(per);
	}

	@Override
	public void borrar(Long id) {
		personaDao.deleteById(id);
	}

	
	

	
	
}
