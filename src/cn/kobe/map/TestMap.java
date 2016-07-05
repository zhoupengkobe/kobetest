package cn.kobe.map;

import java.util.HashMap;
import java.util.Map;
/**
 * ����Map�Ļ����÷�
 * @author ko
 *
 */
public class TestMap {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("����", new Wife("������"));
		map.put("����", new Wife("��С��"));
		map.put("����", new Wife("����"));
		
		Wife w = (Wife) map.get("����");
		
		map.remove("����");
		
		map.containsKey("����");
		
		System.out.println(w.name);

	}

}


class Wife{
	String name;
	public Wife(String name) {
		this.name = name;
	}
}