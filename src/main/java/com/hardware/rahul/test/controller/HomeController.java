package com.hardware.rahul.test.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/Dashboard")
	public String opensDashboard(Map<String , Object> model){
		model.put("username" , "Rahul");
		return "Dashboard";
	}
	@GetMapping("/logout")
	public String logout(Model model){
		return "Logout";
	}
}
