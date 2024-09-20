package com.rutuja.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class CountryApplication {

	public static void main(String[] args) {
		Hooks.enableAutomaticContextPropagation();
		SpringApplication.run(CountryApplication.class, args);
	}

}
