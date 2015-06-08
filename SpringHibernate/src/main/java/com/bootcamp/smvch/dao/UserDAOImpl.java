package com.bootcamp.smvch.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bootcamp.smvch.config.HibernateUtil;
import com.bootcamp.smvch.model.Address;
import com.bootcamp.smvch.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public User getUserLogin(String email, String password) {
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("test");
		return null;
	}

	public String saveUser(User user, Address addr) {
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("test");
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		return null;
	}

}
