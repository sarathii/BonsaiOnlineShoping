package com.bons;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {

	@RequestMapping("/")
	public String show() {
		return "index";
	}
	



	@RequestMapping("/Category")
	public String cat() {

		return "Category";
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
