package com.Bonsai.backend.testcae;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Bonsai.backend.dao.RegisterDao;
import com.Bonsai.backend.model.UserDetail;

public class RegisterTest {
	public static void main(String args[])
	{
	System.out.println("context creation");
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.scan("com.bonsai.backend");
	System.out.println("scanned");
	context.refresh();
	System.out.println("refreshed");
	RegisterDao registerDao =(RegisterDao)context.getBean("registerDao");
	UserDetail userDetail=new UserDetail();
	userDetail.setUsername("pri");

	userDetail.setPassword("456");
	userDetail.setAdrs("kerala");
	userDetail.setRole("ROLE_USER");
	userDetail.setEnabled("true");
	registerDao.insertuser(userDetail);
}
}