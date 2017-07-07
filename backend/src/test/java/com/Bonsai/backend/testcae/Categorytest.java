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
			CategoryDao categorydao = (CategoryDao)context.getBean("categorydao");
			
			System.out.println("model cls obj creation");
			/*ModCategory modcategory = new ModCategory();
			System.out.println("model class obj created");
			// insertion
			modcategory.setCatname("mangotree");
			
			modcategory.setCatdscrptn("mango tree imported");
			categorydao.insertcategory(modcategory);
			ModCategory modcategory=(ModCategory)categorydao.getcategory(33);
	System.out.println(modcategory.getCatname());
			System.out.println(modcategory.getCatdscrptn());
			System.out.println("showing data");
			categorydao.deletecategory(modcategory); 
			System.out.println("update process");
		modcategory.setCatname("orangebonsai");
			modcategory.setCatdscrptn("smallfruits");
			categorydao.insertcategory(modcategory);*/
			List<ModCategory> list=categorydao.catList();
				
				for(ModCategory modcategory:list)
				{
					System.out.println("catid" + ":" + modcategory.getCatid() +"name :"+ modcategory.getCatname()+"discription :"+ modcategory.getCatdscrptn());
				}
				
			((AnnotationConfigApplicationContext)context).close();

			
		}
	}

