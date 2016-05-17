package com.yc.login.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.login.entity.User;
import com.yc.login.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)		//指定单元测试使用spring框架
@ContextConfiguration(value={"classpath:spring-mybatis.xml","classpath:spring-common.xml"})	//指定spring的配置文件路径

//@ContextConfiguration(value={"classpath:spring.xml"})
public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;
	@Test
	public void testLogin() {
		
		User user= new User("admin","admin");
		boolean result = userService.login(user);
		assertEquals(true, result);
	}

}


