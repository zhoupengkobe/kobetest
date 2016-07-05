package cn.kobe.sort.bubble;

import java.util.Comparator;
import java.util.List;

public class until {
	/**
	 * ����������,ʹ��Comparator
	 */

	public static <T> void sort(List<T> list,Comparator com){
		// �Ƚ�����תΪ����
		Object[] obj = list.toArray();
		sort(obj, com);
		//�ı�������ֵ
		for (int i = 0; i < obj.length; i++) {
			list.set(i, (T) obj[i]);
		}
	}
	
	/**
	 * ���������,ʹ��Comparator
	 */

	public static void sort(Object[] arr,Comparator com){
		boolean sorted = true;
		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {// ����
			sorted = true;// �ٶ�����
			for (int i = 0; i < len - 1 - j; i++) {// ����

				if (com.compare(arr[i], arr[i+1]) < 0) {
					Object temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;// �ٶ�ʧ��
				}

			}
			if (sorted) {// ���ٴ���
				break;
			}

		}
	}
	
	
	/**
	 * ��������ʹ�÷��ͷ���
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		// ������תΪ����
		Object[] arr = list.toArray();
		sort(arr);
		//�ı�������ֵ
		for (int j = 0; j < arr.length; j++) {
			list.set(j, (T)arr[j]);
		}
		
	}
	
	
	/**
	 * ��������ʹ�÷��ͷ���
	 */
	
	public static <T extends Comparable<T>> void sort(T[] arr){

		boolean sorted = true;
		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {// ����
			sorted = true;// �ٶ�����
			for (int i = 0; i < len - 1 - j; i++) {// ����

				if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;// �ٶ�ʧ��
				}

			}
			if (sorted) {// ���ٴ���
				break;
			}

		}
	}
	
	/**
	 * ���������
	 */

	public static void sort(Object[] arr) {

		boolean sorted = true;
		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {// ����
			sorted = true;// �ٶ�����
			for (int i = 0; i < len - 1 - j; i++) {// ����

				if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {
					Object temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;// �ٶ�ʧ��
				}

			}
			if (sorted) {// ���ٴ���
				break;
			}

		}
	}
}
