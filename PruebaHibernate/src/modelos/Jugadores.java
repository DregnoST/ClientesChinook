package modelos;

import java.io.Serializable;

public class Jugadores implements Serializable {

	private int codigo;
	private String nombre;
	private String procedencia;
	private String altura;
	private int peso;
	private String posicion;
	private Equipos equipo;
	
	
	public Jugadores() {
		
	}
	
	public Jugadores(int codigo, String nombre, String procedencia, String altura, int peso, String posicion, Equipos equipo) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.equipo = equipo;
		
	}
	
	// Getters y Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}
	
	// fin Getters y Setters

	@Override
	public String toString() {
		
		return "Codigo: " + codigo + " Nombre: " + nombre + " Procedencia: " + procedencia + " Altura: " + altura + " Peso: " + peso + " Posicion: " + posicion; 
	}
	
}
