package com.kobe.others.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * HashMap  ��Ψһ��ֵ�����ظ�
 * BiMap:˫��Map(Bidirectional Map)����ֵ�������ظ���unique-valued map��
 * @author ko
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		BiMap<String, String> bimap = HashBiMap.create();
		bimap.put("njsxt", "bjsxt@sina.com");
		bimap.put("good", "good@sina.com");
		//ͨ���������û�
		String user = bimap.inverse().get("bjsxt@sina.com");
		System.out.println(user);
		
		System.out.println(bimap.inverse().inverse()==bimap);
		
	}

}
