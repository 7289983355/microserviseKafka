package com.microserviceKafka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.microserviceKafka.domain.EmailAddress;

public class EmailAddressTest {

	@Test
	void of() {

		var emailAddress = "dharmeshkumar@gmail.com";

		EmailAddress actualEmail = EmailAddress.of(emailAddress);
		Assertions.assertNotNull(emailAddress);
		Assertions.assertEquals(emailAddress, actualEmail.getValue());
	}

	@Test
	void testForEmailAddressNull() {

		NullPointerException nullPointerException=Assertions.assertThrows(NullPointerException.class, () -> EmailAddress.of(null));
		Assertions.assertEquals("EmailAddress cannot be null", nullPointerException.getMessage());
	}

}
