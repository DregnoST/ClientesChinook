package dbEmbebidaSqlite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesDb {

	
	public void insertaArtist(Artista artista) {
		
		ConectorDB con = new ConectorDB();
		
		con.establecerConexion(); //Si se conecta bien, veremos un mensaje que diga que se ha conectado, o nos avise en caso contrario
		
		try {
			PreparedStatement st = con.conector.prepareStatement("insert into artists(name) values (?)");
				st.setString(1, artista.getName());
				st.execute();
			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		con.close();
	}
	
	
	public void listaArtistas() {
		
		ConectorDB con = new ConectorDB();
		
		con.establecerConexion(); //Si se conecta bien, veremos un mensaje que diga que se ha conectado, o nos avise en caso contrario
		
		try {
			PreparedStatement st = con.conector.prepareStatement("select * from artists");
			
			ResultSet resultado = null;
			resultado = st.executeQuery();
            while (resultado.next()) {
            	System.out.println("Id: "+resultado.getInt("ArtistId"));
            	System.out.println("Nombre: "+resultado.getString("Name"));
            	System.out.println("---------------------------");
            }
            } catch (SQLException ex) {
            	ex.printStackTrace();
            }
		
	}
	
	public void cancionArtista(Artista artista, String titulo) {
		
			
			
			ConectorDB con = new ConectorDB();
			
			con.establecerConexion(); //Si se conecta bien, veremos un mensaje que diga que se ha conectado, o nos avise en caso contrario
						
			try {
				
				PreparedStatement st = con.conector.prepareStatement("SELECT a.title FROM albums a INNER JOIN Artists ar on a.ArtistId = ar.ArtistId WHERE ar.Name LIKE '%" + titulo  + "%'");
				//st.setString(1, "'%" + titulo  + "%'");
					
				ResultSet resultado = null;
				resultado = st.executeQuery();
				
		        while (resultado.next()) {
		            System.out.println("Nombre grupo: "+resultado.getString("title"));	
		        }
				
				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			
			con.close();
		}
	
		public void cancionAlbum(Artista artista, String album) {
		
				ConectorDB con = new ConectorDB();
				
				con.establecerConexion(); //Si se conecta bien, veremos un mensaje que diga que se ha conectado, o nos avise en caso contrario
				
				try {
					PreparedStatement st = con.conector.prepareStatement("SELECT t.Name, t.Milliseconds FROM tracks t INNER JOIN Albums al on al.Albumid = t.Albumid WHERE al.Title LIKE '%" + album  + "%'");
					
					ResultSet resultado = null;
					resultado = st.executeQuery();
		            while (resultado.next()) {
		            	System.out.println("Nombre: "+resultado.getString("Name"));
		            	System.out.println("Duracion: "+ Utiles.darMinutos(resultado.getString("Milliseconds")) + " minutos " + Utiles.darSegundos(resultado.getString("Milliseconds")) + " segundos");
		            	System.out.println("---------------------------------------");
		            	
		            }
		            } catch (SQLException ex) {
		            	ex.printStackTrace();
		            }
		
		}
		
		public void primeraCancionAlbum(Artista artista, String album) {
			
			ConectorDB con = new ConectorDB();
			
			con.establecerConexion(); //Si se conecta bien, veremos un mensaje que diga que se ha conectado, o nos avise en caso contrario
			
			try {
				PreparedStatement st = con.conector.prepareStatement("SELECT t.Name, t.Milliseconds, t.albumid FROM tracks t INNER JOIN Albums al on al.Albumid = t.Albumid WHERE al.Title LIKE '%" + album  + "%'");
				
				ResultSet resultado = null;
				resultado = st.executeQuery();
	            while (resultado.next()) {
	            	System.out.println("Nombre: "+resultado.getString("Name"));
	            	System.out.println("Duracion: "+ Utiles.darMinutos(resultado.getString("Milliseconds")) + " minutos " + Utiles.darSegundos(resultado.getString("Milliseconds")) + " segundos");
	            	System.out.println("ID album: "+resultado.getInt("albumid"));
	            	System.out.println("---------------------------------------");
	            	break;
	            	
	            }
	            } catch (SQLException ex) {
	            	ex.printStackTrace();
	            }
	
	}
	
	
}
