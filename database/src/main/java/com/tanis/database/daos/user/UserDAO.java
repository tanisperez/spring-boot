package com.tanis.database.daos.user;

import java.util.List;

/**
 * User DAO API, whose implementations are in repository modules: jpa or
 * mybatis.
 *
 */
public interface UserDAO {

	/**
	 * Find all users on the database.
	 *
	 * @return List of users.
	 */
	List<User> findAll();

}
