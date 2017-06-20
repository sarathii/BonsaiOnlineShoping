package com.bonsai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showlogin {
	@RequestMapping("/login")
	public String login(){
		return  "login";
		system.out.println("im in controller");
		}

}
