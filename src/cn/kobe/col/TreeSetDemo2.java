package cn.kobe.col;
/**
 * 实体类实现Comparable接口的应用
 */
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		Worker w1 = new Worker("垃圾回收员",12000);
		Worker w2 = new Worker("农民工",8000);
		Worker w3 = new Worker("程序员",5000);
		
		TreeSet<Worker> employee = new TreeSet<>();
		employee.add(w1);
		employee.add(w2);
		employee.add(w3);
		
		System.out.println(employee);
	}

}
