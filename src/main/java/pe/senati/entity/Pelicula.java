package pe.senati.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Pelicula {
	
	private Integer peliculaId;
	private String titulo;
	
	//Fecha
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
    private LocalDate fvCreacion;
	
	//Hora
	@DateTimeFormat(pattern = "HH:mm",iso = ISO.TIME)
    private LocalTime duracion;
    private String director;
    private String actores;
    private String tipo;
    private Double gastos;
    
    public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public Pelicula(Integer peliculaId, String titulo, LocalDate fvCreacion, LocalTime duracion, String director,
			String actores, String tipo, Double gastos) {
		this.peliculaId = peliculaId;
		this.titulo = titulo;
		this.fvCreacion = fvCreacion;
		this.duracion = duracion;
		this.director = director;
		this.actores = actores;
		this.tipo = tipo;
		this.gastos = gastos;
	}

	public Integer getPeliculaId() {
		return peliculaId;
	}

	public void setPeliculaId(Integer peliculaId) {
		this.peliculaId = peliculaId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFvCreacion() {
		return fvCreacion;
	}

	public void setFvCreacion(LocalDate fvCreacion) {
		this.fvCreacion = fvCreacion;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}

   
	
    
}
