package com.tanis.jpa.user;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanis.database.daos.user.User;
import com.tanis.database.daos.user.UserDAO;

/**
 * UserDAO implementation using JPA + Hibernate. It converts UserEntity to User
 * class using a ModelMapper.
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<User> findAll() {
		final List<UserEntity> users = this.userRepository.findAll();
		return users.stream()
				.map(user -> this.modelMapper.map(user, User.class))
				.collect(Collectors.toList());
	}

}
