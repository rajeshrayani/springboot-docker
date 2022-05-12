package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.model.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	@Override
	public User getUser(int userId) {

		return userRepository.findById(userId).get();
	}

	@Override
	public void deleteUser(int userId) {

		userRepository.deleteById(userId);
	}

	@Override
	public User insertUser(User user) {

		return userRepository.save(user);

	}

}
