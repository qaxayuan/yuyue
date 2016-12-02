package com.yuyue.service;

import com.github.pagehelper.PageInfo;
import com.yuyue.entity.User;

public interface UserService {
	
	User selectUserById(Integer userId);  
	
	PageInfo<User> queryByPage(String userName,Integer pageNo,Integer pageSize); 
}
