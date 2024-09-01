package com.trainingdev.td_bs_management_user.service;

import com.trainingdev.td_bs_management_user.dto.UserDetail;
import com.trainingdev.td_bs_management_user.dto.UserProfile;
import com.trainingdev.td_bs_management_user.dto.UserRequest;

public interface UserService {
	
	UserDetail createUser(UserRequest userRequest); 
	
	UserDetail updateUser(UserDetail userDetail);
	
	UserProfile getUserById(Integer id);
	

}
