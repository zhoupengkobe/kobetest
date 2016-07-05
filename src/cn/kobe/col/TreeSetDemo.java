package cn.kobe.col;
/**
 * 提供了解耦的方式：业务排序类
 */
import java.security.acl.Permission;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1 = new Person("您",100);
		Person p2 = new Person("刘德华",1000);
		Person p3 = new Person("梁朝伟",1200);
		Person p4 = new Person("老裴",50);
		
		
		//依次放入TreeSet 容器中,使用排序的业务类
		TreeSet<Person> persons = new TreeSet<>(
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						
						return o1.getHandsome()-o2.getHandsome();
					}
					
				}
				);
		persons.add(p1);
		/**
		 * TreeSet 在添加数据时排序
		 * 数据修改不会影响原来的顺序
		 * 不要修改数据否则可能重复
		 * 限制修改数据的方式是将数据属性添加final
		 */
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons);
	}

}
