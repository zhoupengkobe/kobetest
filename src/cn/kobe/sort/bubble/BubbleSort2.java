package cn.kobe.sort.bubble;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

/**
 * �Լ�����дһ��ð�ݳ���
 * @author ko
 *
 */
public class BubbleSort2 {
	
	public static void sort(int[] a){
		int len = a.length;
		for (int j = 0; j < len-1; j++) {//����
			System.out.println("��"+(j+1)+"��");
			for (int i = 0; i < len-1-j; i++) {//����

				if (a[i]<a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
		
	}
	

	public static void main(String[] args) {
		int[] a = {1,5,9,23,4};
		sort(a);		
	}

}
