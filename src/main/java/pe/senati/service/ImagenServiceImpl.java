package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Imagen;
import pe.senati.repository.ImagenRepository;

@Service
public class ImagenServiceImpl implements ImagenService {
	
	@Autowired
	private ImagenRepository imagenRepository;
	
	public ImagenServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void insert(Imagen imagen) {
		imagenRepository.save(imagen);
	}

	@Override
	@Transactional
	public void update(Imagen imagen) {
		imagenRepository.save(imagen);		
	}

	@Override
	@Transactional
	public void delete(Integer imagenId) {
		imagenRepository.deleteById(imagenId);
	}

	@Override
	@Transactional(readOnly = true)
	public Imagen findById(Integer imagenId) {
		return imagenRepository.findById(imagenId).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Imagen> findAll() {
		return imagenRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public int isDelete(Integer imagenId) {
		return imagenRepository.isDelete(imagenId);
	}
}
