package pe.senati.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estudioProduccion")
public class Estudioproduccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer estudioId;
	
	@Column
	private String nombre;
	
	@Column
	private Integer contacto;
	
	@Column
	private String redes_sociales;
	
	@Column
	private String tipo_produccion;
	
	@Column
	private String ubicacion;

	@OneToOne(mappedBy = "estudioproduccion")
	private Anime anime;
	
	@OneToMany(mappedBy = "estudioproduccion")
	private Collection<Empleado> empleados = new ArrayList<>();
	
	public Estudioproduccion() {
		// TODO Auto-generated constructor stub
	}

	public Estudioproduccion(Integer estudioId, String nombre, 
			Integer contacto, String redes_sociales,
			String tipo_produccion, String ubicacion) {
		this.estudioId = estudioId;
		this.nombre = nombre;
		this.contacto = contacto;
		this.redes_sociales = redes_sociales;
		this.tipo_produccion = tipo_produccion;
		this.ubicacion = ubicacion;
	}

	public Integer getEstudioId() {
		return estudioId;
	}

	public void setEstudioId(Integer estudioId) {
		this.estudioId = estudioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Number getContacto() {
		return contacto;
	}

	public void setContacto(Integer contacto) {
		this.contacto = contacto;
	}

	public String getRedes_sociales() {
		return redes_sociales;
	}

	public void setRedes_sociales(String redes_sociales) {
		this.redes_sociales = redes_sociales;
	}

	public String getTipo_produccion() {
		return tipo_produccion;
	}

	public void setTipo_produccion(String tipo_produccion) {
		this.tipo_produccion = tipo_produccion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

}
