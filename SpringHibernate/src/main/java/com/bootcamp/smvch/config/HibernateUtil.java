package com.bootcamp.smvch.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	public static SessionFactory buildSessionFactory() {

		try {
			// create sessionfactory from hibernate.cfg.xml file
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(builder.build());

		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
		return sessionFactory;

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
