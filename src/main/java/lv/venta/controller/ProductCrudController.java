package lv.venta.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lv.venta.model.Product;
import lv.venta.service.ProductCRUDService;

@Controller
@RequestMapping("/product/crud")
public class ProductCrudController {
	
	@Autowired
	private ProductCRUDService productCRUDservice;
	
	@GetMapping("/all") // localhost:8080/product/crud/all
	public String getProductCrudAll(Model model) { // using model to transfer file from java to html
		try
		{
			ArrayList<Product> result = productCRUDservice. retrieveAll();
			model.addAttribute("mypackage", result);
			return "show-all product-page"; // this will show show-all-product-page.html on the browser
		}
		catch(Exception e) {
			model.addAttribute("mypackage", e.getMessage());
			return "error-page"; // this will show error-page.html page with exception message
			
			// TOOD : Handle Exception
		}
		
	}
	
	

}
