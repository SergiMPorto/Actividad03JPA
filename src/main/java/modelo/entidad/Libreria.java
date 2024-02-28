package modelo.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "libreria")

public class Libreria {
	
@Id

private int id;
private String nombre;
private String nombredueno;
private String direccion;
@ManyToMany(mappedBy = "libreria", cascade = CascadeType.ALL)
private List<Libro>libro;


//Contructor
public Libreria(int id, String nombre, String nombredueno, String direccion, List<Libro> libro) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.nombredueno = nombredueno;
	this.direccion = direccion;
	this.libro = libro;
}

//Getter and Setter


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getNombredueno() {
	return nombredueno;
}
public void setNombredueno(String nombredueno) {
	this.nombredueno = nombredueno;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public List<Libro> getLibro() {
	return libro;
}
public void setLibro(List<Libro> libro) {
	this.libro = libro;
}



@Override
public String toString() {
	return "Libreria [id=" + id + ", nombre=" + nombre + ", nombredueno=" + nombredueno + ", direccion=" + direccion
			+ ", libro=" + libro + "]";
}






}
