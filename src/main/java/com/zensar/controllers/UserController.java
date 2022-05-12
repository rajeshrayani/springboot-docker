package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.model.User;
import com.zensar.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {

	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();

	}

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}
	@PostMapping("/users")
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);

	}

	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) {
		userService.deleteUser(userId);
	}

}
