package cn.kobe.Set;

import java.util.HashMap;

/**
 * 自定义实现自己的HashSet
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
		map.put(o, PRESENT);  //set的不可重复就是利用了map里面键对象不可重复！
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		SxtHasSet s = new SxtHasSet();
		
		s.add("aaa");
		s.add(new String("aaa"));
		
		System.out.println(s.size());

	}

}
