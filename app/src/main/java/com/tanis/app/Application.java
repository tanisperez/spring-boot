package com.tanis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application start up.
 */
@SpringBootApplication(scanBasePackages = "com.tanis")
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
