package cn.kobe.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 练习迭代器的使用
 * 两种方法实现Set容器的遍历操做
 * 1.for循环使用迭代器进行遍历
 * 2.while循环使用迭代器进行遍历
 * @author ko
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("aaaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
	//	while循环使用迭代器进行遍历
		Iterator iter = set.iterator();		
		while(iter.hasNext()){
			String str = (String) iter.next();			
			System.out.println(str);
		}
		System.out.println("#############迭代器的分割线##############");
	// for 循环使用迭代器进行遍历
		
		for (Iterator iter2 = set.iterator(); iter2.hasNext();) {
			String str2 = (String) iter2.next();
			System.out.println(str2);
		}
	}

}
