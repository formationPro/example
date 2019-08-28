package fr.formation.inti.service;

import fr.formation.inti.dao.UserDaoImpl;
import fr.formation.inti.entities.User;

public class UserService {
	
	private static UserDaoImpl dao;
	
	public UserService() {
		dao = new UserDaoImpl();
	}
	
//	public User authenticate(String login,String password) {
//		User user = dao.authenticate(login, password);
//		return user;
//	}
}
