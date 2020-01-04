package com.bridgelabz.springboot.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.springboot.Model.UserModel;
import com.bridgelabz.springboot.UserDto.LoginUserDto;
import com.bridgelabz.springboot.UserDto.RegistorUserDto;
import com.bridgelabz.springboot.repository.UserRepository;
import com.bridgelabz.springboot.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public boolean addUsers(RegistorUserDto registerUserDto) {
		boolean response = false;
		UserModel user = new UserModel();
		user.setFirstname(registerUserDto.getFirstname());
		user.setLastname(registerUserDto.getLastname());
		user.setUsername(registerUserDto.getUsername());
		user.setPassword(registerUserDto.getPassword());
		user.setEmail(registerUserDto.getEmail());
		user.setRe_enter_password(registerUserDto.getRe_enter_password());
		user.setPhonenumber(registerUserDto.getPhonenumber());

		repository.save(user);
		return response;

	}

	@Override
	public void getByEmail(LoginUserDto loginUserDto) {

		UserModel usermodel = repository.getByEmail(loginUserDto.getEmail());

		if (usermodel.getEmail().equals(loginUserDto.getEmail())
				&& usermodel.getPassword().equals(loginUserDto.getPassword()));
		{
			System.out.println("login user");
		}
			
}
}
