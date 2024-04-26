package lv.venta.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.model.Product;

@Controller
public class FirstController {
	
	
	@GetMapping("/hello") //localhost:8080/hello
	public String getHello() {
		System.out.println("The first controller is working!!!");
		return "hello-page";//it will show hello-page.html file in the browser
	}
	
	Random rand = new Random();
	@GetMapping("/hello/msg") //localhost:8080/hello/msg
	public String getHelloMsg(Model model)
	{
		System.out.println("The second controller is working!!!");
		model.addAttribute("mypackage", "Hello from JAVA: " + rand.nextInt(0, 100));
		return "hello-msg-page";//it will show hello-msg-page.html file in the browser
	}
	
	
	@GetMapping("/product/test") //localhost:8080/product/test
	public String getProductTest(Model model) {
		System.out.println("The third controller is working!!!");
		Product p = new Product("Apple", "Red", 0.99f, 4);
		model.addAttribute("mypackage", p);
		return "show-one-product-page";//it will show show-one-product-page.html file in browser
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
