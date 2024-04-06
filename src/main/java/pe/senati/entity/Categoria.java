package pe.senati.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoriaId;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@ManyToMany(mappedBy = "itemsCategoria")
	private Set<Anime> itemsAnimes = new HashSet<>();
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer categoriaId, String nombre, String descripcion) {
		this.categoriaId = categoriaId;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
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

	public Set<Anime> getItemsAnimes() {
		return itemsAnimes;
	}

	public void setItemsAnimes(Set<Anime> itemsAnimes) {
		this.itemsAnimes = itemsAnimes;
	}
	
}
