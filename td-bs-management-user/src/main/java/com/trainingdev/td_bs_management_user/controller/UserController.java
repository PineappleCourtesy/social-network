package com.trainingdev.td_bs_management_user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trainingdev.td_bs_management_user.dto.UserDetail;
import com.trainingdev.td_bs_management_user.dto.UserProfile;
import com.trainingdev.td_bs_management_user.dto.UserRequest;
import com.trainingdev.td_bs_management_user.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/user")
	@ResponseStatus(HttpStatus.CREATED)
	public UserDetail createUser(
			@RequestBody @Valid UserRequest userRequest) {
		return userService.createUser(userRequest);
	}
	
	@PutMapping("/user")
	@ResponseStatus(HttpStatus.OK)
	public UserDetail updateUser(
			@RequestBody @Valid UserDetail userDetail) {
		return userService.updateUser(userDetail);
		
	}
	
	@GetMapping("/user/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserProfile getUserById(
			@PathVariable("id") int id) {
		
		return userService.getUserById(id);
		
	}

}
