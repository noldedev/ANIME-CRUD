package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empleadoId;
	
	@Column
	private String nombre;
	
	@Column
	private Double salario;
	
	@Column
	private Character Genero;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	private LocalDate fecha_empleo;
	
	@DateTimeFormat(pattern = "HH:mm",iso = ISO.TIME)
	private LocalTime horario_laboral;
	
	@Column
	private String cargo;
	
	@ManyToOne
	@JoinColumn(name = "estudio_id")
	private Estudioproduccion estudioproduccion;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(Integer empleadoId, String nombre, Double salario, 
			Character genero, LocalDate fecha_empleo,
			LocalTime horario_laboral, String cargo) {
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.salario = salario;
		Genero = genero;
		this.fecha_empleo = fecha_empleo;
		this.horario_laboral = horario_laboral;
		this.cargo = cargo;
	}


	public Integer getEmpleadoId() {
		return empleadoId;
	}


	public void setEmpleadoId(Integer empleadoId) {
		this.empleadoId = empleadoId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Character getGenero() {
		return Genero;
	}


	public void setGenero(Character genero) {
		Genero = genero;
	}


	public LocalDate getFecha_empleo() {
		return fecha_empleo;
	}


	public void setFecha_empleo(LocalDate fecha_empleo) {
		this.fecha_empleo = fecha_empleo;
	}


	public LocalTime getHorario_laboral() {
		return horario_laboral;
	}


	public void setHorario_laboral(LocalTime horario_laboral) {
		this.horario_laboral = horario_laboral;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Estudioproduccion getEstudioproduccion() {
		return estudioproduccion;
	}


	public void setEstudioproduccion(Estudioproduccion estudioproduccion) {
		this.estudioproduccion = estudioproduccion;
	}

}
