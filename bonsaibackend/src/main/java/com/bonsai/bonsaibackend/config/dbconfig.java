package com.bonsai.bonsaibackend.config;

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

import com.bonsai.bonsaibackend.dao.CategoryDao;
import com.bonsai.bonsaibackend.dao.ProductDao;
import com.bonsai.bonsaibackend.dao.SupplierDao;
import com.bonsai.bonsaibackend.model.ModCategory;
import com.bonsai.bonsaibackend.model.Modproduct;
import com.bonsai.bonsaibackend.model.Modsupplier;

@Configuration
@ComponentScan("com.bonsai.bonsaibackend")
@EnableTransactionManagement
public class dbconfig {

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
	public SessionFactory getSessionFactory(DataSource datasource) {
		System.out.println("sessionfactory obj creation");
		LocalSessionFactoryBuilder sessionbuilder = new LocalSessionFactoryBuilder(datasource);
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
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionfactory) {
		System.out.println("im in trans");
		HibernateTransactionManager transaction = new HibernateTransactionManager(sessionfactory);
		System.out.println("trans created");
		return transaction;
	}

	@Autowired
	@Bean("categorydao")
	public CategoryDao getcategorydao(SessionFactory sessionfactory) {
		System.out.println("im in category dao config");
		CategoryDao categorydao = new CategoryDao(sessionfactory);
		System.out.println("category dao created");
		return categorydao;
	}

	@Autowired
	@Bean("productdao")
	public ProductDao getproductdao(SessionFactory sessionfactory) {
		System.out.println("im in  product dao config");
		ProductDao productdao = new ProductDao(sessionfactory);
		System.out.println("obj for product dao is created");
		return productdao;

	}
	@Autowired
	@Bean("supplierdao")
	 SupplierDao supplierdao(SessionFactory sessionfactory)
	{
		System.out.println("im in supplier comnfig");
	SupplierDao supplierdao=new SupplierDao(sessionfactory);
	return supplierdao;
	
	}
}
