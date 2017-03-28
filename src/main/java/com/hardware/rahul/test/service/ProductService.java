package com.hardware.rahul.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardware.rahul.test.facade.DataFacade;
import com.hardware.rahul.test.model.ProductType;
import com.hardware.rahul.test.model.Products;
import com.test.rahul.spring.model.Users;


@Service("productService")
public class ProductService  {
	
	@Autowired
	private DataFacade dataFacade;
	
	public String sayHello(){
		return "Hello World!!";
	}

	public List<Users> getAllUsers(){
		return dataFacade.getAllUsers();
	}

	public List<Products> retrieveAllProducts() {
		return retrieveProductsByProductType(0);
	}
	
	public Products retrieveProductByProductId(Integer productId){
		return dataFacade.retrieveProductByProductId(productId);
	}

	public List<Products> retrieveProductsByProductType(Integer productType) {
		return dataFacade.retrieveProductsByProductType(productType);
	}

	public List<ProductType> retrieveProductType() {
		return dataFacade.getAllProductTypes();
	}
}
