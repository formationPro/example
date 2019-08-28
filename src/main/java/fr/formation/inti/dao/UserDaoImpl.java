package fr.formation.inti.dao;

import org.hibernate.Query;

import fr.formation.inti.entities.User;

public class UserDaoImpl extends GenericDaoImpl<User, Integer>{	
//	public User authenticate(String login, String password) {
//		Query q = getCurrentSession().createQuery("from User where login =:x and password=:y");
//		q.setParameter("x", login);
//		q.setParameter("y", password);
//		
//		return (User)q.uniqueResult();
//	}

}
