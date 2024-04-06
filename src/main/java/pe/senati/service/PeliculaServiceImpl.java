package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.senati.entity.Pelicula;
import pe.senati.repository.PeliculaRepository;

@Component
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaRepository repository;
	
	
	public PeliculaServiceImpl() {
		
	}
	
	@Override
	public void insert(Pelicula pelicula) {
		// TODO Auto-generated method stub
		repository.insert(pelicula);
	}

	@Override
	public void update(Pelicula pelicula) {
		repository.update(pelicula);
		
	}

	@Override
	public void delete(Integer peliculaId) {
		repository.delete(peliculaId);
	}

	@Override
	public Pelicula findById(Integer peliculaId) {
		// TODO Auto-generated method stub
		return repository.findById(peliculaId);
	}

	@Override
	public Collection<Pelicula> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
