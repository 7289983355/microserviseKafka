package com.microserviceKafka.domain;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.util.Assert;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class BirthDate {
	
	private LocalDate value;

	private BirthDate(LocalDate value) {
		 this.value=value;
	}

	public static BirthDate of(final LocalDate value) {
		
		Objects.requireNonNull(value ,"firstName cannot be null");
		Assert.isTrue(!value.isBefore(LocalDate.now()),"birth date can be any past value");
		return new BirthDate(value);
	}
	

}
