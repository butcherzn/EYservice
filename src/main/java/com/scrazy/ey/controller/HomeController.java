package com.scrazy.ey.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scrazy.ey.dao.csdn.CsdnColumnProfileMapper;
import com.scrazy.ey.entity.User;
import com.scrazy.ey.entity.csdn.CsdnColumnCategory;
import com.scrazy.ey.entity.csdn.CsdnColumnProfile;
import com.scrazy.ey.service.UserService;
import com.scrazy.ey.service.csdn.CsdnColCategoryService;
import com.scrazy.ey.service.csdn.CsdnColProfileService;
import com.scrazy.ey.service.impl.UserServiceImpl;
import com.scrazy.ey.util.ApplicationContextHelper;

@Controller
public class HomeController {

	@Autowired
	private CsdnColCategoryService categoryService = null;
	@Resource
	private CsdnColumnProfileMapper csdnProfileService = null;
	@RequestMapping(value = "/home")
	public String home(Model model) {

		model.addAttribute("home", "home");
		List<CsdnColumnCategory> list = categoryService.findAll();
		System.out.println(list.size());
		for (CsdnColumnCategory csdnColumnCategory : list) {
			System.out.println(csdnColumnCategory.toString());
		}
		return "home";
	}
	
	@RequestMapping(value="/json")
	@ResponseBody
	public Object getJson(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("fd", "home");
		return map;
	}
	@RequestMapping(value="/user")
	public String getAllUser(){
		return "home";
	};
}
