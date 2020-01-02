package com.bridgelabz.springboot.service;



import com.bridgelabz.springboot.UserDto.RegistorUserDto;


public interface UserService {
	public void addUsers(RegistorUserDto registerUserDto);
	public void getByEmail(String email);
}
