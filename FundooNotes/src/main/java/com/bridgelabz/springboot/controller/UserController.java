package com.bridgelabz.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springboot.UserDto.LoginUserDto;
import com.bridgelabz.springboot.UserDto.RegistorUserDto;
import com.bridgelabz.springboot.response.RegistrationResponse;
import com.bridgelabz.springboot.response.UpdateResponse;
import com.bridgelabz.springboot.service.UserService;

@RestController
@RequestMapping(value = "/rest")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public ResponseEntity<RegistrationResponse> saveLogin(@RequestBody RegistorUserDto registorUserDto) {
		boolean status = userService.saveUsers(registorUserDto);
		System.out.println(status);
		if (status) {
			return ResponseEntity.status(HttpStatus.OK)
					.body(new RegistrationResponse("successfully registerd", 200, registorUserDto));
		}
		return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
				.body(new RegistrationResponse("user alredy registred", 400, registorUserDto));
	}

	@RequestMapping(value = "/get/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public LoginUserDto getUser(@PathVariable("email") String email) {
		LoginUserDto loginUserDto = userService.getUser(email);
		return loginUserDto;
	}

	@RequestMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	@PutMapping
	public ResponseEntity<UpdateResponse> userUPDATE(@RequestBody RegistorUserDto registorUserDto) {
		boolean status=userService.userUPDATE(registorUserDto);
		if(status) {
			return ResponseEntity.status(HttpStatus.OK).body(new UpdateResponse("user detaials Successfully updated", 200,registorUserDto));
		}
		return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body(new UpdateResponse("user details not updated",204,registorUserDto));
	}

	
	
	
	@RequestMapping(value = "/delete/{id}")
	@DeleteMapping
	public String deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "record deletd sucessfully";
	}

}
