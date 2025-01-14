package com.rutuja.country;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

import java.util.UUID;

@SpringBootApplication
public class CountryApplication {

	public static void main(String[] args) {
		MDC.put("correlationId", UUID.randomUUID().toString()+"_app_startup_log");
		Hooks.enableAutomaticContextPropagation();
		SpringApplication.run(CountryApplication.class, args);
	}

}
