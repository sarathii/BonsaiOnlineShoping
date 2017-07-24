package com.Bonsai.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bonsai.backend.model.Modproduct;
import com.Bonsai.backend.model.UserDetail;
@Repository
public class RegisterDao {
	@Autowired
SessionFactory sessionFactory;
	public RegisterDao (SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public void insertuser(UserDetail userDetail) {
		System.out.println("im in insertion method");
		sessionFactory.getCurrentSession().saveOrUpdate(userDetail);
		System.out.println("inserted");
	}


}
