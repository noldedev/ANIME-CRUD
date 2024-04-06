package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Personajes;

@Repository
public interface PersonajesRepository extends JpaRepository<Personajes, Integer> {

}
