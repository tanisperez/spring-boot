package com.tanis.database;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:h2db.properties")
public class H2DBConfiguration {

}
