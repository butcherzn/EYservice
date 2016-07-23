package com.scrazy.ey.service.csdn.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrazy.ey.dao.UserMapper;
import com.scrazy.ey.dao.csdn.CsdnColumnCategoryMapper;
import com.scrazy.ey.dao.csdn.CsdnColumnProfileMapper;
import com.scrazy.ey.entity.User;
import com.scrazy.ey.entity.csdn.CsdnColumnCategory;
import com.scrazy.ey.entity.csdn.CsdnColumnProfile;
import com.scrazy.ey.service.UserService;
import com.scrazy.ey.service.csdn.CsdnColCategoryService;
import com.scrazy.ey.service.csdn.CsdnColProfileService;



@Service("CsdnColProfileService")
public class CsdnColProfileServiceImpl implements CsdnColProfileService {

	@Autowired 
	private CsdnColumnProfileMapper dao;


	@Override
	public void InsertMoreItem(List<CsdnColumnProfile> list) {
		dao.InsertMoreItem(list);	
	}
}
