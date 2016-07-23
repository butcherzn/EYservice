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
import org.springframework.web.bind.annotation.ResponseBody;

import com.scrazy.ey.dao.csdn.CsdnColumnProfileMapper;
import com.scrazy.ey.entity.User;
import com.scrazy.ey.entity.csdn.CsdnColumnCategory;
import com.scrazy.ey.entity.csdn.CsdnColumnProfile;
import com.scrazy.ey.service.UserService;
import com.scrazy.ey.service.csdn.CsdnColCategoryService;

@Controller
public class HomeController {

	@Autowired
	private CsdnColCategoryService userService = null;
	@Resource
	private CsdnColumnProfileMapper csdnProfileService = null;
	@RequestMapping(value = "/home")
	public String home(Model model) {

		model.addAttribute("home", "home");
		List<CsdnColumnCategory> list = userService.findAll();
		System.out.println(list.size());
		for (CsdnColumnCategory csdnColumnCategory : list) {
			System.out.println(csdnColumnCategory.toString());
		}
		return "home";
	}
	
	
	@RequestMapping(value = "/homeview")
	@ResponseBody
	public Object homeview(HttpServletResponse response) {

		
		List<CsdnColumnCategory> list = userService.findAll();
		System.out.println(list.size());
		for (CsdnColumnCategory csdnColumnCategory : list) {
			System.out.println(csdnColumnCategory.toString());
		}
		return list;
	}
	
	@RequestMapping(value="/json")
	@ResponseBody
	public Object getJson(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("fd", "home");
		return map;
	}
	
	@RequestMapping(value="/test")
	public String getTest(){
		CsdnColumnProfile column = new CsdnColumnProfile();
		List<CsdnColumnProfile>AllColumn = new ArrayList<CsdnColumnProfile>();
		column.setAuthorurl("www.baidu.com");
		column.setAuthorname("www.baidu.com");
		column.setColumncategory("www.baidu.com");
		column.setColumnintro("www.baidu.com");
		column.setColumnlogo("www.baidu.com");
		column.setColumntitle("www.baidu.com");
		column.setColumnurl("www.baidu.com");
		CsdnColumnProfile column1 = new CsdnColumnProfile();

		 column1.setAuthorurl("www.baidu.com1");
		 column1.setAuthorname("www.baidu.com");
		 column1.setColumncategory("www.baidu.com");
		 column1.setColumnintro("www.baidu.com");
		 column1.setColumnlogo("www.baidu.com");
		 column1.setColumntitle("www.baidu.com");
		 column1.setColumnurl("www.baidu.com1");
		
		 AllColumn.add(column);
		 AllColumn.add(column1);
		 csdnProfileService.InsertMoreItem(AllColumn);
		 System.out.println(csdnProfileService);
		return "home";
	}
}
