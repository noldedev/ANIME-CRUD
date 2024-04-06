package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Personajes;
import pe.senati.repository.PersonajesRepository;

@Service
public class PersonajesServicesImpl implements PersonajesServices{

	@Autowired
	private PersonajesRepository personajesRepository;
	
	public PersonajesServicesImpl() {}
	
	
	@Override
	@Transactional
	public void insert(Personajes personajes) {
		personajesRepository.save(personajes);
	}

	@Override
	@Transactional
	public void update(Personajes personajes) {
		personajesRepository.save(personajes);
	}

	@Override
	@Transactional
	public void delete(Integer personajeId) {
		personajesRepository.deleteById(personajeId);
	}

	@Override
	@Transactional(readOnly=true)
	public Personajes findById(Integer personajeId) {
		return personajesRepository.findById(personajeId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Personajes> findAll() {
		return personajesRepository.findAll();
	}

}
