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

public class CsdnColumnPageProcessor implements PageProcessor {

	private String StartUrl = null ;
	private int pageNum = 1;
	private int totlePageNum = 0;
	
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

	public Site getSite() {

		return site;
	}

	public void process(Page page) {
		if(pageNum == 1)
		{
			StartUrl = page.getUrl().toString();
			
			String pageStr = page.getHtml().xpath("//*[@class='page_nav']/span/text()").toString();
			totlePageNum = CSDNUtil.GetPageNum(pageStr);
		}
		
		List<String> allcolumn = page.getHtml().xpath("//*[@class='columns_recom']/").all();
		List<CsdnColumnProfile> Allcolumn = new ArrayList<CsdnColumnProfile>();
		for (String sub : allcolumn) {
			Document doc = Jsoup.parse(sub);
			Html html = new Html(doc);
			CsdnColumnProfile column = new CsdnColumnProfile();
			String columnurl = html.xpath("html/body/dl/dt/a/@href").toString();
			String columntitle = html.xpath("html/body/dl/dd/a/text()").toString();
			String columnintro =  html.xpath("html/body/dl/dd/text()").toString();
			String columnlogo = html.xpath("/html/body/dl/dt/a/img/@src").toString();
			String authorname = html.xpath("html/body/dl/dt/a[@class='builder user_list']/text()").toString();
			String authorurl = html.xpath("html/body/dl/dt/a[@class='builder user_list']/@href").toString();
			String columncategory = StartUrl;
			column.setAuthorurl(authorurl);
			column.setAuthorname(authorname);
			column.setColumncategory(columncategory);
			column.setColumnintro(columnintro);
			column.setColumnlogo(columnlogo);
			column.setColumntitle(columntitle);
			column.setColumnurl(columnurl);
			Allcolumn.add(column);
		}
		page.putField("column", Allcolumn);
		pageNum++;
		System.out.println(totlePageNum);
		if(pageNum <= totlePageNum){
			System.out.println(StartUrl+"?&page="+pageNum);
			page.addTargetRequest(StartUrl+"?&page="+pageNum);
		}
	
	}

}
