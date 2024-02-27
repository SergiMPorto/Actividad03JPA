package modelo.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private float precio;
	@OneToOne(mappedBy = "editorial",cascade= CascadeType.ALL)
	private List<Editorial>editorial;
	@OneToOne(mappedBy = "libro", cascade= CascadeType.ALL)
	private List<Autor>autor;

	
	
    
    
    //Contructor
    
	public Libro(int id, String titulo, float precio, List<Editorial> editorial, List<Autor> autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.editorial = editorial;
		this.autor = autor;
	}




	
	//Getter and setter
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public List<Editorial> getEditorial() {
		return editorial;
	}
	public void setEditorial(List<Editorial> editorial) {
		this.editorial = editorial;
	}
	public List<Autor> getAutor() {
		return autor;
	}
	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}





	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", editorial=" + editorial + ", autor="
				+ autor + "]";
	}

	
	
	
}
