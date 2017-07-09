package com.Bonsai.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bonsai.backend.model.Modproduct;

@Repository("productDao")
public class ProductDao {

	@Autowired
	SessionFactory sessionFactory;

	public ProductDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public void insertproduct(Modproduct product) {
		System.out.println("im in insertion method");
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("inserted");
	}


	@Transactional
	public Modproduct getproduct(int pid) {
		Session session = sessionFactory.openSession();
		Modproduct product = (Modproduct) session.get(Modproduct.class, pid);
		return product;
	}

	@Transactional
	public void delete(Modproduct product) {
		sessionFactory.getCurrentSession().delete(product);
		System.out.println("deleted");
	}


	@Transactional
	public List<Modproduct> proList() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Modproduct");
		List<Modproduct> list = query.list();
		session.close();
		return list;
	}
}
