package com.kobe.others.guava;

import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

/**
 * ���ϵĲ������������������
 * @author ko
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		Set<Integer> sets = Sets.newHashSet(1,2,3,4,5,6);
		Set<Integer> sets2 = Sets.newHashSet(3,4,5,6,7,8,9);
		
		// ����
		System.out.println("����Ϊ��");
		SetView<Integer> intersection = Sets.intersection(sets, sets2);
		for (Integer temp : intersection) {
			System.out.println(temp);
		}
		
		//�
		System.out.println("�Ϊ��");
		SetView<Integer> diff = Sets.difference(sets, sets2);
		for (Integer temp : diff) {
			System.out.println(temp);
		}
		//����
		System.out.println("����Ϊ��");
		SetView<Integer> union = Sets.union(sets, sets2);
		for (Integer temp : union) {
			System.out.println(temp);
		}
		

	}

}
