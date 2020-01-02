package com.bridgelabz.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.springboot.Model.UserModel;



public interface UserRepository extends CrudRepository<UserModel, Long> {
 
	UserModel getByEmail(String email);
}
