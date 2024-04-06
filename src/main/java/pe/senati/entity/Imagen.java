package pe.senati.entity;

import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.tika.Tika;

@Entity
@Table(name = "imagenes")
public class Imagen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer imagenId;

	@Column
	private String file_name;

	@Column(columnDefinition = "longblob")
	private byte[] file;

	@OneToOne(mappedBy = "imagenes")
	private Anime anime;

	public Imagen() {
		// TODO Auto-generated constructor stub
	}

	

	public Integer getImagenId() {
		return imagenId;
	}



	public void setImagenId(Integer imagenId) {
		this.imagenId = imagenId;
	}



	public String getFile_name() {
		return file_name;
	}



	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}



	public byte[] getFile() {
		return file;
	}



	public void setFile(byte[] file) {
		this.file = file;
	}



	public Anime getAnime() {
		return anime;
	}



	public void setAnime(Anime anime) {
		this.anime = anime;
	}



	// convierte file en String en base 64
	public String getBase64Image() {
		String base64 = Base64.getEncoder().encodeToString(this.file);
		return base64;
	}

	// obtener tipo de imagen (img, jpg, png, etc)
	public String getTypeImage() {
		String typeImage = new Tika().detect(this.file);
		return typeImage;
	}

}
