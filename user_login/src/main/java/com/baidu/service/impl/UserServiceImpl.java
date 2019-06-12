package com.baidu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.bean.User;
import com.baidu.dao.UserDao;
import com.baidu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
