package com.bonsai.bonsaibackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bonsai.bonsaibackend.model.ModCategory;
import com.bonsai.bonsaibackend.model.Modproduct;

@Repository("productdao")
public class ProductDao {
	@Autowired
	SessionFactory sessionfactory;

	public ProductDao(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Transactional
	public void insertproduct(Modproduct product) {
		System.out.println("im in insertion method");
		sessionfactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("inserted");
	}

	@Transactional
	public Modproduct getproduct(int pid) {
		Session session = sessionfactory.openSession();
		Modproduct product = (Modproduct) session.get(Modproduct.class, pid);
		return product;
	}
@Transactional
public void delete(Modproduct product)
{
	sessionfactory.getCurrentSession().delete(product);
	System.out.println("deleted");
	}
@Transactional
public List<Modproduct> proList() {
	Session session = sessionfactory.openSession();
	Query query=session.createQuery("from Modproduct");
	List<Modproduct> list=query.list();
	session.close();
	return list;
}
}