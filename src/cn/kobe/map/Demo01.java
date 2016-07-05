package cn.kobe.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a cat and that is a mice and where is the food
 * Ϊ���е�key����������֮���������д�Ŷ�Ӧ��value
 * @author ko
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		String str = "this is a cat and that is a mice and where is the food";
		String[] Arrstr = str.split(" ");
		
		Map<String,Letter> letters = new HashMap<>();
		
		for (String temp : Arrstr) {
			if (!letters.containsKey(temp)) {
				letters.put(temp, new Letter());
			}
			Letter col = letters.get(temp);
			int size = col.getCount()+1;
			col.setCount(size);
		}
		
		//��ӡMap�е�ֵ
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter col = letters.get(key);
			System.out.println("��ĸ"+key+"����"+col.getCount());
		}

	}

}
