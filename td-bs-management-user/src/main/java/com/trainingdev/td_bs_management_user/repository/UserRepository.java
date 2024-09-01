package com.trainingdev.td_bs_management_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingdev.td_bs_management_user.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	

}
