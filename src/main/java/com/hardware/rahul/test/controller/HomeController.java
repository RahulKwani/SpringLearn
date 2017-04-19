package com.hardware.rahul.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hardware.rahul.test.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService productService;
	 
	@GetMapping("/Dashboard")
	public String opensDashboard(Map<String , Object> model){
		model.put("username" , "Rahul");
		return "Dashboard";
	}
	@GetMapping("/logout")
	public String logout(Model model){
		return "Logout";
	}
	
	@GetMapping("/login")
	public String getLoginPage(Model model){
		return "login";
	}
	
	/*@PostMapping("/login")
	public String postLoginPage(@Valid UserDetails userDetails, BindingResult result, Model model){
		System.out.println("postLogin");
		if (result.hasErrors()) {
			System.out.println("Login Page has errors");
			model.addAttribute("LoginErrorMsg", "Please enter valid userName & password");
			return "login";
		}
		
		return null;
	}*/
	
	@GetMapping("/Products")
	public String showProductView(Map<String , Object> model){
		model.put("productList", productService.retrieveAllProducts());
		return "Products";
	}
}
