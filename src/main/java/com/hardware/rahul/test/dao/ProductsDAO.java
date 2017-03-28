package com.hardware.rahul.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardware.rahul.test.model.Products;

/**
 * To fetch all the values from product table.
 * @author Rahul
 *
 */
public interface ProductsDAO extends JpaRepository<Products, Integer>{
	
	Integer countProductsByName(String Name);
	
	Products findProductByProductId(Integer productId);
}