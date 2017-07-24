package com.Bonsai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Bonsai.backend.dao.CategoryDao;
import com.Bonsai.backend.model.ModCategory;


@Controller
public class CategoryController 
{

	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping("/Category")
	public String showCategoryPage(Model m)
	{
		System.out.println("---Category Page Displaying-----");
		List<ModCategory> list=categoryDao.catList();
		m.addAttribute("catdetail",list);
		
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		return "Category";
	}
	
	@RequestMapping(value="/AddCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catname") String catname,@RequestParam("catdscrptn") String catdesc,Model m)
	{
		System.out.println("---Add Category Starting-----");
		
		System.out.println(catname+":::"+catdesc);
		
		ModCategory modcategory=new ModCategory();
		modcategory.setCatname(catname);
		modcategory.setCatdscrptn(catdesc);
		
		categoryDao.insertcategory(modcategory);
		
		List<ModCategory> list=categoryDao.catList();
		m.addAttribute("catdetail",list);
		
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		System.out.println("---Category Added----");
		return "Category";
	}
	
	@RequestMapping(value="/deleteCategory/{catid}")
	public String deleteCategory(@PathVariable("catid") int catid,Model m)
	{
		System.out.println("---Category Deleted----");
		ModCategory category=categoryDao.getcategory(catid);
		categoryDao.deletecategory(category);
		
		List<ModCategory> list=categoryDao.catList();
		m.addAttribute("catdetail",list);
		
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		return "Category";
	}
	
	@RequestMapping(value="/updateCategory/{catid}")
	public String getUpdateCategory(@PathVariable("catid") int catid,Model m)
	{
		System.out.println("--- Getting Category Object to be Updated ---");
		
		ModCategory modcategory=categoryDao.getcategory(catid);
		m.addAttribute("category",modcategory);
		categoryDao.insertcategory(modcategory);
		List<ModCategory> list=categoryDao.catList();
		m.addAttribute("catdetail",list);
		
		boolean flag=true;
		m.addAttribute("flag",flag);
		
		return "AddCategory";
	}
	
	@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestParam("catid") int catid,@RequestParam("catname") String catname,@RequestParam("catdscrptn") String catdesc,Model m)
	{
		System.out.println("--Updating the Category----");

		ModCategory category=new ModCategory();
		category.setCatid(catid);
		category.setCatname(catname);
		category.setCatdscrptn(catdesc);
		
	
		
		List<ModCategory> list=categoryDao.catList();
		m.addAttribute("catdetail",list);
		
		boolean flag=false;
		m.addAttribute("flag",flag);
		
		return "updateCategory";
	}
	
}
