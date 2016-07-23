package com.scrazy.ey.service.csdn.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrazy.ey.dao.UserMapper;
import com.scrazy.ey.dao.csdn.CsdnColumnCategoryMapper;
import com.scrazy.ey.entity.User;
import com.scrazy.ey.entity.csdn.CsdnColumnCategory;
import com.scrazy.ey.service.UserService;
import com.scrazy.ey.service.csdn.CsdnColCategoryService;



@Service("CsdnColCategoryService")
public class CsdnColCategoryServiceImpl implements CsdnColCategoryService {

	@Autowired 
	private CsdnColumnCategoryMapper dao;

	public List<CsdnColumnCategory> findAll() {
		// TODO Auto-generated method stub
		List<CsdnColumnCategory> list = dao.selectAll();
		return list;
	}
}
