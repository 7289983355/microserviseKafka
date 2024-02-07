package com.microserviceKafka.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue
	private Long id;
	private FirstName firstName;
	private String lastName;
	private BirthDate birthDate;
	private EmailAddress emailAddress;
	

}
