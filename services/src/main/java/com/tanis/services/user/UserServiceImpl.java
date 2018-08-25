package com.tanis.services.user;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanis.database.daos.user.User;
import com.tanis.database.daos.user.UserDAO;

/**
 * User Service implementation.
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<UserDTO> findAll() {
		final List<User> users = this.userDAO.findAll();
		return users.stream()
				.map(user -> this.modelMapper.map(user, UserDTO.class))
				.collect(Collectors.toList());
	}

}
