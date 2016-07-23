package com.scrazy.ey.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrazy.ey.dao.UserMapper;
import com.scrazy.ey.entity.User;
import com.scrazy.ey.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper dao;

	public User findUser(int id) {
		// TODO Auto-generated method stub
		User user = dao.selectByPrimaryKey(id);
		return user;
	}
}
