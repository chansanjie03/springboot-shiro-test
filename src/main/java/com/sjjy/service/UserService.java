package com.sjjy.service;

import com.sjjy.domain.User;

public interface UserService {

	public User findByName(String name);
	
	public User findById(Integer id);
}
