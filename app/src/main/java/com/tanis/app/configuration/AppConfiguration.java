package com.tanis.app.configuration;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Global App Configuration shared between modules.
 *
 */
@Configuration
@SuppressWarnings("static-method")
public class AppConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfiguration.class);

	public AppConfiguration() {
		LOGGER.info("Setting up App Configuration");
	}

	/**
	 * Creates a bean of a ModelMapper.
	 *
	 * @return a ModelMapper.
	 */
	@Bean
	public ModelMapper createModelMapper() {
		return new ModelMapper();
	}

}
