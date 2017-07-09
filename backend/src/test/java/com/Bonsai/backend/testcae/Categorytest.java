package com.Bonsai.backend.testcae;


	import java.util.List;

	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Bonsai.backend.dao.CategoryDao;
import com.Bonsai.backend.model.ModCategory;



	public class Categorytest {
		public static void main(String args[]) {
			System.out.println("context creation");
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.bonsai.backend");
			System.out.println("scanned");
			context.refresh();
			System.out.println("refreshed");
			// inserting category object
			CategoryDao categoryDao = (CategoryDao)context.getBean("categoryDao");
			
			System.out.println("model cls obj creation");
			/*modCategory modCategory = new modCategory();
			System.out.println("model class obj created");
			// insertion
			modCategory.setCatname("mangotree");
			
			modCategory.setCatdscrptn("mango tree imported");
			categoryDao.insertcategory(modCategory);
			modCategory modCategory=(modCategory)categoryDao.getcategory(33);
	System.out.println(modCategory.getCatname());
			System.out.println(modCategory.getCatdscrptn());
			System.out.println("showing data");
			categorydao.deletecategory(modCategory); 
			System.out.println("update process");
		modCategory.setCatname("orangebonsai");
			modCategory.setCatdscrptn("smallfruits");
			categorydao.insertcategory(modCategory);*/
			List<ModCategory> list=categoryDao.catList();
				
				for(ModCategory modCategory:list)
				{
					System.out.println("catid" + ":" + modCategory.getCatid() +"name :"+ modCategory.getCatname()+"discription :"+ modCategory.getCatdscrptn());
				}
				
			((AnnotationConfigApplicationContext)context).close();

			
		}
	}

