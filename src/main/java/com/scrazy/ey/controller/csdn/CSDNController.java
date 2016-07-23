package com.scrazy.ey.controller.csdn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scrazy.ey.crawler.pageprocessor.csdn.CsdnColumnPageProcessor;
import com.scrazy.ey.crawler.pageprocessor.csdn.CsdnProcessor;
import com.scrazy.ey.crawler.pipeline.CsdnColumnPagePipeline;
import com.scrazy.ey.entity.csdn.CsdnColumnCategory;
import com.scrazy.ey.service.csdn.CsdnColCategoryService;

import us.codecraft.webmagic.Spider;

/**
 * ��ȡ���е�CSDNר������
 * 
 * @author skyfin
 *
 */

@Controller
@RequestMapping(value = "CSDN")
public class CSDNController {

	@Autowired
	private CsdnColCategoryService csdnService = null;

	
	@RequestMapping(value = "/AllColumn")
	@ResponseBody
	public Object getJson() {

		List<CsdnColumnCategory> list = csdnService.findAll();
		System.out.println(list.size());
		for (CsdnColumnCategory csdnColumnCategory : list) {
			System.out.println(csdnColumnCategory.toString());
		}
		return list;
	}

	@RequestMapping(value = "/StartCrawler")
	public String StartCrawler() {
		List<CsdnColumnCategory> list = csdnService.findAll();
		List<String>strlist = new ArrayList<>();
		for (CsdnColumnCategory col : list) {
			Spider.create(new CsdnColumnPageProcessor()).addUrl(col.getUrl())
			.addPipeline(new CsdnColumnPagePipeline()).thread(5).run();
		}
		return "home";
	}
}
