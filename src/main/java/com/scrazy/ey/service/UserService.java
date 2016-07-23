package com.scrazy.ey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scrazy.ey.entity.User;

public interface UserService {
	public User findUser(int id);
}
