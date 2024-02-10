package com.microserviceKafka.domain;

import java.util.Objects;

import org.springframework.util.Assert;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FirstName {

	@Column(name = "FirstName")
	private String value;

	private FirstName(String value) {
		this.value = value;
	}

	public static FirstName of(final String value) {

		Objects.requireNonNull(value, "firstName cannot be null");
		Assert.isTrue(!value.isBlank(), "value cnnot be Black");
		return new FirstName(value);
	}

}
