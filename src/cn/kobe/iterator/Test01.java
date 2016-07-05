package cn.kobe.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 练习迭代器的使用
 * 两种方法实现List容器的遍历操做
 * 1.for循环使用迭代器进行遍历
 * 2.while循环使用迭代器进行遍历
 * @author ko
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("aaaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
	//	while循环使用迭代器进行遍历
		Iterator iter = list.iterator();		
		while(iter.hasNext()){
			String str = (String) iter.next();			
			System.out.println(str);
		}
		System.out.println("#############迭代器的分割线##############");
	// for 循环使用迭代器进行遍历
		
		for (Iterator iter2 = list.iterator(); iter2.hasNext();) {
			String str2 = (String) iter2.next();
			System.out.println(str2);
		}
	}

}
