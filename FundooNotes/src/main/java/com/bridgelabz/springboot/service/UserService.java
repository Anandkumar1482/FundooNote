package com.bridgelabz.springboot.service;

import com.bridgelabz.springboot.UserDto.LoginUserDto;
import com.bridgelabz.springboot.UserDto.RegistorUserDto;

public interface UserService {
	public boolean saveUsers(RegistorUserDto registerUserDto);

	public LoginUserDto getUser(String email);

	public boolean userUPDATE(RegistorUserDto registrationUserDto);

	public void deleteUser(int id);
}
