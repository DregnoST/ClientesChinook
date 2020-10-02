package leeBinarios;

import java.io.Serializable;

public class Alumno  implements Serializable{
	
	String nombre;
	String dirección;
	int edad;
	
	public Alumno(String nombre, String dirección, int edad) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
