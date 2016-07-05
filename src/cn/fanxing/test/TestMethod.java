package cn.fanxing.test;

import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法<> 返回类型前面
 * 只能访问对象的信息，不能修改信息
 * @author ko
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		
	}
	
	//泛型方法
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
