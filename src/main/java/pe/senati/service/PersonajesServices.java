package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Personajes;

public interface PersonajesServices {
	public abstract void insert(Personajes personajes);
	public abstract void update(Personajes personajes);
	public abstract void delete(Integer personajeId);
	public abstract Personajes findById(Integer personajeId);
	public abstract Collection<Personajes> findAll();
}
