package cn.kobe.col;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo02 {

	public static void main(String[] args) {
		Worker w1 = new Worker("垃圾回收员",12000);
		Worker w2 = new Worker("农民工",8000);
		Worker w3 = new Worker("程序员",5000);
		
		TreeMap<Worker,String> employee = new TreeMap<>();
		employee.put(w1,"kobe");
		employee.put(w2,"kobe");
		employee.put(w3,"kobe");
		
		System.out.println(employee.keySet());

	}

}
