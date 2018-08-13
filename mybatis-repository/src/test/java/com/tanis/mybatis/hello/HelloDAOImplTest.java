package com.tanis.mybatis.hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tanis.database.daos.hello.HelloDAO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { HelloDAOImpl.class })
public class HelloDAOImplTest {

	@Autowired
	private HelloDAO helloDAO;

	@Test
	public void testHello() {
		final String hello = this.helloDAO.hello();
		Assert.assertTrue("Hello World from MyBatis!".equals(hello));
	}

}
