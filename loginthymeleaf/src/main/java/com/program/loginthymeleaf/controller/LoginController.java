package com.program.loginthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.program.loginthymeleaf.model.LoginForm;

@RestController
@ComponentScan
@Service
public class LoginController {
	
  
	
	@RequestMapping("/login")
	public String getLoginForm()
	{
		String s = "Accepted";
		return s;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestBody LoginForm loginForm)
	{
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		String l = "admin";
		String p = "admin";
		
		if(l.equals(username) && p.equals(password))
		{
			return "yes";
		}
		
		else
		{
		
		
		return "Invalid";
		}
	}

}
