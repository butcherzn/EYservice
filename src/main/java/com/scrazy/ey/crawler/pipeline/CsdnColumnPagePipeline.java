package com.scrazy.ey.crawler.pipeline;

import java.util.List;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scrazy.ey.dao.csdn.CsdnColumnProfileMapper;
import com.scrazy.ey.entity.csdn.CsdnColumnProfile;
import com.scrazy.ey.service.csdn.CsdnColProfileService;
import com.scrazy.ey.service.csdn.impl.CsdnColProfileServiceImpl;
import com.scrazy.ey.util.ApplicationContextHelper;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


public class CsdnColumnPagePipeline implements Pipeline  {
	
	CsdnColProfileService us=ApplicationContextHelper.getBean(CsdnColProfileService.class);
	@Override
	public void process(ResultItems resultItems, Task task) {
		List<CsdnColumnProfile> AllColumn = (List<CsdnColumnProfile>)resultItems.get("column");
		us.InsertMoreItem(AllColumn);
	}
}
