package com.kobe.others.guava;

import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * ͳ�Ƶ��ʳ��ֵĴ���
 * 1.HashMap  �ּ�洢+�������˼ά -->�ж�
 * 2.Multiset:����+���ظ�  .count() ��ǿ�˿ɶ���+������
 * @author ko
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		String str = "this is a cat and that is a mice where is the food";
		// �ָ��ַ���
		String[] strArray = str.split(" ");
		//�洢��Multiset ��
		Multiset<String> set = HashMultiset.create();
		for (String strTemp : strArray) {
			set.add(strTemp);
		}
		
		// ��ȡ���еĵ���Set
		Set<String> letters = set.elementSet();
		for (String temp : letters) {
			System.out.println(temp+"--->"+set.count(temp));
		}
		

	}

}
