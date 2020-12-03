package ejemploMySQL;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



public class Conexion {



	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://172.30.1.142:3306/world";

	private static final String USUARIO = "developer";

	private static final String CLAVE = "alumno";



	public Connection conectar() {

		Connection conexion = null;

		

		try {

			Class.forName(CONTROLADOR);

			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);

			System.out.println("Conexi�n OK");



		} catch (ClassNotFoundException e) {

			System.out.println("Error al cargar el controlador");

			e.printStackTrace();



		} catch (SQLException e) {

			System.out.println("Error en la conexi�n");

			e.printStackTrace();

		}

		

		return conexion;

	}



	public static void main(String[] args) {



	}

}


