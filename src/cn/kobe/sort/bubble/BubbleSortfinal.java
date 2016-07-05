package cn.kobe.sort.bubble;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

/**
 * 自己尝试写一个冒泡程序
 * 最终版，没有交换停止循环
 * @author ko
 *
 */
public class BubbleSortfinal {
	
	public static void sortfinal(int[] a){
		boolean sorted = true;
		int len = a.length;
		
		for (int j = 0; j < len-1; j++) {//趟数
			sorted = true;//假定有序
			System.out.println("第"+(j+1)+"趟");
			for (int i = 0; i < len-1-j; i++) {//次数

				if (a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;//假定失败
				}
				System.out.println(Arrays.toString(a));
			}
			if (sorted) {//减少次数
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
