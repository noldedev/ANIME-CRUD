package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Estudioproduccion;
import pe.senati.repository.EstudioRepository;

@Service
public class EstudioServiceImpl implements EstudioService{

	
	public EstudioServiceImpl() {}
	
	@Autowired
	private EstudioRepository estudioRepository;

	@Override
	@Transactional
	public void insert(Estudioproduccion estudioproduccion) {
		estudioRepository.save(estudioproduccion);
	}

	@Override
	@Transactional
	public void update(Estudioproduccion estudioproduccion) {
		estudioRepository.save(estudioproduccion);
	}

	@Override
	@Transactional
	public void delete(Integer estudioId) {
		estudioRepository.deleteById(estudioId);
	}

	@Override
	@Transactional(readOnly=true)
	public Estudioproduccion findById(Integer estudioId) {
		return estudioRepository.findById(estudioId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Estudioproduccion> findAll() {
		return estudioRepository.findAll();
	}

	
}
