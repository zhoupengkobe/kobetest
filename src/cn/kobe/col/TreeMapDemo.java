package cn.kobe.col;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Person p1 = new Person("��",100);
		Person p2 = new Person("���»�",1000);
		Person p3 = new Person("����ΰ",1200);
		Person p4 = new Person("����",50);
		
		
		TreeMap<Person, String> map = new TreeMap<>(
				new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						
						return -(o1.getHandsome()-o2.getHandsome());
					}
					
					
				}
				
				);
		map.put(p1, "kobe");
		map.put(p2, "kobe");
		map.put(p3, "kobe");
		map.put(p4, "kobe");
		
		//�鿴��ֵ
		Set<Person> persons = map.keySet();
		System.out.println(persons);
	}

}
