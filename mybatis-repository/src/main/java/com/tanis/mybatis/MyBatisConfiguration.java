package com.tanis.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * MyBatis Configuration.
 *
 * <p>
 * It imports custom configuration from the file mybatis.properties and enable
 * MapperScan.
 *
 */
@Configuration
@PropertySource("classpath:mybatis.properties")
@MapperScan("com.tanis.mybatis.mappers")
public class MyBatisConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisConfiguration.class);

	public MyBatisConfiguration() {
		LOGGER.info("Setting up MyBatis configuration");
	}

}
