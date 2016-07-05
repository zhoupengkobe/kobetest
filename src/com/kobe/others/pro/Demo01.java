package com.kobe.others.pro;

import java.util.Properties;

/**
 * Properties ��Դ�����ļ��Ķ�д
 * 1. key �� value ֻ��Ϊ�ַ���
 * 
 * @author ko
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//��������
		Properties pro = new Properties();
		//�洢
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		//pro.setProperty("url", "jdbc:oracle:thin@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//��ȡ
		String url = pro.getProperty("url","test");
		System.out.println(url);
	}

}
