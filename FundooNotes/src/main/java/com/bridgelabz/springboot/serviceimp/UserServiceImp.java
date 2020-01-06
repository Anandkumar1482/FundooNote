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
	public boolean saveUsers(RegistorUserDto registerUserDto) {
		
		boolean status = true;
		UserModel userModel = new UserModel();
		userModel.setFirstname(registerUserDto.getFirstname());
		userModel.setLastname(registerUserDto.getLastname());
		userModel.setUsername(registerUserDto.getUsername());
		userModel.setPassword(registerUserDto.getPassword());
		userModel.setEmail(registerUserDto.getEmail());
		userModel.setRe_enter_password(registerUserDto.getRe_enter_password());
		userModel.setPhonenumber(registerUserDto.getPhonenumber());
		if(status) {
			repository.save(userModel);
			return status;
		}
	
		return false;

	}
	@Override
	public LoginUserDto getUser(String email) {
		
		LoginUserDto loginUserDto=new LoginUserDto();
		
		UserModel userModel=repository.findByEmail(email);
		
		loginUserDto.setEmail(userModel.getEmail());
		loginUserDto.setPassword(userModel.getPassword());
		return loginUserDto;
	}

	@Override
	public boolean userUPDATE(RegistorUserDto registrationUserDto) {
		
		UserModel userModel = new UserModel();
		boolean status=true;
		userModel.setId(registrationUserDto.getId());
		userModel.setFirstname(registrationUserDto.getFirstname());
		userModel.setLastname(registrationUserDto.getLastname());
		userModel.setUsername(registrationUserDto.getUsername());
		userModel.setPassword(registrationUserDto.getPassword());
		userModel.setEmail(registrationUserDto.getEmail());
		userModel.setRe_enter_password(registrationUserDto.getRe_enter_password());
		userModel.setPhonenumber(registrationUserDto.getPhonenumber());

		if(status) {
			repository.save(userModel);
			return status;
		}
		return false;
	}

	@Override
	public void deleteUser(int id) {
		repository.deleteById(id);
	}

}

