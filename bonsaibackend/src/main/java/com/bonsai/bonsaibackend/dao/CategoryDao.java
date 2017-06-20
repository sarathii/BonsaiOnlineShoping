package com.bonsai.bonsaibackend.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bonsai.bonsaibackend.model.ModCategory;


@Repository("categorydao")
public class CategoryDao {
	@Autowired
	SessionFactory sessionfactory;

	public CategoryDao(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;

	}

	@Transactional
	public void insertcategory(ModCategory modcategory) {
		System.out.println("it is in insertion method");
		sessionfactory.getCurrentSession().saveOrUpdate(modcategory);
		

		System.out.println("getcurrentsession invoked");

		System.out.println("inserted ");
	}

	@Transactional
	public ModCategory getcategory(int catid) {
		Session session = sessionfactory.openSession();
		
		ModCategory modcategory = (ModCategory) session.get(ModCategory.class, catid);
		session.close();
		System.out.println("displayed ");
		return modcategory;
		


		
	}
/*	@Transactional
public void updatecategory(ModCategory modcategory)
{
	sessionfactory.getCurrentSession().update(modcategory);
	System.out.println("updated ");
	//session.update(modcategory);
}*/
	@Transactional
	public void deletecategory(ModCategory modcategory) {
		Session session =sessionfactory.getCurrentSession();
session.delete(modcategory);
System.out.println("deleted");
	}
	@Transactional
 public List<ModCategory> catList() {
	Session session = sessionfactory.openSession();
	Query query=session.createQuery("from ModCategory");
	List<ModCategory> list=query.list();
	session.close();
	return list;
	
}

}