package cn.kobe.sort.bubble;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("ab");
		list.add("arfg");
		list.add("adf");
		
		until.sort(list, new StringComp());
		
		System.out.println(list);
		
		System.out.println("###################上面使用Comparator容器###########################");

	}

}
