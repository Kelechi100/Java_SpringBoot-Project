package lv.venta.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
			return "show-all-product-page"; // this will show show-all-product-page.html on the browser
		}
		catch(Exception e) {
			model.addAttribute("mypackage", e.getMessage());
			return "error-page"; // this will show error-page.html page with exception message
			
			// TOOD : Handle Exception
		}
		
	}
	
	@GetMapping("/all/{id}")// localhost:8080/product/crud/all/1
	public String getProductCrudById(@PathVariable("id") int id, Model model) {
		try {
			Product result = productCRUDservice.retrievById(id);
			model.addAttribute("mypackage", result);
			return "show-one-product-page";
		}
		catch (Exception e) {
			model.addAttribute("mypackage", e.getMessage());
			return "error-page"; // this will show error-page.html page with exception message
			
			// TODO: handle exception
		}
		
	}
	
	

	@GetMapping("/one")// localhost:8080/product/crud/one?id=1
	public String getProductCrudByIdWithQuestionmark(@RequestParam("id") int id, Model model) {
		try {
			Product result = productCRUDservice.retrievById(id);
			model.addAttribute("mypackage", result);
			return "show-one-product-page";
		}
		catch (Exception e) {
			model.addAttribute("mypackage", e.getMessage());
			return "error-page"; // this will show error-page.html page with exception message
			
			// TODO: handle exception
		}
		
	}
	
	@GetMapping("/create") // localhost:8080/product/crud/create
	public String getProductCRUDECreate(Model model) {
		model.addAttribute("product", new Product());
		return "create-product-page";// this will show create-produc-page.html with default product
	}
	@PostMapping("/create")
	public String postproductCRUDCreate(Product product) {
		productCRUDservice.create(product.getTitle(), product.getDescription(), 
				product.getPrice(),product.getQuantity());
		return "redirect:/product/crud/all";
		
		
		
	}

}
