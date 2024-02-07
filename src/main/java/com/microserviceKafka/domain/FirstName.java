package com.microserviceKafka.domain;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class FirstName {
	
	private String value;

	public String getValue() {
		return value;
	}

	public static FirstName of(final String value) {
		
		Objects.requireNonNull(null);
		return null;
	}
	
	

}
