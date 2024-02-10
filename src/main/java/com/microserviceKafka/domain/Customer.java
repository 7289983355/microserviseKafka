package com.microserviceKafka.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//customer with value object

@Entity
@Data
@NoArgsConstructor                    
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue
	private Long id;
	private FirstName firstName;
	private LastName lastName;
	private BirthDate birthDate;
	private EmailAddress emailAddress;

	private Customer(FirstName firstName, LastName lastName, BirthDate birthDate, EmailAddress emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.emailAddress = emailAddress;
	}

	public static Customer createCustomer(FirstName firstName, LastName lastName, BirthDate birthDate,
			EmailAddress emailAddress) {

		return new Customer(firstName, lastName, birthDate, emailAddress);
	}

	public void changeEmail(final EmailAddress emailAddress) {

		this.emailAddress = emailAddress;
	}

	
}
