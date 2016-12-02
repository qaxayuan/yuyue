package com.yuyue.baseTest;

import org.junit.Test;
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

import com.yuyue.entity.User;
import com.yuyue.service.UserService;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })  
@RunWith(SpringJUnit4ClassRunner.class)  
public class SpringTestCase extends AbstractJUnit4SpringContextTests {

	@Autowired  
    private UserService userService; 
	
	@Test  
    public void selectUserByIdTest(){  
      User user = userService.selectUserById(1);  
      System.out.println(user.getUserName() + ":" + user.getUserPassword());
    } 
}
