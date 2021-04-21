package com.springapp.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapp.springapp.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
