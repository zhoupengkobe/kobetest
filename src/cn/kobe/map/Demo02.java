package cn.kobe.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a cat and that is a mice and where is the food
 * 第一次创建容器，假定容器为空，并存放value值，第二次之后直接使用容器存放值
 * @author ko
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		String str = "this is a cat and that is a mice and where is the food";
		String[] Arrstr = str.split(" ");
		
		Map<String, Letter> letters = new HashMap<>();
		
		for (String temp : Arrstr) {
			Letter col = null;
			if (null==(col=letters.get(temp))) {
				col = new Letter();
				col.setCount(1);
				letters.put(temp, col);
			}else {
				col.setCount(col.getCount()+1);
				
			}
		
		}	
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter col = letters.get(key);
			System.out.println("字母"+key+"次数"+col.getCount());
		}

	}

}
