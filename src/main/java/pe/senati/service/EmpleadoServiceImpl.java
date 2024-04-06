package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Empleado;
import pe.senati.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	public EmpleadoServiceImpl() {}
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	
	@Override
	@Transactional
	public void insert(Empleado empleado) {
		empleadoRepository.save(empleado);
	}

	@Override
	@Transactional
	public void update(Empleado empleado) {
		empleadoRepository.save(empleado);
	}

	@Override
	@Transactional
	public void delete(Integer empleadoId) {
		empleadoRepository.deleteById(empleadoId);
	}

	@Override
	@Transactional(readOnly=true)
	public Empleado findById(Integer empleadoId) {
		return empleadoRepository.findById(empleadoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Empleado> findAll() {
		return empleadoRepository.findAll();
	}
	
}
