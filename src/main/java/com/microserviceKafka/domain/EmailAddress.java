package com.microserviceKafka.domain;

import java.util.Objects;
import java.util.regex.Pattern;

import org.springframework.util.Assert;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmailAddress {

	private String value;

	private EmailAddress(String value) {
		this.value = value;
	}

	public static EmailAddress of(final String value) {

		Objects.requireNonNull(value, "EmailAddress cannot be null");
		Assert.isTrue(!value.isBlank(), "EmailAddress");

		var regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		
	   boolean matches=	Pattern.compile(regexPattern).matcher(value).matches();
	   
	   Assert.isTrue(matches ,"invalid");

		return new EmailAddress(value);
	}

}
