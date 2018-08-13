package com.tanis.mybatis.hello;

import org.springframework.stereotype.Repository;

import com.tanis.database.daos.hello.HelloDAO;

@Repository
public class HelloDAOImpl implements HelloDAO {

	@Override
	public String hello() {
		return "Hello World from MyBatis!";
	}

}
