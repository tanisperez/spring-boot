package com.tanis.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * H2 Database Configuration.
 *
 * <p>
 * It just imports the file h2db.properties to Spring environment.
 *
 */
@Configuration
@PropertySource("classpath:h2db.properties")
public class H2DBConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(H2DBConfiguration.class);

	public H2DBConfiguration() {
		LOGGER.info("Setting up H2DB configuration");
	}
}
