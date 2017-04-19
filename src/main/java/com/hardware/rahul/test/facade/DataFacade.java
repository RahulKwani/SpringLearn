package com.hardware.rahul.test.facade;

import static com.hardware.rahul.test.utils.ProductKeyConstant.ZERO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hardware.rahul.test.dao.ProductTypeDAO;
import com.hardware.rahul.test.dao.ProductsDAO;
import com.hardware.rahul.test.model.ProductType;
import com.hardware.rahul.test.model.Products;
import com.test.rahul.spring.dao.SpringLearnDao;
import com.test.rahul.spring.model.Users;

@Component("dataFacade")
public class DataFacade {

	@Autowired
	private SpringLearnDao learnDao;
	
	@Autowired
	private ProductTypeDAO productTypeDAO;
	
	@Autowired
	private ProductsDAO productsDAO;
	
	public void printData(){
		System.out.println(learnDao.getDataById("100"));
	}
	
	public List<Users> getAllUsers(){
		return learnDao.getAllUsers();
	}
	
	public Products retrieveProductByProductId(Integer productId){
		return productsDAO.findProductByProductId(productId);
	}
	
	public List<ProductType> getAllProductTypes(){
		return productTypeDAO.findAll();
	}
	
	public List<Products> retrieveProductsByProductType(Integer productTypeId){
		if(productTypeId == ZERO)
			return productsDAO.findAll();
		ProductType productType = new ProductType();
		productType.setTypeId(productTypeId);
		return productsDAO.findProductsByProductType(productType);
	}
	
	
	public void updateProductType(ProductType productType){
		productTypeDAO.save(productType);
	}
	
	public void updateProducts(Products products){
		productsDAO.save(products);
	}
	
}
