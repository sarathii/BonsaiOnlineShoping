package com.Bonsai.backend.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Bonsai.backend.dao.CategoryDao;
import com.Bonsai.backend.dao.ProductDao;
import com.Bonsai.backend.dao.SupplierDao;
import com.Bonsai.backend.model.*;


@Configuration
@ComponentScan("com.bonsai.bonsaibackend")
@EnableTransactionManagement
public class Dbconfig {
	@Autowired
	@Bean("datasource")
	public DataSource getdatasource() {
		System.out.println("datasource obj creation");
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/test");
		datasource.setUsername("sa");
		datasource.setPassword("");
		System.out.println("datasource created");
		return datasource;

	}

	@Autowired
	@Bean("sessionfactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		System.out.println("sessionfactory obj creation");
		LocalSessionFactoryBuilder sessionbuilder = new LocalSessionFactoryBuilder(dataSource);
		System.out.println("property creation");
		Properties pro = new Properties();
		pro.setProperty("hibernate.hbm2ddl.auto", "update");
		pro.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		pro.put("hibernate.show_sql", "true");
		sessionbuilder.addProperties(pro);
		System.out.println("properties added");
		sessionbuilder.addAnnotatedClass(ModCategory.class);
		sessionbuilder.addAnnotatedClass(Modproduct.class);
		sessionbuilder.addAnnotatedClass(Modsupplier.class);
		System.out.println("mapped");
		SessionFactory sessionfactory = sessionbuilder.buildSessionFactory();
		System.out.println("sessionfactory object created");
		return sessionfactory;
	}

	@Autowired
	@Bean("transaction")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("im in trans");
		HibernateTransactionManager transaction = new HibernateTransactionManager(sessionFactory);
		System.out.println("trans created");
		return transaction;
	}

	@Autowired
	@Bean("categoryDao")
	public CategoryDao getcategorydao(SessionFactory sessionFactory) {
		System.out.println("im in category dao config");
		CategoryDao categorydao = new CategoryDao(sessionFactory);
		System.out.println("category dao created");
		return categorydao;
	}

	@Autowired
	@Bean("productDao")
	public ProductDao getProductDao(SessionFactory sessionFactory) {
		System.out.println("im in  product dao config");
		ProductDao productDao = new ProductDao(sessionFactory);
		System.out.println("obj for product dao is created");
		return productDao;

	}
	@Autowired
	@Bean("supplierDao")
	 SupplierDao supplierDao(SessionFactory sessionFactory)
	{
		System.out.println("im in supplier comnfig");
	SupplierDao supplierDao=new SupplierDao(sessionFactory);
	return supplierDao;
	
	}
}