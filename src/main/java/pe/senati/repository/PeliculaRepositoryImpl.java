package pe.senati.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import pe.senati.entity.Pelicula;

@Component
public class PeliculaRepositoryImpl implements PeliculaRepository{
	
	private static final Map<Integer, Pelicula> peliculas=new HashMap<>();
	
	static {
		Pelicula pelicula1=new Pelicula(1, "La gran Muralla",LocalDate.of(2004, 5, 15), LocalTime.of(2, 30), "Manuel Rojas", "Renso y Naomi", "Accion", 100.000);
		Pelicula pelicula2=new Pelicula(2, "La gran Muralla",LocalDate.of(2004, 5, 15), LocalTime.of(2, 30), "Manuel Rojas", "Renso y Naomi", "Accion", 100.000);
		Pelicula pelicula3=new Pelicula(3, "La gran Muralla",LocalDate.of(2004, 5, 15), LocalTime.of(2, 30), "Manuel Rojas", "Renso y Naomi", "Accion", 100.000);
		
		peliculas.put(pelicula1.getPeliculaId(), pelicula1);
		peliculas.put(pelicula2.getPeliculaId(), pelicula2);
		peliculas.put(pelicula3.getPeliculaId(), pelicula3);

	}
	
   public PeliculaRepositoryImpl() {
	// TODO Auto-generated constructor stub
}
	
	@Override
	public void insert(Pelicula pelicula) {
		Integer newID=peliculas.size()+1;
		pelicula.setPeliculaId(newID);
		
		peliculas.put(pelicula.getPeliculaId(), pelicula);
	}

	@Override
	public void update(Pelicula pelicula) {
		peliculas.put(pelicula.getPeliculaId(), pelicula);
	}

	@Override
	public void delete(Integer peliculaId) {
		peliculas.remove(peliculaId);
	}

	@Override
	public Pelicula findById(Integer peliculaId) {
		// TODO Auto-generated method stub
		return peliculas.get(peliculaId);
	}

	@Override
	public Collection<Pelicula> findAll() {
		// TODO Auto-generated method stub
		return peliculas.values();
	}

}
