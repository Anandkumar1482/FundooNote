package com.bridgelabz.springboot.service;



import com.bridgelabz.springboot.UserDto.LoginUserDto;
import com.bridgelabz.springboot.UserDto.RegistorUserDto;


public interface UserService {
	public boolean addUsers(RegistorUserDto registerUserDto);
	public void getByEmail(LoginUserDto loginUserDto);
}
