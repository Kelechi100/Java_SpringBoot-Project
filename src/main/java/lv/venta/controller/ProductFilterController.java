package lv.venta.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lv.venta.model.Product;
import lv.venta.service.IProductFilteringService;

@Controller
@RequestMapping("/product/filter")
public class ProductFilterController {
	
	@Autowired
	private IProductFilteringService filterService;
	 
	@GetMapping("/quantity/{param}") //localhost:8080/product/filter/quantity/2
	public String getProductFilterbyQuantity(@PathVariable("param") int threshold)
	{
		ArrayList<Product> result = filterService.filterByQuantityThreshold(threshold);
		model.addAttribute("mypackage", result);
		return "show-all-product-page";
	}

}
