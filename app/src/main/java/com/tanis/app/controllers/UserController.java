package com.tanis.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanis.services.user.UserDTO;
import com.tanis.services.user.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UserDTO> findAll() {
		return this.userService.findAll();
	}

}
