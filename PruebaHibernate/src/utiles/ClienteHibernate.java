package utiles;

import java.util.List;

import org.hibernate.Session;
import modelos.Equipos;
import modelos.Jugadores;


public class ClienteHibernate {

	public static void main(String[] args) {

		new ClienteHibernate();
		
		
	}
	
	public ClienteHibernate() {
		listarEquipos();
		//listarJugadores();
	}
	
	private List<Equipos> listarEquipos(){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Equipos> result = (List<Equipos>)session.createQuery("from Equipos").list();
		session.getTransaction().commit();
		
		for (Equipos equipo : result) {
			System.out.println("Equipo: " + equipo.toString());
		}
		
		return result;
	}
	
	private List<Jugadores> listarJugadores(){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Jugadores> result = (List<Jugadores>)session.createQuery("from Jugadores").list();
		session.getTransaction().commit();
		
		for (Jugadores jugador : result) {
			System.out.println("Jugador: " + jugador.toString());
		}
		
		return result;
	}

}
