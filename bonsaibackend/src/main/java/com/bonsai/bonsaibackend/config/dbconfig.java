package com.bonsai.bonsaibackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bonsai.bonsaibackend.dao.CartDao;
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
	
	@Autowired
	@Bean("dataSource")
	public DataSource getDataSource() {
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
	@Bean("sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		System.out.println("sessionfactory obj creation");
		
		System.out.println("property creation");
		Properties pro = new Properties();
		pro.setProperty("hibernate.hbm2ddl.auto", "update");
		pro.put("hibernate.show_sql", "true"); 
		pro.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		
		
		LocalSessionFactoryBuilder sessionbuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionbuilder.addProperties(pro);
		sessionbuilder.scanPackages("com.bonsai.bonsaibackend");
		
		System.out.println("mapped");
		
		System.out.println("properties added");
		
		SessionFactory sessionfactory=sessionbuilder.buildSessionFactory();
		System.out.println("Session Factory Object Created");
		return sessionfactory;
	}

	@Autowired
	@Bean("transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("im in trans");
		HibernateTransactionManager transaction = new HibernateTransactionManager(sessionFactory);
		System.out.println("trans created");
		return transaction;
	}

}
