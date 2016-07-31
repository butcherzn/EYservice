package com.scrazy.ey.service;

import java.util.List;

import com.scrazy.ey.entity.User;

public interface UserService {
	public List<User>findAll();
	public User findbyId(int id);
}
