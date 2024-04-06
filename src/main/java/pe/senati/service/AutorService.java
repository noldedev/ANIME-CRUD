package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Autor;

public interface AutorService {
	public abstract void insert(Autor autor);
	public abstract void update(Autor autor);
	public abstract void delete(Integer autorId);
	public abstract Autor findById(Integer autorId);
	public abstract Collection<Autor> findAll();
}
