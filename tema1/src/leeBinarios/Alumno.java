package leeBinarios;

import java.io.Serializable;

public class Alumno  implements Serializable{
	
	String nombre;
	String direcci�n;
	int edad;
	
	public Alumno(String nombre, String direcci�n, int edad) {
		super();
		this.nombre = nombre;
		this.direcci�n = direcci�n;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
