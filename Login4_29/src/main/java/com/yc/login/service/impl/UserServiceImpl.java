package com.yc.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.login.entity.User;
import com.yc.login.mapper.UserMapper;
import com.yc.login.service.UserService;

@Service("userService") //定义bean  bean的名字是userService
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	/*
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	 */
	@Override
	public boolean login(User user) {
		return userMapper.getUser(user)!= null;
	}

}
