package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Empleado;

public interface EmpleadoService {
	public abstract void insert(Empleado empleado);
	public abstract void update(Empleado empleado);
	public abstract void delete(Integer empleadoId);
	public abstract Empleado findById(Integer empleadoId);
	public abstract Collection<Empleado> findAll();
}
