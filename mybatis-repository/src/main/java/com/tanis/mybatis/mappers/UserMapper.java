package com.tanis.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.tanis.database.daos.user.User;

@Mapper
public interface UserMapper {

	@ResultMap("userMap")
	@Select("SELECT USER_ID, NAME FROM APP.USERS")
	List<User> findAll();

}
