package com.tanis.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mybatis.properties")
@MapperScan("com.tanis.mybatis.mappers")
public class MyBatisConfiguration {

}
