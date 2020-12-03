package utiles;

import java.io.File;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure(new File(".//src//hibernate.cfg.xml")).buildSessionFactory();
		} catch (Throwable ex) {
			System.out.println("Ha fallado la creacion de SesionFactory: " + ex);
			throw new ExceptionInInitializerError(ex); 
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
