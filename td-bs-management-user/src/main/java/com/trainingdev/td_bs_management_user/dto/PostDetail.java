package com.trainingdev.td_bs_management_user.dto;

import java.time.LocalDateTime;

import com.trainingdev.td_bs_management_user.enums.FeelingEnum;
import com.trainingdev.td_bs_management_user.enums.PostTypeEnum;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDetail {
	
	@NotNull
	private int id;
	
	private int userId;
	
	private PostTypeEnum type;
	
	private FeelingEnum feeling;
	
	private String description;
	
	private String image;
	
	private LocalDateTime creationDate;
	
	private LocalDateTime modifitacionDate;
	
	private Comment commentList;

}
