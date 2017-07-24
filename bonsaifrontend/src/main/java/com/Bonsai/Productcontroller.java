package com.Bonsai;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Bonsai.backend.dao.CartDao;
import com.Bonsai.backend.dao.CategoryDao;
import com.Bonsai.backend.dao.ProductDao;
import com.Bonsai.backend.model.Cart;
import com.Bonsai.backend.model.ModCategory;
import com.Bonsai.backend.model.Modproduct;

@Controller
public class Productcontroller {

	@Autowired
	ProductDao productDao;

	@Autowired
	CategoryDao categoryDao;
	@Autowired
	CartDao cartdao;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/adminhome")
	public String showProduct(Model m) {

		Modproduct modproduct = new Modproduct();

		m.addAttribute("catlist", this.getCatList());
		m.addAttribute("product", modproduct);

		List<Modproduct> prolist = productDao.proList();
		m.addAttribute("list", prolist);

		return "adminhome";
	}

	@RequestMapping("/show product")
	public String shw(Model m) {

		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);
		return "show product";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Modproduct product, Model m,
			@RequestParam("pimage") MultipartFile filedet, BindingResult result) {

		System.out.println("---Product Inserted---");

		productDao.insertproduct(product);
		// System.out.println("----------------------Product Controller
		// reached----------------------");
		System.out.println("Product : " + product.getPname());

		if (!product.getPimage().isEmpty()) {
			try {

				String imagePath = request.getServletContext().getRealPath("/resources/images/products");
				System.out.println("------- Context Path set -------");
				File dir = new File(imagePath + File.separator);
				System.out.println("------- Directory set to" + dir + "-------");
				if (!dir.exists())
					dir.mkdirs();
				String orgName = product.getPname();
				String filePath = imagePath + File.separator + orgName + ".jpg";
				File dest = new File(filePath);
				System.out.println("------- Image uploaded to " + dest + "-------");
				product.getPimage().transferTo(dest);

			} catch (Exception e) {
				System.out.println("You failed to upload " + product.getPname() + " => " + e.getMessage());
			}
		} else {
			System.out.println("Upload Failed");
		}

		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);
		return "adminhome";
	}

	@RequestMapping(value = "/updateProduct/{pid}")
	public String updateProduct(@PathVariable("pid") int pid, Model m) {

		m.addAttribute("catlist", this.getCatList());
		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);
		Modproduct product = productDao.getproduct(pid);
		m.addAttribute("product", product);

		return "adminhome";

	}

	/*
	 * @RequestMapping(value = "/updateProduct/insert", method =
	 * RequestMethod.POST) public String insertt(@ModelAttribute("product")
	 * Modproduct product, Model m,@RequestParam("pimage") MultipartFile
	 * filedet,BindingResult result) {
	 * 
	 * 
	 * System.out.println("---Product Inserted---");
	 * 
	 * productDao.insertproduct(product); //System.out.println(
	 * "----------------------Product Controller reached----------------------"
	 * ); System.out.println("Product : " +product.getPname());
	 * 
	 * if (!product.getPimage().isEmpty()) { try {
	 * 
	 * 
	 * 
	 * String imagePath =
	 * request.getServletContext().getRealPath("/resources/images/products");
	 * System.out.println("------- Context Path set -------"); File dir = new
	 * File(imagePath + File.separator); System.out.println(
	 * "------- Directory set to" + dir + "-------"); if (!dir.exists())
	 * dir.mkdirs(); String orgName = product.getPname(); String filePath =
	 * imagePath + File.separator + orgName + ".jpg"; File dest = new
	 * File(filePath); System.out.println("------- Image uploaded to " + dest +
	 * "-------"); product.getPimage().transferTo(dest);
	 * 
	 * } catch (Exception e) { System.out.println("You failed to upload " +
	 * product.getPname() + " => " + e.getMessage()); } } else {
	 * System.out.println("Upload Failed"); }
	 * 
	 * List<Modproduct> prodlist = productDao.proList();
	 * m.addAttribute("prodlist", prodlist); return "adminhome"; }
	 */

	@RequestMapping(value = "/deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid, Model m) {

		Modproduct product = productDao.getproduct(pid);
		productDao.delete(product);

		Modproduct product1 = new Modproduct();
		m.addAttribute("product", product1);
		m.addAttribute("catlist", this.getCatList());
		List<Modproduct> prolist = productDao.proList();
		m.addAttribute("prodlist", prolist);

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

	@RequestMapping("/userhome")
	public String show(Model m) {
		Modproduct modproduct = new Modproduct();
		m.addAttribute("product", modproduct);
		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);

		return "userhome";

	}

	@RequestMapping(value = "/productdscrptn/{pid}")
	public String view(@PathVariable("pid") int pid, Model m) {

		Modproduct product = productDao.getproduct(pid);
		m.addAttribute("product", product);
		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);
		// cartdao.insertcart(cart);
		return "productdscrptn";
	}

	@RequestMapping(value = "/adcart")
	public String viiew(@PathVariable("pid") int pid, Model m) {
		Cart cart = new Cart();
		cart.getPid();
		cart.getPname();
		cart.getUserid();
		cart.getCartitemid();
		cart.getCartid();
		cart.getPrice();
		Modproduct product = productDao.getproduct(pid);
		m.addAttribute("product", product);
		List<Modproduct> prodlist = productDao.proList();
		m.addAttribute("prodlist", prodlist);
		cartdao.insertcart(cart);
		return "adcart";
	}

}
