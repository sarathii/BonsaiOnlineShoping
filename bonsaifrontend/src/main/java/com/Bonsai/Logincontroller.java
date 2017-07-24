package com.Bonsai;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Bonsai.backend.dao.ProductDao;
import com.Bonsai.backend.model.Modproduct;

@Controller
public class Logincontroller {

	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/login_success")
	public String loginSuccess(HttpSession session,Model m)
	{
		System.out.println("login success");
		
String page=null;
		
		boolean loggedIn=true;
		
		//Retrieving the username
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		session.setAttribute("username",username);
		session.setAttribute("loggedIn",loggedIn);
		
		//Retrieving the Role
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		
		for(GrantedAuthority role:authorities)
		{
			System.out.println("Role:"+role.getAuthority()+" User Name:"+username);
			if(role.getAuthority().equals("ROLE_ADMIN"))
			{
				page= "show product";
			}
			else
			{
				List<Modproduct> prolist=productDao.proList();
				m.addAttribute("prolist",prolist);
				
				page= "user";
			}
		}
		
	return page;
	}
	
}






