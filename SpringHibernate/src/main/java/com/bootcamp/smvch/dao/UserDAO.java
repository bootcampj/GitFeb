package com.bootcamp.smvch.dao;

import com.bootcamp.smvch.model.User;

public interface UserDAO {
	
	User getUserLogin(String email, String password);

}
