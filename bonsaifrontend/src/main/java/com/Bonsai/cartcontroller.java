package com.Bonsai;

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
public class cartcontroller {
	@Autowired
	ProductDao productDao;

	@Autowired
	CategoryDao categoryDao;
	@Autowired
	CartDao cartdao;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/Cart")
	public String showProduct(Model m) {

		Cart cart = new Cart();

		m.addAttribute("cart", cart);

		List<Cart> prolist = cartdao.catList();
		m.addAttribute("list", prolist);

		return "adcart";
	}

	@RequestMapping(value = "adcart",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("Cart") Cart cart, Model m) {
		
		
		
		cartdao.insertcart(cart);
		
		
		return "adcart";
	}

	@RequestMapping(value = "/delete/{cartid}")
	public String deleteProduct(@PathVariable("catid") int catid, Model m) {
		Cart cart = cartdao.getcart(catid);
		cartdao.deletecategory(cart);

		return "cartview";
	}

}
