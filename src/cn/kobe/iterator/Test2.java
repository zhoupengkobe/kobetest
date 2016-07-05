package cn.kobe.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ��ϰ��������ʹ��
 * ���ַ���ʵ��Set�����ı�������
 * 1.forѭ��ʹ�õ��������б���
 * 2.whileѭ��ʹ�õ��������б���
 * @author ko
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("aaaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
	//	whileѭ��ʹ�õ��������б���
		Iterator iter = set.iterator();		
		while(iter.hasNext()){
			String str = (String) iter.next();			
			System.out.println(str);
		}
		System.out.println("#############�������ķָ���##############");
	// for ѭ��ʹ�õ��������б���
		
		for (Iterator iter2 = set.iterator(); iter2.hasNext();) {
			String str2 = (String) iter2.next();
			System.out.println(str2);
		}
	}

}
