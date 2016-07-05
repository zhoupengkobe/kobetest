package com.kobe.others.guava;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * 函数式编程:解耦
 * 1.Predicate
 * 2.Function
 * 
 * 工具：Collections2.filter() 过滤器
 * Collections2.transfer()
 * Functions.compose(f1, f2)组合式函数编程
 * @author ko
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		// 组合式函数编程
		// 确保容器中的字符串长度不超过5，超过进行截取，后全部大写
		List<String> list = Lists.newArrayList("kobe","good","happoided");
		// 确保容器中的字符串长度不超过5，超过进行截取
		Function<String, String> f1 = new Function<String, String>() {

			@Override
			public String apply(String input) {
				
				return input.length()>5?input.substring(0,5):input;
			}
		};
		//转成大写
		Function<String, String> f2 = new Function<String, String>() {

			@Override
			public String apply(String input) {
				
				return input.toUpperCase();
			}
		};
		
		// String = f2(f1(String))
		
		Function<String, String> f = Functions.compose(f1, f2);
		Collection<String> resultCol = Collections2.transform(list, f);
		
		for (String string : resultCol) {
			System.out.println(string);
		}
		
	}
	
	/**
	 * 转换
	 */
	public static void test02(){
		// 类型转化
				Set<Long> timeSet = Sets.newHashSet();
				timeSet.add(10000000L);
				timeSet.add(99999999999999999L);
				timeSet.add(200000L);
				
				Collection<String> timeStrCol = Collections2.transform(timeSet, new Function<Long, String>() {

					@Override
					public String apply(Long input) {
						
						return new SimpleDateFormat("yyyy-MM-dd").format(input);
					}
				});
				
				for (String temp : timeStrCol) {
					System.out.println(temp);
					
				}
	}
	
	/**
	 * 过滤器	
	 */
	
	public static void test1() {
		// 创建List 静态初始化
				List<String> list = Lists.newArrayList("moom","son","dad","kobe","refer");
				// 找出回文，palindrome backwords mirror words
				//匿名内部类对象：匿名内部类，同时创建类对象
				Collection<String> palindromelist = Collections2.filter(list, new Predicate<String>() {

					@Override
					public boolean apply(String input) {
						// 业务逻辑
						return new StringBuilder(input).reverse().toString().equals(input);
					}
				});
				
				for (String temp : palindromelist) {
					System.out.println(temp);
				}
	}
}
