package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * ��ϰcollection����
 * @author ko
 *
 */
public class Test01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		//ArrayList:�ײ�ʵ�������飬���ԣ���ѯ�죬�޸ĺ�ɾ����
		//LinkedList:�ײ�ʵ�����������ԣ���ѯ�����޸ģ����룬ɾ����
		//Vector:�̰߳�ȫ��Ч�ʵ�
		
		
		
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);//��װ���Զ�װ��
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
//		list.remove(new Date());
//		System.out.println(list.size());
		
		
		List list2 = new ArrayList();
		
		list2.add("bbb");
		list2.add("ccc");
		list.add(list2);
		
		System.out.println(list.size());
		System.out.println(list2.size());
		
		//��˳���йصĲ���
		String str = (String)list.get(0);
		System.out.println(str);
	}
	
}

class Dog{}
