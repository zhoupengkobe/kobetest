package cn.kobe.Set;

import java.util.HashMap;

/**
 * �Զ���ʵ���Լ���HashSet
 * @author ko
 *
 */
public class SxtHasSet {
	
	HashMap map;
	private static final Object PRESENT = new Object();
	
	
	public SxtHasSet() {
		map = new HashMap();
	}
	
	public int size(){
		return map.size();
	}
	
	public void add(Object o){
		map.put(o, PRESENT);  //set�Ĳ����ظ�����������map��������󲻿��ظ���
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		SxtHasSet s = new SxtHasSet();
		
		s.add("aaa");
		s.add(new String("aaa"));
		
		System.out.println(s.size());

	}

}
