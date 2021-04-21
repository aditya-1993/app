package com.springapp.springapp.service;

import java.util.List;

import com.springapp.springapp.entity.User;

public interface UserService {

	void addUser(User user);
	
	List<User> getUsers();
}
