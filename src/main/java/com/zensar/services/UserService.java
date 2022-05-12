package com.zensar.services;

import java.util.List;

import com.zensar.model.User;

public interface UserService {

	List<User> getAllUsers();

	User getUser(int userId);
	
	User insertUser(User user);

	void deleteUser(int userId);

	
	

}
