package com.kobe.others.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * 只读设置
 * @author ko
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		// 对原有的list进行包装，相当于原有List的一个视图，快照，不够安全
		List<String> readList = Collections.unmodifiableList(list);
		// java.lang.UnsupportedOperationException  只读
//		readList.add("d");
		
		list.add("d");//改变原有的List视图也跟着一起改变
		
		//对比查看 初始化List  guava 对只读设置安全可靠，并且相对简单
		List<String> immutableList = ImmutableList.of("a", "b", "c");
		immutableList.add("d");  //java.lang.UnsupportedOperationException
		
		
	}

}
