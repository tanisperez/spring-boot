package com.tanis.jpa.user;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tanis.database.H2DBConfiguration;
import com.tanis.database.daos.user.User;
import com.tanis.database.daos.user.UserDAO;
import com.tanis.jpa.JPAConfiguration;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = { UserDAOImpl.class, H2DBConfiguration.class, ModelMapper.class, JPAConfiguration.class })
public class UserDAOImplTest {

	@Autowired
	private UserDAO userDAO;

	@Test
	public void testFindAll() {
		final List<User> users = this.userDAO.findAll();
		Assert.assertTrue(!users.isEmpty());
	}

}
