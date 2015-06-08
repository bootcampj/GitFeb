package com.bootcamp.smvch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bootcamp.smvch.service.UserServiceImpl;

@Controller
public class LoginController {

	private UserServiceImpl userServiceImpl;
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	
	@RequestMapping("/login.do")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView getLogin(String email, String password){
		userServiceImpl.getUserLogin(email, password);
		return new ModelAndView();
	}
}
