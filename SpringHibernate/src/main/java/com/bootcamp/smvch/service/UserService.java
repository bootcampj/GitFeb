package com.bootcamp.smvch.service;

import com.bootcamp.smvch.model.Address;
import com.bootcamp.smvch.model.User;

public interface UserService {
	
	User getUserLogin(String email, String password);
	String saveUser(User user, Address addr);
}
