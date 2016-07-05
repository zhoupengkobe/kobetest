package cn.kobe.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("aa", "1111");
		map.put("bb", "2222");
		map.put("cc", "3333");
		map.put("dd", "4444");
		
		//遍历Map的第一种方式
		Set keys = map.keySet();  //keySet 方法返回的是一个容器，容器中存放的是Map容器中所有的key对象。
		for (Iterator iters = keys.iterator(); iters.hasNext();) {
			String str = (String) iters.next();
			System.out.println(str+"----"+map.get(str));
		}
		
		System.out.println("#####################华丽的分割线###################");
		//遍历Map的第二种方式   entrySet  效率高，返回的是key和value的集合
				Set<Entry> set2 = map.entrySet();
				for(Iterator iter = set2.iterator();iter.hasNext();){
					Entry e = (Entry) iter.next();
					System.out.println(e.getKey()+"---"+e.getValue());
					
				}

	}

}
