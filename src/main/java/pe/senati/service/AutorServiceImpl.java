package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Autor;
import pe.senati.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public AutorServiceImpl() {}
	
	@Override
	@Transactional
	public void insert(Autor autor) {
		autorRepository.save(autor);
	}

	@Override
	@Transactional
	public void update(Autor autor) {
		autorRepository.save(autor);
	}

	@Override
	@Transactional
	public void delete(Integer autorId) {
		autorRepository.deleteById(autorId);
	}

	@Override
	@Transactional(readOnly=true)
	public Autor findById(Integer autorId) {
		// TODO Auto-generated method stub
		return autorRepository.findById(autorId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Autor> findAll() {
		return autorRepository.findAll();
	}
	
}
