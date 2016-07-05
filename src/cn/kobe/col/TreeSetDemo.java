package cn.kobe.col;
/**
 * �ṩ�˽���ķ�ʽ��ҵ��������
 */
import java.security.acl.Permission;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1 = new Person("��",100);
		Person p2 = new Person("���»�",1000);
		Person p3 = new Person("����ΰ",1200);
		Person p4 = new Person("����",50);
		
		
		//���η���TreeSet ������,ʹ�������ҵ����
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
		 * TreeSet ���������ʱ����
		 * �����޸Ĳ���Ӱ��ԭ����˳��
		 * ��Ҫ�޸����ݷ�������ظ�
		 * �����޸����ݵķ�ʽ�ǽ������������final
		 */
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons);
	}

}
