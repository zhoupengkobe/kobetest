package cn.kobe.col;
/**
 * ʵ����ʵ��Comparable�ӿڵ�Ӧ��
 */
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		Worker w1 = new Worker("��������Ա",12000);
		Worker w2 = new Worker("ũ��",8000);
		Worker w3 = new Worker("����Ա",5000);
		
		TreeSet<Worker> employee = new TreeSet<>();
		employee.add(w1);
		employee.add(w2);
		employee.add(w3);
		
		System.out.println(employee);
	}

}
