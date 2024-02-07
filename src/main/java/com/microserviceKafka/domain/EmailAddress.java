package com.microserviceKafka.domain;

import java.util.Objects;

import org.springframework.util.Assert;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class EmailAddress {

	
	private String value;

	private EmailAddress(String value) {
		 this.value=value;
	}

	public static EmailAddress of(final String value) {
		
		Objects.requireNonNull(value ,"EmailAddress cannot be null");
		Assert.isTrue(!value.isBlank(),"EmailAddress");
		return new EmailAddress(value);
	}
	
}
