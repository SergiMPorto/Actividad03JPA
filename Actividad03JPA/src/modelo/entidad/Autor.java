package modelo.entidad;

import java.util.Date;

public class Autor {
	
@Entity

	private int id;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;




//Contructor

public Autor(int id, String nombre, String apellidos, Date fechaNacimiento) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fechaNacimiento = fechaNacimiento;
   }




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




public String getApellidos() {
	return apellidos;
}




public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}




public Date getFechaNacimiento() {
	return fechaNacimiento;
}




public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}


}