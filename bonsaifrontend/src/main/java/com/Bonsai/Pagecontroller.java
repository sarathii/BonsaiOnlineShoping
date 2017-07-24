package com.Bonsai;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {

	@RequestMapping("/")
	public String show() {
		return "home";
	}
	


	@RequestMapping("/login")
	public String log() {
		return "login";
	}

	@RequestMapping("/Register")
	public String reg() {
		return "Register";
	}
	
	@RequestMapping("/home")
	public String gethome()
	{
		return "home";
	}
}
