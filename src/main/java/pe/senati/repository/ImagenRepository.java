package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Imagen;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Integer> {

	@Query(value = "SELECT CASE WHEN COUNT(*) > 0 THEN TRUE ELSE FALSE END FROM anime WHERE imagen_id = :imagenId", nativeQuery = true)
	public abstract int isDelete(Integer imagenId);
}
