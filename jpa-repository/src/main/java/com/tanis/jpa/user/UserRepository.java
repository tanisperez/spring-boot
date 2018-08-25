package com.tanis.jpa.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * User Repository using JPA and Hibernate.
 *
 */
public interface UserRepository extends Repository<UserEntity, Long> {

	@Query("SELECT u FROM User u")
	List<UserEntity> findAll();

}
