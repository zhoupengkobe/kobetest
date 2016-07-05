package com.kobe.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * binarySearch  Ҫ����������
 * sort(List list)
 * sort(List list,Comparator c)
 * reverse(List list) ��ת
 * shuffle(List list) ϴ��
 * swap(List list,int i,int j) λ�öԵ�
 * @author ko
 *
 */
public class CollectionsDemo01 {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		//shuffle ϴ�ơ�ģ�⶷����
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
		
		//ϴ��
		Collections.shuffle(cards);
		
		//���η���
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<Integer> p3 = new ArrayList<>();
		List<Integer> last = new ArrayList<>();
		
		for (int i = 0; i < 51; i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		//���������
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		
		System.out.println("��һ���ˣ�"+p1);
		System.out.println("�ڶ����ˣ�"+p2);
		System.out.println("�������ˣ�"+p3);
		System.out.println("���ƣ�"+last);
	}
	
	
	public static void test(){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("��ת֮��:"+list);
	}
}
