package conectorMysql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionMysql {
	
	
	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/nba?useSSL=false";
		String usuario = "root";
		String pass = "alumno";
		System.out.println("Intenta conectar al servidor " + url);
		//172.30.1.142
		
		
		try {
			
			Connection MiConexion = DriverManager.getConnection(url, usuario, pass);
			System.out.println("Conectado con exito");
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
	}
}
