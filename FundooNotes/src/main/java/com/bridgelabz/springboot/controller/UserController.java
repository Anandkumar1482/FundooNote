package com.bridgelabz.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springboot.UserDto.LoginUserDto;
import com.bridgelabz.springboot.UserDto.RegistorUserDto;
import com.bridgelabz.springboot.response.RegistorResponse;
import com.bridgelabz.springboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping(value = "/users/register")
	private ResponseEntity<RegistorResponse> saveUser(@RequestBody RegistorUserDto registoruserdto) {
		// System.out.println("save user");
	boolean response=userservice.addUsers(registoruserdto);
		if(response) {
			return new ResponseEntity<RegistorResponse>(HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<RegistorResponse>(HttpStatus.NOT_FOUND);
			
		}
		
	}

	@PostMapping("/users/login")
	private void loginUser(@RequestBody LoginUserDto loginUserDto) {
		userservice.getByEmail(loginUserDto);

	}

}
