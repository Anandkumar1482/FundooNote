package com.bridgelabz.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springboot.UserDto.RegistorUserDto;
import com.bridgelabz.springboot.response.RegistorResponse;
import com.bridgelabz.springboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/users/register", method = RequestMethod.POST)
	private RegistorResponse saveUser(@RequestBody RegistorUserDto userdto) {
		userservice.addUsers(userdto);
		return new RegistorResponse();

	}

	 
	@PostMapping("/users/login")
	private RegistorResponse loginUser(@RequestBody RegistorUserDto userdto) {
		
		
		
		return new RegistorResponse();
		
	}
	
	
	
	
	
	
}
