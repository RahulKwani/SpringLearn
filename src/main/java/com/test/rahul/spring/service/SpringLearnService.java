package com.test.rahul.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rahul.spring.facade.DataFacade;
import com.test.rahul.spring.model.Users;


@Service("springLearnService")
public class SpringLearnService {
	
	@Autowired
	private DataFacade dataFacade;
	
	public String sayHello(){
		return "Hello World!!";
	}

	public List<Users> getAllUsers(){
		return dataFacade.getAllUsers();
	}
}
