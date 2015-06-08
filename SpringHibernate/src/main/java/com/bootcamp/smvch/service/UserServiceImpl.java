package com.bootcamp.smvch.service;

import com.bootcamp.smvch.dao.UserDAOImpl;
import com.bootcamp.smvch.model.Address;
import com.bootcamp.smvch.model.User;

public class UserServiceImpl implements UserService{

	private UserDAOImpl userDAOImpl;
	
	public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}
	
	@Override
	public User getUserLogin(String email, String password) {
		return userDAOImpl.getUserLogin(email, password);
	}
	
	@Override
	public String saveUser(User user, Address addr) {
		return userDAOImpl.saveUser(user, addr);
	}

}
