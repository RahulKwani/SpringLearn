package com.hardware.rahul.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hardware.rahul.test.model.ProductType;
@Repository
@Transactional
public class ProductTypeDAOExtendedImpl implements ProductTypeDAOExtended {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int UpdateProductTypes(ProductType productType) {
		
		return 0;
	}

	@Override
	public int UpdateTypeName(String ProductTypeName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateTypeDescription(String description) {
		// TODO Auto-generated method stub
		return 0;
	}

}
