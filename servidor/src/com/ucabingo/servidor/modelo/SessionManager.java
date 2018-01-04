package com.ucabingo.servidor.modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager {
	
	private Session session;
	
	public SessionManager() {
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}
	
	public Session getSession() {
		
		return session;
	}

	

}
