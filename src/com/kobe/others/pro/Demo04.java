package com.kobe.others.pro;

import java.io.IOException;
import java.util.Properties;

/**
 * ʹ�������·����ȡ�����ļ�
 * @author ko
 *
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		// �����·���� /bin
		
//		pro.load(Demo04.class.getResourceAsStream("/com/kobe/others/pro/db.properties"));
		
		// ""bin
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/kobe/others/pro/db.properties"));
		
		System.out.println(pro.getProperty("user","bjsxt"));
	}

}
