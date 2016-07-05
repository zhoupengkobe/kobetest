package cn.fanxing.test;

import java.io.Closeable;
import java.io.IOException;

/**
 * ���ͷ���<> ��������ǰ��
 * ֻ�ܷ��ʶ������Ϣ�������޸���Ϣ
 * @author ko
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		
	}
	
	//���ͷ���
	public static <T> void test(T a){
		System.out.println(a);
	}
	
	//extends <=
	public static <T extends Closeable> void test(T... a){
		for (T temp : a) {
			if (null!=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
