package pe.senati.entity;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="anime")
public class Anime implements Serializable {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animeId;

	@Column
	private String nombre;
	@Column
	private String descripcion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	private LocalDate fvPublicacion;
	@Column
	private Integer capitulos;
	@Column
	private String estado;
	@Column
	private Double califacion;
	@Column
    private String enlaceMAL;
	
	//Autor
	@ManyToOne
	@JoinColumn(name = "autor_id", nullable = false)
	private Autor autor;
	
	//Se crea una nueva tabla entre categorias y animes
	@ManyToMany
	@JoinTable(name = "animes_categorias", 
	joinColumns = @JoinColumn(name = "anime_id"), 
	inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	private Set<Categoria> itemsCategoria = new HashSet<>();
	
	//Estudio de Producción
	@ManyToOne
	@JoinColumn(name = "estudio_id", nullable = false)
	private Estudioproduccion estudioproduccion;
	
	//Personajes
	@OneToMany(mappedBy = "anime")
	private Collection<Personajes> personajes = new ArrayList<>();
	
	//Imagenes
	@OneToOne
	@JoinColumn(name = "imagen_id", nullable = false, unique = true)
	private Imagen imagenes;
	

	public Anime() {}

	public Anime(Integer animeId, String nombre, String descripcion, LocalDate fvPublicacion, Integer capitulos,
			String estado, Double califacion, String enlaceMAL, Autor autor, Set<Categoria> itemsCategoria,
			Estudioproduccion estudioproduccion) {
		this.animeId = animeId;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fvPublicacion = fvPublicacion;
		this.capitulos = capitulos;
		this.estado = estado;
		this.califacion = califacion;
		this.enlaceMAL = enlaceMAL;
		this.autor = autor;
		this.itemsCategoria = itemsCategoria;
		this.estudioproduccion = estudioproduccion;
	}
	
	public Integer getAnimeId() {
		return animeId;
	}

	public void setAnimeId(Integer animeId) {
		this.animeId = animeId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFvPublicacion() {
		return fvPublicacion;
	}

	public void setFvPublicacion(LocalDate fvPublicacion) {
		this.fvPublicacion = fvPublicacion;
	}

	public Integer getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Integer capitulos) {
		this.capitulos = capitulos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getCalifacion() {
		return califacion;
	}

	public void setCalifacion(Double califacion) {
		this.califacion = califacion;
	}

	public String getEnlaceMAL() {
		return enlaceMAL;
	}

	public void setEnlaceMAL(String enlaceMAL) {
		this.enlaceMAL = enlaceMAL;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Set<Categoria> getItemsCategoria() {
		return itemsCategoria;
	}

	public void setItemsCategoria(Set<Categoria> itemsCategoria) {
		this.itemsCategoria = itemsCategoria;
	}

	public Estudioproduccion getEstudioproduccion() {
		return estudioproduccion;
	}

	public void setEstudioproduccion(Estudioproduccion estudioproduccion) {
		this.estudioproduccion = estudioproduccion;
	}

	public Collection<Personajes> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(Collection<Personajes> personajes) {
		this.personajes = personajes;
	}

    public Imagen getImagenes() {
		return imagenes;
	}

	public void setImagenes(Imagen imagenes) {
		this.imagenes = imagenes;
	}
	
	
}
