package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Estudioproduccion;

public interface EstudioService {
	public abstract void insert(Estudioproduccion estudioproduccion);
	public abstract void update(Estudioproduccion estudioproduccion);
	public abstract void delete(Integer estudioId);
	public abstract Estudioproduccion findById(Integer estudioId);
	public abstract Collection<Estudioproduccion> findAll();
}
