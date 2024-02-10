package com.microserviceKafka.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record CustomerDTO(
		@NotBlank(message ="firstname cannot be null")
		String  firstName,
		@NotBlank(message ="lastName cannot be null") 
		String lastName, 
		
		@Past(message ="the birthdate is invalid ,it should be in past")
		LocalDate birthDate,
		
		@NotBlank(message ="email address cannot be blank")
		@Email(message ="please provide a valid email address")
		String emailAddress) {

}
