package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Imagen;

public interface ImagenService {
	public abstract void insert(Imagen imagen);
	public abstract void update(Imagen imagen);
	public abstract void delete(Integer imagenId);
	public abstract Imagen findById(Integer imagenId);
	public abstract Collection<Imagen> findAll();
	public abstract int isDelete(Integer imagenId);
}
