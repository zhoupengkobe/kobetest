package com.kobe.others.pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties读取配置文件
 * 资源配置文件
 * 使用相对与绝对路径读取
 * load(InputStream inStream) 
   load(Reader reader) 
   loadFromXML(InputStream in)
 * @author ko
 *
 */
public class Demo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties pro = new Properties();
		// 读取  绝对路径
		pro.load(new FileReader("d:/db.properties"));
		
		// 读取  相对路径
		
//		pro.load(new FileReader("src/com/bjsxt/others/pro/db.properties"));
		
		System.out.println(pro.getProperty("user","bjsxt"));
	}

}
