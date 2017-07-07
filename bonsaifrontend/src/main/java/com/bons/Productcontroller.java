package com.bons;

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
	ProductDao productdao;
		
	@Autowired	
	CategoryDao categorydao;
	
	@RequestMapping("/Product")
	public String showProduct(Model m) {

		Modproduct product = new Modproduct();

		m.addAttribute("catlist", this.getCatList());
		m.addAttribute("product", product);

		List<Modproduct> prolist = productdao.proList();
		m.addAttribute("list", prolist);

		return "Product";
	}

	@RequestMapping(value = "/InsertProduct", method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Modproduct product, Model m) {
		System.out.println("---Product Inserted---");
		productdao.insertproduct(product);

		List<Modproduct> prodlist = productdao.proList();
		m.addAttribute("prodlist", prodlist);

		return "Product";
	}

		@RequestMapping(value = "/updateProduct/{prodid}")
	public String updateProduct(@PathVariable("prodid") int prodid, Model m) {

		Modproduct product = productdao.getproduct(prodid);
		m.addAttribute("product", product);
		m.addAttribute("catlist", this.getCatList());
		List<Modproduct> prodlist = productdao.proList();
		m.addAttribute("prodlist", prodlist);

		return "redirect:/Product";
	}

	@RequestMapping(value = "/deleteProduct/{prodid}")
	public String deleteProduct(@PathVariable("prodid") int prodid, Model m) {

		Modproduct product = productdao.getproduct(prodid);
		productdao.delete(product);

		Modproduct product1 = new Modproduct();
		m.addAttribute("product", product1);
		m.addAttribute("catlist", this.getCatList());
		List<Modproduct> prodlist = productdao.proList();
		m.addAttribute("prodlist", prodlist);

		return "product";
	}

	public LinkedHashMap<Integer, String> getCatList() {
		List<ModCategory> list = categorydao.catList();

		LinkedHashMap<Integer, String> catlist = new LinkedHashMap<Integer, String>();

		for (ModCategory cat : list) {
			catlist.put(cat.getCatid(), cat.getCatname());
		}

		return catlist;
	}
}

