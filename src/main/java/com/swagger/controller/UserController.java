package com.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.ApiException;
import com.pet.handler.UserApi;
import com.pet.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserApi userAPi;
	
	
	@PostMapping("/createuser")
	public String createUser(@RequestBody User user) throws ApiException {
		userAPi.createUser(user);
		
		return "user created with id :"+user.getId();
	}
	
}
