package com.kobe.others.guava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * 分析查看教师教授的每门课程
 * Multimap"key-value  key 可以重复
 * @author ko
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		Map<String, String> cours = new HashMap<>();
		//加入测试数据
		cours.put("改革开放", "邓爷爷");
		cours.put("三个代表", "江主席");
		cours.put("科学发展观", "胡主席");
		cours.put("和谐社会", "胡主席");
		cours.put("八荣八耻", "胡主席");
		cours.put("....", "习主席");
		
		//Multimap
		Multimap<String, String> teachers = ArrayListMultimap.create();
		
		//迭代器
		Iterator<Map.Entry<String, String>> it = cours.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,String> entry = it.next();
			String key = entry.getKey(); //课程
			String value = entry.getValue();//教师
			
			//教师--> 课程
			teachers.put(value, key);			
			
		}
		
		//查看Multimap
		Set<String> keyset = teachers.keySet();
		for (String key : keyset) {
			Collection<String> col = teachers.get(key);
			System.out.println(key+"-->"+col);
		}
		
		
	}

}
