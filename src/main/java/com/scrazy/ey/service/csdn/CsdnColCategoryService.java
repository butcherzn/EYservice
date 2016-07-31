package com.scrazy.ey.service.csdn;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scrazy.ey.entity.csdn.CsdnColumnCategory;

public interface CsdnColCategoryService {
	public List<CsdnColumnCategory> findAll();
}
