package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Categoria;
import pe.senati.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	public CategoriaServiceImpl() {}
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	@Transactional
	public void insert(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	@Override
	@Transactional
	public void update(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	@Override
	@Transactional
	public void delete(Integer categoriaId) {
		categoriaRepository.deleteById(categoriaId);
	}

	@Override
	@Transactional(readOnly=true)
	public Categoria findById(Integer categoriaId) {
		return categoriaRepository.findById(categoriaId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
	
}
