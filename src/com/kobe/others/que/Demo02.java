package com.kobe.others.que;

public class Demo02 {

	public static void main(String[] args) {
		
		MyStack<String> backHistory = new MyStack<String>(3);
		backHistory.push("www.baidu.com");
		backHistory.push("www.google.com");
		backHistory.push("www.sina.com");
		backHistory.push("www.bjsxt.com");
		
		
		System.out.println("¥Û–°:"+backHistory.size());
		
		//±È¿˙
		String item = null;
		while (null!=(item=backHistory.pop())) {
			System.out.println(item);
		}
	}

}
