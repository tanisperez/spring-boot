package com.tanis.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@PropertySource("classpath:jpa-hibernate.properties")
@EnableJpaRepositories(basePackages = { "com.tanis.jpa" })
@EntityScan(basePackages = { "com.tanis.jpa" })
public class JPAConfiguration {

}
