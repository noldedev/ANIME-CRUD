package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Anime;

public interface AnimeService {
	public abstract void insert(Anime anime);
	public abstract void update(Anime anime);
	public abstract void delete(Integer animeId);
	public abstract Anime findById(Integer animeId);
	public abstract Collection<Anime> findAll();
	public abstract Double sumar();
}
