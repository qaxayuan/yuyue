package com.yuyue.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  

import com.github.pagehelper.PageInfo;
import com.yuyue.baseTest.SpringTestCase;  
import com.yuyue.entity.User;

public class UserServiceTest extends SpringTestCase {
	
	@Autowired  
    private UserService userService; 
	
	@Test  
    public void queryByPageTest(){  
        PageInfo<User> page =  userService.queryByPage(null, 1, 1);
        System.out.println(page);
    }
}
