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
		news.add(new NewsItem("�й����ϵ��㵺�ˣ��й����񻶺���",1000,new Date()));
		news.add(new NewsItem("����������",50,new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("����",500,new Date(System.currentTimeMillis()+10000*60*60)));
		
		System.out.println("����ǰ"+"\n"+news);
		
		//����
		Collections.sort(news);
		
		System.out.println("�����"+"\n"+news);
	}
	
	
	
}
