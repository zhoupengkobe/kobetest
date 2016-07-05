package com.kobe.others.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ʹ��Properties ������ļ�
 * ��Դ�����ļ�:
 * 
 * 1��.properties
 * store(OutputStream out, String comments) 
	store(Writer writer, String comments) 
   2��.xml
   storeToXML(OutputStream os, String comment)  :UTF-8�ַ���
   storeToXML(OutputStream os, String comment, String encoding) 
	

 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//��������
		Properties pro = new Properties();
		//�洢
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		//�洢��d:/others  ����·�����̷�:
		pro.store(new FileOutputStream(new File("d:/db.properties")), "db����");
		//  XML  ��ʽ��
//		pro.storeToXML(new FileOutputStream(new File("d:/others/db.xml")), "db����");
		
		//ʹ�����·��  ��ǰ�Ĺ���
//		pro.store(new FileOutputStream(new File("db.properties")), "db����");
//		pro.store(new FileOutputStream(new File("src/db.properties")), "db����");
//		pro.store(new FileOutputStream(new File("src/com/kobe/others/pro/db.properties")), "db����");
		
		
		
	}
}
