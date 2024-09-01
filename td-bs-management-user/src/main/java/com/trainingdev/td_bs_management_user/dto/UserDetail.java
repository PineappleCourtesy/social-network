package com.trainingdev.td_bs_management_user.dto;

import com.trainingdev.td_bs_management_user.enums.GenderEnum;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {
	
	@NotNull
	private int id;
	
	
	private String name;
	
    
	private String birthday;
    
    
    private String email;
    
    
    private String password;
    
    
    private GenderEnum gender;
    
    
    private String profilePhoto;
    
    
    private String coverPhoto;
    
      
    private String creationDate;
    
    private String modificationDate;
    
    
	
	

}
