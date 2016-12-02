package com.yuyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuyue.entity.User;

public interface UserDao {
	
	/**
	 * @param userId
	 * @return User
	 */
	public User selectUserById(Integer userId);
	
	List<User> selectUserByUserName(@Param("userName") String userName);  

}
