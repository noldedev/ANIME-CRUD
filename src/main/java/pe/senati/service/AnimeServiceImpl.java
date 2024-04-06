package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Anime;
import pe.senati.repository.AnimeRepository;

@Service
public class AnimeServiceImpl implements AnimeService{
	
	@Autowired
	private AnimeRepository animeRepository;
	
	public AnimeServiceImpl() {	}

	@Override
	@Transactional
	public void insert(Anime anime) {
		// TODO Auto-generated method stub
		animeRepository.save(anime);
	}

	@Override
	@Transactional
	public void update(Anime anime) {
		// TODO Auto-generated method stub
		animeRepository.save(anime);
	}

	@Override
	@Transactional
	public void delete(Integer animeId) {
		// TODO Auto-generated method stub
		animeRepository.deleteById(animeId);
	}

	@Override
	@Transactional(readOnly = true)
	public Anime findById(Integer animeId) {
		// TODO Auto-generated method stub
		return animeRepository.findById(animeId).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Anime> findAll() {
		// TODO Auto-generated method stub
		return animeRepository.findAll();
	}

	@Override
	@Transactional
	public Double sumar() {
		// TODO Auto-generated method stub
		return null;
	}
}
