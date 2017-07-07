package com.Bonsai.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bonsai.backend.model.Modsupplier;


@Repository()
public class SupplierDao {
	@Autowired
	SessionFactory sessionfactory;

	public SupplierDao(SessionFactory sessionfactory) {

		this.sessionfactory = sessionfactory;
	}

	@Transactional
	public void insertsupplier(Modsupplier modsupplier) {
		sessionfactory.getCurrentSession().saveOrUpdate(modsupplier);
		System.out.println("supplier added");
	}

	@Transactional
	public Modsupplier modsupplier(int supid) {
		Session session = sessionfactory.openSession();
		Modsupplier modsupplier = (Modsupplier) session.get("Modsupplier.class", supid);
		return modsupplier;

	}

	public void delete(Modsupplier modsupplier) {
		sessionfactory.getCurrentSession().delete(modsupplier);
		System.out.println("deleted");
	}

	@Transactional
	public List<Modsupplier> supList() {
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from ModCategory");
		List<com.Bonsai.backend.model.Modsupplier> list = query.list();
		session.close();
		return list;

	}
}