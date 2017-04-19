package com.hardware.rahul.test.utils;

public class ProductKeyConstant {

	private ProductKeyConstant(){
	}
	
	public static final Integer ZERO = 0;
	
	public static final String RETRIEVE_ROLE = "SELECT username, role FROM userdetails WHERE username = ?";
	
	public static final String RETRIEVE_PASSWORD = "SELECT username, password, true FROM userdetails WHERE username = ?";
}
