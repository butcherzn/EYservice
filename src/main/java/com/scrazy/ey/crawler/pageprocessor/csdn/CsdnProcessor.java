package com.scrazy.ey.crawler.pageprocessor.csdn;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.scrazy.ey.entity.csdn.CsdnColumnProfile;
import com.scrazy.ey.util.CSDNUtil;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

public class CsdnProcessor implements PageProcessor {

	private String StartUrl = null ;
	private int pageNum = 1;
	private int totlePageNum = 0;
	
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

	public Site getSite() {

		return site;
	}

	public void process(Page page) {
		System.out.println(page.getHtml());
	}

}
