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
		
		//����Map�ĵ�һ�ַ�ʽ
		Set keys = map.keySet();  //keySet �������ص���һ�������������д�ŵ���Map���������е�key����
		for (Iterator iters = keys.iterator(); iters.hasNext();) {
			String str = (String) iters.next();
			System.out.println(str+"----"+map.get(str));
		}
		
		System.out.println("#####################�����ķָ���###################");
		//����Map�ĵڶ��ַ�ʽ   entrySet  Ч�ʸߣ����ص���key��value�ļ���
				Set<Entry> set2 = map.entrySet();
				for(Iterator iter = set2.iterator();iter.hasNext();){
					Entry e = (Entry) iter.next();
					System.out.println(e.getKey()+"---"+e.getValue());
					
				}

	}

}
