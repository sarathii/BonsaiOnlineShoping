package com.Bonsai.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bonsai.backend.model.ModCategory;

@Repository("categoryDao")
public class CategoryDao {
	@Autowired
	SessionFactory sessionFactory;

	public CategoryDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Transactional
	public void insertcategory(ModCategory modCategory) {
		System.out.println("it is in insertion method");
		sessionFactory.getCurrentSession().saveOrUpdate(modCategory);

		System.out.println("getcurrentsession invoked");

		System.out.println("inserted ");
	}

	@Transactional
	public ModCategory getcategory(int catid) {
		Session session = sessionFactory.openSession();

		ModCategory modCategory = (ModCategory) session.get(ModCategory.class, catid);
		session.close();
		System.out.println("displayed ");
		return modCategory;

	}

	@Transactional
	public void updatecategory(ModCategory modcategory) {
		sessionFactory.getCurrentSession().update(modcategory);
		System.out.println("updated ");
		// session.update(modCategory);
	}

	@Transactional
	public void deletecategory(ModCategory modCategory) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(modCategory);
		System.out.println("deleted");
	}

	@Transactional
	public List<ModCategory> catList() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ModCategory");
		List<ModCategory> list = query.list();
		session.close();
		return list;

	}

}
