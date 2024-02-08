package com.microserviceKafka.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviceKafka.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
