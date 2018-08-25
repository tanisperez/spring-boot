package com.tanis.mybatis.user;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanis.database.daos.user.User;
import com.tanis.database.daos.user.UserDAO;
import com.tanis.mybatis.mappers.UserMapper;

/**
 * UserDAO implementation using MyBatis. It converts UserEntity to User class
 * using a ModelMapper.
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<User> findAll() {
		final List<UserEntity> users = this.userMapper.findAll();
		return users.stream()
				.map(user -> this.modelMapper.map(user, User.class))
				.collect(Collectors.toList());
	}

}
