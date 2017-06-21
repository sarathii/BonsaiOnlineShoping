package com.bonsai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class showlogin {
	@RequestMapping("/login")
	public String login(){
		system.out.println("im in controller");
		return  "login";
		system.out.println("im in controller");
		}

}
