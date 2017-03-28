package com.hardware.rahul.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardware.rahul.test.model.ProductType;

public interface ProductTypeDAO extends JpaRepository<ProductType, Integer> ,ProductTypeDAOExtended{
	
	ProductType findProductTypeNameByTypeId(Integer typeId);
	
	
	List<ProductType> getProductTypeByType(String typeName);
		
}
