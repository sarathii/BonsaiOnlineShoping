package com.bonsai.bonsaibackend.categorytestcase;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bonsai.bonsaibackend.dao.SupplierDao;
import com.bonsai.bonsaibackend.model.ModCategory;
import com.bonsai.bonsaibackend.model.Modsupplier;

public class Supliertest {
	public static void main(String args[])
	{
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.bonsai.bonsaibackend");
	context.refresh();
	
	SupplierDao supplierdao=(SupplierDao)context.getBean("supplierdao");
	Modsupplier modsupplier=new Modsupplier();
	modsupplier.setSupname("jo");
	modsupplier.setSupadress("kerala");
	supplierdao.insertsupplier(modsupplier);
	supplierdao.delete(modsupplier);
	
	List<Modsupplier> list=supplierdao.supList();
	
	for(Modsupplier supplier:list)
	{
		System.out.println("suppllierid" + ":" + supplier.getSupid() +"name :"+ supplier.getSupname()+"address :"+ supplier.getSupadress());
	}
	((AnnotationConfigApplicationContext)context).close();
	
	
	}

}
