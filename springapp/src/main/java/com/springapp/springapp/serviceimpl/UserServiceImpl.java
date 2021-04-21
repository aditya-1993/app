package com.springapp.springapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.springapp.entity.User;
import com.springapp.springapp.repo.UserRepo;
import com.springapp.springapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

}
