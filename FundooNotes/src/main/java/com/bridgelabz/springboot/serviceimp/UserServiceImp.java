package com.bridgelabz.springboot.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.springboot.Model.UserModel;
import com.bridgelabz.springboot.UserDto.LoginUserDto;
import com.bridgelabz.springboot.UserDto.RegistorUserDto;
import com.bridgelabz.springboot.repository.UserRepository;
import com.bridgelabz.springboot.service.UserService;
import com.bridgelabz.springboot.util.Utility;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private Utility util;

	@Autowired
	private UserRepository repository;

	@Override
	public void addUsers(RegistorUserDto registerUserDto) {

		UserModel user = new UserModel();
		user.setFirstname(registerUserDto.getFirstname());
		user.setLastname(registerUserDto.getLastname());
		user.setUsername(registerUserDto.getUsername());
		user.setPassword(registerUserDto.getPassword());
		user.setEmail(registerUserDto.getEmail());
		user.setPhonenumber(registerUserDto.getPhonenumber());

		repository.save(user);

	}

	@Override
	public void getByEmail(String email) {
	
	}

	


	
	
	
	
	
	
	
	
	
}
