package com.elsoproject.dao;

import java.util.List;

import com.elsoproject.model.User;

public interface UserDao {

	User findById(Integer id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);

	User existingNeptunKod(String neptunKod);
}