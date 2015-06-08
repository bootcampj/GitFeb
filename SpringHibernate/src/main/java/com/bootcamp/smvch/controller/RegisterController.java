package com.bootcamp.smvch.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bootcamp.smvch.model.Address;
import com.bootcamp.smvch.model.User;
import com.bootcamp.smvch.service.UserServiceImpl;

@Controller
public class RegisterController {
	
	private UserServiceImpl userServiceImpl;
	
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	@RequestMapping("/register.do")
	public String regiser(){
		return "register";
	}
	
	@RequestMapping("/register")
	public ModelAndView getRegister(User user, Address addr){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		String reg_date = sdf.format(cal.getTime()).toString();
		user.setReg_date(reg_date);
		user.setAddress(addr);
		addr.setUser(user);
		userServiceImpl.saveUser(user, addr);
		return new ModelAndView();
	}
}
