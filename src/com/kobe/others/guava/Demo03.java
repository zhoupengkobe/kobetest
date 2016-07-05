package com.kobe.others.guava;

import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.Constraint;
import com.google.common.collect.Constraints;
import com.google.common.collect.Sets;

/**
 * ����Լ���������ǿգ�������֤
 * Constraint
 * Preconditions
 * @author ko
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		Set<String> sets = Sets.newHashSet();
		// ����Լ��
		Constraint<String> constraint = new Constraint<String>() {

			@Override
			public String checkElement(String element) {
				//�ǿ���֤
				Preconditions.checkNotNull(element);
				//������֤5-20Ϊ�ַ���
				Preconditions.checkArgument(element.length()>=5 && element.length()<=20);
				
				return element;
			}
			
		};
		
		Set<String> cs = Constraints.constrainedSet(sets, constraint);
//		cs.add(null);//java.lang.NullPointerException
//		cs.add("good");//java.lang.IllegalArgumentException
		cs.add("bjsxt");
		
		for (String string : cs) {
			System.out.println(string);
		}
		
	}

}
