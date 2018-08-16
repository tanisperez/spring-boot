package com.tanis.mybatis.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanis.database.daos.user.User;
import com.tanis.database.daos.user.UserDAO;
import com.tanis.mybatis.mappers.UserMapper;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return this.userMapper.findAll();
	}

}
