package com.trainingdev.td_bs_management_user.entities;

import java.util.List;

import com.trainingdev.td_bs_management_user.enums.GenderEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class UserEntity extends AuditModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;
	
	@Column(name = "name", length = 40, nullable = false)
	private String name;
	
	@Column(name = "birthday", nullable = false)
	private String birthday;
	
	@Column(name = "email", length = 20, nullable = false)
	private String email;
	
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private GenderEnum gender;
	
	@Column(name = "profile_photo")
	private String profilePhoto;
	
	@Column(name = "cover_photo")
	private String coverPhoto;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<PostEntity> posts;

}
