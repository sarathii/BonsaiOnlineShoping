package com.Bonsai.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.Bonsai.backend.model.Cart;


public class CartDao {
	@Autowired
SessionFactory sessionFactory;

	public CartDao(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory=sessionFactory;
	}


@Transactional
public void insertcart(Cart cart) {
	System.out.println("it is in insertion method");
	sessionFactory.getCurrentSession().saveOrUpdate(cart);

	System.out.println("getcurrentsession invoked");

	System.out.println("inserted ");
}

@Transactional
public Cart getcart(int catid) {
	Session session = sessionFactory.openSession();

	Cart cart = (Cart) session.get(Cart.class, catid);
	session.close();
	System.out.println("displayed ");
	return cart;

}

@Transactional
public void updatecart(Cart cart) {
	sessionFactory.getCurrentSession().update(cart);
	System.out.println("updated ");
	// session.update(modCategory);
}

@Transactional
public void deletecategory(Cart cart) {
	Session session = sessionFactory.getCurrentSession();
	session.delete(cart);
	System.out.println("deleted");
}

@Transactional
public List<Cart> catList() {
	Session session = sessionFactory.openSession();
	Query query = session.createQuery("from ModCategory");
	List<Cart> list = query.list();
	session.close();
	return list;

}
}
