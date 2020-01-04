package com.bridgelabz.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.springboot.Model.UserModel;



public interface UserRepository extends JpaRepository<UserModel, Long> {
 
	UserModel getByEmail(String email);
}
