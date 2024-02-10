package com.microserviceKafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceKafka.domain.BirthDate;
import com.microserviceKafka.domain.Customer;
import com.microserviceKafka.domain.EmailAddress;
import com.microserviceKafka.domain.FirstName;
import com.microserviceKafka.domain.LastName;
import com.microserviceKafka.dto.CustomerDTO;
import com.microserviceKafka.service.CustomerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

	private final CustomerService customerService;

	@PostMapping
	public ResponseEntity<Customer> create(@RequestBody @Valid final CustomerDTO customerDTO) {

		FirstName firstName = FirstName.of(customerDTO.firstName());
		LastName lastName = LastName.of(customerDTO.lastName());
		BirthDate birthDate = BirthDate.of(customerDTO.birthDate());
		EmailAddress emailAddress = EmailAddress.of(customerDTO.emailAddress());

		Customer customer = Customer.createCustomer(firstName, lastName, birthDate, emailAddress);
		Customer createdCustomer = customerService.create(customer);
		return ResponseEntity.ok(createdCustomer);

	}

}
