package com.trainingdev.td_bs_management_user.entities;

import java.util.List;

import com.trainingdev.td_bs_management_user.enums.FeelingEnum;
import com.trainingdev.td_bs_management_user.enums.PostTypeEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class PostEntity extends AuditModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private UserEntity user;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type", length = 7, nullable = false)
	private PostTypeEnum type;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "feeling")
	private FeelingEnum feeling;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CommentEntity> comments;
	
	

}
