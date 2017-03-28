package com.test.rahul.spring.dao;

import java.util.List;

import com.test.rahul.spring.model.Users;

public interface SpringLearnDao {

	Users getDataById(String id);
	
	void updateDataBase(String value);
	
	List<Users> getAllUsers();
}
