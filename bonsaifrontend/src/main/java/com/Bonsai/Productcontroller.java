package com.Bonsai;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bonsai.backend.dao.CategoryDao;
import com.Bonsai.backend.dao.ProductDao;
import com.Bonsai.backend.model.ModCategory;
import com.Bonsai.backend.model.Modproduct;





@Controller
public class Productcontroller {

	@Autowired
	ProductDao productDao;

	@Autowired
	CategoryDao categoryDao;

	@RequestMapping("/Product")
	public String showProduct(Model m) {

		Modproduct product = new Modproduct();

		m.addAttribute("catlist", this.getCatList());
		m.addAttribute("product", product);

		List<Modproduct> prolist = productDao.proList();
		m.addAttribute("list", prolist);

		return "adminhome";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Modproduct product, Model m) {
		System.out.println("---Product Inserted---");
		productDao.insertproduct(product);

		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);

		return "adminhome";
	}

	@RequestMapping(value = "/updateProduct/{pid}")
	public String updateProduct(@PathVariable("pid") int pid, Model m) {

		Modproduct product = productDao.getproduct(pid);
		m.addAttribute("product", product);
		m.addAttribute("catlist", this.getCatList());
		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);

		return "redirect:/adminhome";
	}

	@RequestMapping(value = "/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("prodid") int prodid, Model m) {

		Modproduct product = productDao.getproduct(prodid);
		productDao.delete(product);

		Modproduct product1 = new Modproduct();
		m.addAttribute("product", product1);
		m.addAttribute("catlist", this.getCatList());
		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);

		return "adminhome";
	}

	public LinkedHashMap<Integer, String> getCatList() {
		List<ModCategory> list = categoryDao.catList();

		LinkedHashMap<Integer, String> catlist = new LinkedHashMap<Integer, String>();

		for (ModCategory cat : list) {
			catlist.put(cat.getCatid(), cat.getCatname());
		}

		return catlist;
	}

}
