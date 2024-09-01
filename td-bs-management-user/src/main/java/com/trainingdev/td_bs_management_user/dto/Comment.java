package com.trainingdev.td_bs_management_user.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	
	private String id;
	
	private UserComment user;
	
	private String description;
	
	private LocalDateTime creationDate;
	
	

}
