package principal;

import java.util.Scanner;
import dbEmbebidaSqlite.Artista;
import ejemploMySQL.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artista a = new Artista();
		
		
		//a.setName("Leonard Cohen");
		//a.guardar();
		
		//a.verTodosArtistas();
		//a.verCancionesArtista(teclado());
		//a.verCancionesAlbum(teclado());
		//a.verPrimeraCancioneAlbum(teclado());
		
		verCiudadesPais();
	}
	
	public static String teclado() {
		Scanner leer = new Scanner(System.in);
		return leer.nextLine();
	}
	
	public static void verCiudadesPais() {
		
		try {
			
			Conexion con = new Conexion();
			Connection cx = con.conectar();
			
			//PreparedStatement st2 = cx.prepareStatement("insert into city(name, countrycode, district, population) values ('Jaca','ESP','Aragonia',13000)");
			PreparedStatement st = cx.prepareStatement("select * from city where countrycode like 'ESP' and district like 'Aragonia'");
			
			//st2.execute();
			
			ResultSet results = st.executeQuery();
			
			while(results.next()) {
				
				System.out.println("Ciudad: " + results.getString("Name"));
				System.out.println("Region: " + results.getString("District"));
				
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}

}
