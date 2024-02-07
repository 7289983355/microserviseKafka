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
public class LastName {

	private String value;

	private LastName(String value) {
		this.value = value;
	}

	public static LastName of(final String value) {

		Objects.requireNonNull(value, "firstName cannot be null");
		Assert.isTrue(!value.isBlank(), "value cnnot be Black");
		return new LastName(value);
	}

}
