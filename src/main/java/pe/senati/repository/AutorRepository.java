package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
	
}
