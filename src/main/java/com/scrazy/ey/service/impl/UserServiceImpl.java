package com.scrazy.ey.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrazy.ey.dao.UserMapper;
import com.scrazy.ey.entity.User;
import com.scrazy.ey.service.UserService;
import com.scrazy.ey.util.MybatisHelper;

@Service("UserService")
public class UserServiceImpl   implements UserService {

	
	
	@Override
	public List<User> findAll() {
	
		return null;
	}
	@Override
	public User findbyId(int id) {
		
		return null;
	}

}
