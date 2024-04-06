package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Estudioproduccion;

@Repository
public interface EstudioRepository  extends JpaRepository<Estudioproduccion, Integer>{

}
