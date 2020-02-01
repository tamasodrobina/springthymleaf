package com.elsoproject.service;

import java.util.List;

import com.elsoproject.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
	User existingNeptunKod(String neptunKod);
	
}