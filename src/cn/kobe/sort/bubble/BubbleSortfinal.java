package cn.kobe.sort.bubble;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

/**
 * �Լ�����дһ��ð�ݳ���
 * ���հ棬û�н���ֹͣѭ��
 * @author ko
 *
 */
public class BubbleSortfinal {
	
	public static void sortfinal(int[] a){
		boolean sorted = true;
		int len = a.length;
		
		for (int j = 0; j < len-1; j++) {//����
			sorted = true;//�ٶ�����
			System.out.println("��"+(j+1)+"��");
			for (int i = 0; i < len-1-j; i++) {//����

				if (a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;//�ٶ�ʧ��
				}
				System.out.println(Arrays.toString(a));
			}
			if (sorted) {//���ٴ���
				break;
			}
		}
		
	}
	

	public static void main(String[] args) {
		int[] a = {9,1,2,3,4};
//		a = new int[] {9,1,2,3,4};
		sortfinal(a);		
	}

}
