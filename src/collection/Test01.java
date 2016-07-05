package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 练习collection容器
 * @author ko
 *
 */
public class Test01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		//ArrayList:底层实现是数组，所以，查询快，修改和删除慢
		//LinkedList:底层实现是链表，所以，查询慢，修改，插入，删除快
		//Vector:线程安全，效率低
		
		
		
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);//包装类自动装箱
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
//		list.remove(new Date());
//		System.out.println(list.size());
		
		
		List list2 = new ArrayList();
		
		list2.add("bbb");
		list2.add("ccc");
		list.add(list2);
		
		System.out.println(list.size());
		System.out.println(list2.size());
		
		//跟顺序有关的操作
		String str = (String)list.get(0);
		System.out.println(str);
	}
	
}

class Dog{}
