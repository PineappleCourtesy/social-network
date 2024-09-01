package com.trainingdev.td_bs_management_user.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
	
	private UserDetail userDetail;
	
	private ArrayList<PostDetail> postList;

}
