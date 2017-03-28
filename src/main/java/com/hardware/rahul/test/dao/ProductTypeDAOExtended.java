package com.hardware.rahul.test.dao;

import com.hardware.rahul.test.model.ProductType;

public interface ProductTypeDAOExtended {

	int UpdateProductTypes(ProductType productType);
	
	int UpdateTypeName(String ProductTypeName);
	
	int UpdateTypeDescription(String description);
		
}
