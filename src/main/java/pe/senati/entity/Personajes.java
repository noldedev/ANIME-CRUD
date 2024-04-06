package pe.senati.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "personajes")
public class Personajes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personajeId;
	
	@Column
	private String nombres;
	
	@ManyToOne
	@JoinColumn(name = "anime_id")
	private Anime anime;

	public Personajes() {}
	
	public Personajes(Integer personajeId, String nombres) {
		this.personajeId = personajeId;
		this.nombres = nombres;
	}


	public Integer getPersonajeId() {
		return personajeId;
	}

	public void setPersonajeId(Integer personajeId) {
		this.personajeId = personajeId;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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

	
}
