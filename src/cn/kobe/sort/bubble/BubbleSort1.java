package cn.kobe.sort.bubble;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

/**
 * 自己尝试写一个冒泡程序
 * @author ko
 *
 */
public class BubbleSort1 {
	
	public static void sort(int[] a){
		for (int j = 0; j < a.length-1; j++) {
			for (int i = 0; i < a.length-1; i++) {

				if (a[i]<a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}
	

	public static void main(String[] args) {
		int[] a = {1,5,9,23,4};
		sort(a);		
	}

}
