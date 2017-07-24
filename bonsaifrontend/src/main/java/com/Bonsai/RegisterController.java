package com.Bonsai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Bonsai.backend.dao.RegisterDao;
import com.Bonsai.backend.model.UserDetail;

@Controller
public class RegisterController {
	@Autowired
	RegisterDao registerDao;
	@RequestMapping(value="/reg",method=RequestMethod.POST)
public String insert(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("adrs") String adrs )
{
		UserDetail userDetail=new UserDetail();
		userDetail.setUsername(username);
		userDetail.setAdrs(adrs);
	
		userDetail.setPassword(password);
		userDetail.setEnabled("TRUE");
		userDetail.setRole("ROLE_USER");
		
		registerDao.insertuser(userDetail);
		System.out.println("registered");
		
		return"login";
		
}
}