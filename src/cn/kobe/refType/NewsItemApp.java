package cn.kobe.refType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import cn.kobe.sort.bubble.until;

public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news =  new ArrayList<NewsItem>();
		news.add(new NewsItem("中国登上钓鱼岛了，中国人民欢呼了",1000,new Date()));
		news.add(new NewsItem("美国后怕了",50,new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("死神",500,new Date(System.currentTimeMillis()+10000*60*60)));
		
		System.out.println("排序前"+"\n"+news);
		
		//排序
		Collections.sort(news);
		
		System.out.println("排序后"+"\n"+news);
	}
	
	
	
}
