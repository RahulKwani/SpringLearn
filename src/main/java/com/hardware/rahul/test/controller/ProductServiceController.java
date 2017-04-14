package com.hardware.rahul.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardware.rahul.test.model.ProductType;
import com.hardware.rahul.test.model.Products;
import com.hardware.rahul.test.service.ProductService;

@RestController
@RequestMapping("Products")
public class ProductServiceController {

	@Autowired
	private ProductService productServices;
	
	@GetMapping("/id/{productId}")
	public Products retrieveProductByProductId(@PathVariable("productId") Integer productId){
		return productServices.retrieveProductByProductId(productId);
	}
	
	
	@GetMapping("type/{productType}")
	public List<Products> showAllProducts(@PathVariable("productType") Integer productType){
		System.out.println("Value of Product Types :" + productType);
		if(productType == null){ 
			return productServices.retrieveProductsByProductType(0);
		}
		return productServices.retrieveProductsByProductType(productType);
	}
	
	@PostMapping("/ProductTypes")
	public List<ProductType> showAllProductTypes(){
		return productServices.retrieveProductType();
	}
	
}
