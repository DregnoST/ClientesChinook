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

public class FicherosBinarios {
	// lectura y escritura secuancial de objetos en ficheros

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		File ficheroObjetos = new File(".//src//ficheros//fichero_objetos.dat");

		escribeObjetoEnFichero(ficheroObjetos);
		//addObjetoEnFichero(ficheroObjetos);
		//leeObjetoDesdeFichero(ficheroObjetos);

	}

	public static void escribeObjetoEnFichero(File fichero) {
		// escribir un objeto en un fichero

		try {

			// abrir flujo
			FileOutputStream escrituraOS = new FileOutputStream(fichero, true);
			ObjectOutputStream objetoOS = new ObjectOutputStream(escrituraOS);

			System.out.println("Añadido objeto al fichero " + fichero.getName());
			// creacion de un alumno
			Alumno a001 = new Alumno("Balthasar", "Altdorf", 36);

		
			// guardar alumnos creados
			objetoOS.writeObject(a001);

			// cerrar el flujo del ObjectStream
			objetoOS.close();

			// cerrar el flujo del FileStream
			escrituraOS.close();

			// excepciones
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// añadir objetos al fichero con objetos
	public static void addObjetoEnFichero(File fichero) {

		System.out.println("");

		try {
			// generador aleatoria para la edad
			Random edadRandom = new Random();
			// matrices para la asignación de dirección y nombre a los nuevos objetos de
			// tipo alumno
			String[] nombres = { "Karl Franz", "Krell", "Arkhan", "Manfred", "Isabella", "Neferata" };
			String[] ciudades = { "Altdorf", "Templehof", "Sternieste", "Nuln", "Marinenburgo", "Plaga-Skaven" };

			// inicio del flujo
			ObjectOutputStream miObjectOS = new ObjectOutputStream(new FileOutputStream(fichero, true));
			System.out.println("añadido objetos al fichero");

			// rerorrer las matrices y añadir objetos al fichero
			for (int i = 0; i < nombres.length; i++) {

				Alumno a003 = new Alumno(nombres[i], ciudades[i], edadRandom.nextInt(50));
				miObjectOS.writeObject(a003);

			}
			// cerrar el fujo
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

			a003 = (Alumno) objectIS.readObject();

			while (a003 != null) {

				System.out.println();
				System.out.println("Nombre: " + a003.getNombre());
				System.out.println("Dirección: " + a003.getDirección());
				System.out.println("Edad: " + a003.getEdad());
				System.out.println("Matricula: " + a003.isMatricula());
				a003 = (Alumno) objectIS.readObject();

			}

			objectIS.close();

		} catch (EOFException ex) {
			
			System.out.println("Fin del fichero");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
			
		}

	}

}
