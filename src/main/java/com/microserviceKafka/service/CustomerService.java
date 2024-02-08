package com.microserviceKafka.service;

import com.microserviceKafka.domain.Customer;
import com.microserviceKafka.domain.EmailAddress;

public interface CustomerService {
	
	Customer create(Customer customer);
	void changeEmail(Long cutomerId ,EmailAddress emailAddress);

}
