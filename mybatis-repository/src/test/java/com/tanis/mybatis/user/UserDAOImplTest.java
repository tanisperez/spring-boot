package com.tanis.mybatis.user;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tanis.database.H2DBConfiguration;
import com.tanis.database.daos.user.User;
import com.tanis.database.daos.user.UserDAO;
import com.tanis.mybatis.MyBatisConfiguration;
import com.tanis.mybatis.mappers.UserMapper;

@RunWith(SpringRunner.class)
@MybatisTest
@SpringBootTest(classes = { UserDAOImpl.class, UserMapper.class, H2DBConfiguration.class, MyBatisConfiguration.class })
public class UserDAOImplTest {

	@Autowired
	private UserDAO userDAO;

	@Test
	public void testFindAll() {
		final List<User> users = this.userDAO.findAll();
		Assert.assertTrue(!users.isEmpty());
	}

}
