package com.tanis.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JPA Configuration.
 *
 * <p>
 * It imports custom configuration from the file jpa-hibernate.properties,
 * enable JPA repositories and entity scan.
 *
 */
@Configuration
@PropertySource("classpath:jpa-hibernate.properties")
@EnableJpaRepositories(basePackages = { "com.tanis.jpa" })
@EntityScan(basePackages = { "com.tanis.jpa" })
public class JPAConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(JPAConfiguration.class);

	public JPAConfiguration() {
		LOGGER.info("Setting up JPA configuration");
	}
}
