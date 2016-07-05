package cn.kobe.sort.bubble;
/**
 * 字符串从小到大排序
 */
import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
		
		String[] arr = {"a","ab","arfg","adf"};
		
		boolean sorted = true;
		int len = arr.length;
		
		for (int j = 0; j < len-1; j++) {//趟数
			sorted = true;//假定有序
			for (int i = 0; i < len-1-j; i++) {//次数

				if (((Comparable)arr[i]).compareTo(arr[i+1])<0) {
					String temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;//假定失败
				}
				
			}
			if (sorted) {//减少次数
				break;
			}

	}
		System.out.println(Arrays.toString(arr));	

	}
}
