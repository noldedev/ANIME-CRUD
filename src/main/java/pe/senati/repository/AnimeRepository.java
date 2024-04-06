package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Anime;

@Repository
public interface AnimeRepository  extends  JpaRepository<Anime, Integer>{

}
	