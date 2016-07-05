package cn.kobe.sort.bubble;

import java.util.Comparator;
import java.util.List;

public class until {
	/**
	 * 容器的排序,使用Comparator
	 */

	public static <T> void sort(List<T> list,Comparator com){
		// 先将容器转为数组
		Object[] obj = list.toArray();
		sort(obj, com);
		//改变容器的值
		for (int i = 0; i < obj.length; i++) {
			list.set(i, (T) obj[i]);
		}
	}
	
	/**
	 * 数组的排序,使用Comparator
	 */

	public static void sort(Object[] arr,Comparator com){
		boolean sorted = true;
		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {// 趟数
			sorted = true;// 假定有序
			for (int i = 0; i < len - 1 - j; i++) {// 次数

				if (com.compare(arr[i], arr[i+1]) < 0) {
					Object temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;// 假定失败
				}

			}
			if (sorted) {// 减少次数
				break;
			}

		}
	}
	
	
	/**
	 * 容器排序使用泛型方法
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		// 将容器转为数组
		Object[] arr = list.toArray();
		sort(arr);
		//改变容器的值
		for (int j = 0; j < arr.length; j++) {
			list.set(j, (T)arr[j]);
		}
		
	}
	
	
	/**
	 * 数组排序使用泛型方法
	 */
	
	public static <T extends Comparable<T>> void sort(T[] arr){

		boolean sorted = true;
		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {// 趟数
			sorted = true;// 假定有序
			for (int i = 0; i < len - 1 - j; i++) {// 次数

				if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;// 假定失败
				}

			}
			if (sorted) {// 减少次数
				break;
			}

		}
	}
	
	/**
	 * 数组的排序
	 */

	public static void sort(Object[] arr) {

		boolean sorted = true;
		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {// 趟数
			sorted = true;// 假定有序
			for (int i = 0; i < len - 1 - j; i++) {// 次数

				if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {
					Object temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;// 假定失败
				}

			}
			if (sorted) {// 减少次数
				break;
			}

		}
	}
}
