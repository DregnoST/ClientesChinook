package leeBinarios;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class ficherosBinarios {
	
	public static void main(String[] args) throws ClassNotFoundException {
	
	// File fichero_bytes = new File(".//src//ficheros//fichero_bytes.dat");
	// File fichero_primitivos = new File(".//src//ficheros//fichero_primitivos.dat");
	File ficheroObjetos = new File(".//src//ficheros//fichero_objetos.dat");
	
	escribeObjetoEnFichero(ficheroObjetos);
	// addObjetoEnFichero(ficheroObjetos);
	// leeObjetoDesdeFichero(ficheroObjetos);
	
	}
	
	public static void escribeObjetoEnFichero(File fichero) {
		
		try {
			
			FileOutputStream escrituraOS = new FileOutputStream(fichero, true);
			ObjectOutputStream objetoOS = new ObjectOutputStream(escrituraOS);
			
			System.out.println("Añadido objeto al fichero "+ fichero.getName());
			Alumno a001 = new Alumno("Balthasar","Altdorf",36);
			
			objetoOS.writeObject(a001);
			objetoOS.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	public static void addObjetoEnFichero(File fichero) {
		
		System.out.println("");
		
		try {
			
			Random edadRandom = new Random();
			String[] nombres = {"Karl Franz", "Krell", "Arkhan", "Manfred", "Isabella", "Neferata"};
			String[] ciudades = {"Altdorf", "Templehof", "Sternieste", "Nuln", "Marinenburgo", "Plaga-Skaven"};
			
			ObjectOutputStream miObjectOS = new ObjectOutputStream(new FileOutputStream(fichero, true));
			System.out.println("añadido objetos al fichero");
			
			for (int i = 0; i < nombres.length; i++) {
				
				Alumno a002 = new Alumno(nombres[i], ciudades[i], edadRandom.nextInt(50));
				miObjectOS.writeObject(a002);
				
			}
			
			miObjectOS.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void leeObjetoDesdeFichero(File fichero) throws IOException, ClassNotFoundException {
		System.out.println("leer objetos de un fichero");
		
		try {
			
			FileInputStream lecturaIS = new FileInputStream(fichero);
			ObjectInputStream objectIS = new ObjectInputStream(lecturaIS);
			
			Alumno a003;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
