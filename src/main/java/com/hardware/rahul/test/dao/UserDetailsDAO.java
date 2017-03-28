package com.hardware.rahul.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardware.rahul.test.model.UserDetails;

public interface UserDetailsDAO extends JpaRepository<UserDetails, Integer>{

	
	List<UserDetails> findUserDetailsByMobileNumberAndPassword(Long mobileNumber, String password);
}
