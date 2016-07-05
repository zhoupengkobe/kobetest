package cn.kobe.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ��ϰ��������ʹ��
 * ���ַ���ʵ��List�����ı�������
 * 1.forѭ��ʹ�õ��������б���
 * 2.whileѭ��ʹ�õ��������б���
 * @author ko
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("aaaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
	//	whileѭ��ʹ�õ��������б���
		Iterator iter = list.iterator();		
		while(iter.hasNext()){
			String str = (String) iter.next();			
			System.out.println(str);
		}
		System.out.println("#############�������ķָ���##############");
	// for ѭ��ʹ�õ��������б���
		
		for (Iterator iter2 = list.iterator(); iter2.hasNext();) {
			String str2 = (String) iter2.next();
			System.out.println(str2);
		}
	}

}
