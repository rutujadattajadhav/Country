package com.rutuja.country;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import reactor.core.publisher.Hooks;

import java.util.UUID;

@SpringBootApplication

public class CountryApplication {

	public static void main(String[] args) {
		ThreadContext.put("correlationId", UUID.randomUUID().toString()+"spunkdemo_app_startup_log");
		SpringApplication.run(CountryApplication.class, args);
		ThreadContext.clearMap();
	}

}
