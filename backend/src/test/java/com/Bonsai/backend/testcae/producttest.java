package com.Bonsai.backend.testcae;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Bonsai.backend.dao.ProductDao;
import com.Bonsai.backend.model.Modproduct;



public class producttest {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.bonsai.backend");
		context.refresh();
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		// Modproduct product=new Modproduct();
		/*
		 * product.setPname("bonsai"); product.setPdscrptn("tree will be short"
		 * ); product.setPrice(5000); product.setQuantity(1);
		 * product.setSupid(111); product.setCatid(600);
		 * productdao.insertproduct(product); System.out.println("inserted");
		 * product.getPname(); product.getCatid(); product.getPdscrptn();
		 * product.getPrice(); product.getQuantity(); product.getSupid();
		 */
		Modproduct product = (Modproduct) productDao.getproduct(0);
		List<Modproduct> list = productDao.proList();

		for (Modproduct productli : list) {
			System.out.println("productid" + ":" + productli.getCatid() + "name :" + productli.getPname());
		}
		productDao.delete(product);
		((AnnotationConfigApplicationContext) context).close();
	}
}
