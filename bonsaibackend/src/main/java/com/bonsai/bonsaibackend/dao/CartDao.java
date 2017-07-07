package com.bonsai.bonsaibackend.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bonsai.bonsaibackend.model.Cart;
import com.bonsai.bonsaibackend.model.Modproduct;
@Repository("cartdao")
public class CartDao {
@Autowired
SessionFactory sessionfactory;
	public CartDao(SessionFactory sessionfactory) {
		// TODO Auto-generated constructor stub
		this.sessionfactory=sessionfactory;
	}
	@Transactional
	public  void insert(Cart cart)
{
	sessionfactory.getCurrentSession().saveOrUpdate(cart);
}
}