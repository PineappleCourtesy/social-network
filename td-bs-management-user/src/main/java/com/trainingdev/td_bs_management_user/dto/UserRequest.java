package com.trainingdev.td_bs_management_user.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
	
	@NotEmpty(message = "The first name can't be empty")
	@Size(max=20)
	private String firstName;
	
	@NotEmpty(message = "The last name can't be empty")
	@Size(max=20)
	private String lastName;
	
	@NotEmpty(message = "The last birthdate can't be empty")
	private LocalDate birthday;
	
	@NotEmpty(message = "The birthdate can't be empty")
	@Size(max=60)
	@Email
	private String email;
	
	@NotEmpty(message = "The password can't be empty")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "La contraseña debe tener al menos una letra mayúscula, una letra minúscula, un número, un carácter especial y un mínimo de 8 caracteres"
        )
	private String password;
	
    // I don't know how to validate that what is in the contract
	@NotNull
	private String gender;
	

}
