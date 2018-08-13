package com.tanis.services.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanis.database.daos.hello.HelloDAO;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloDAO helloDAO;

	@Override
	public String hello() {
		return this.helloDAO.hello();
	}

}
