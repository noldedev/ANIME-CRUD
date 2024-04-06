package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Pelicula;

public interface PeliculaService {
	public abstract void insert(Pelicula pelicula);
	public abstract void update(Pelicula pelicula);
	public abstract void delete(Integer peliculaId);
	public abstract Pelicula findById(Integer peliculaId);
	public abstract Collection<Pelicula> findAll();
}
