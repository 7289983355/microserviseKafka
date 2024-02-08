package com.microserviceKafka.serviceImpl;

import org.springframework.stereotype.Service;

import com.microserviceKafka.domain.Customer;
import com.microserviceKafka.domain.EmailAddress;
import com.microserviceKafka.repo.CustomerRepository;
import com.microserviceKafka.service.CustomerService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

	
	final CustomerRepository customerRepository;
	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void changeEmail(Long cutomerId, EmailAddress emailAddress) {
		// TODO Auto-generated method stub
		Customer customer= customerRepository.findById(cutomerId)
		                   .orElseThrow(()->new IllegalArgumentException(String.format("could not found the customer for id %s: ",cutomerId)));
		customer.changeEmail(emailAddress);
		customerRepository.save(customer);
	}

}
