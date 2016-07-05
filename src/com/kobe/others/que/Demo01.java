package com.kobe.others.que;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ʹ�ö���ģ�����д��ӿ�
 * @author ko
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		Queue<Request> que = new ArrayDeque<>();
		//ģ���Ŷ����
		for (int i = 0; i < 10; i++) {
			final int num = i;
			que.offer(new Request() {
				
				@Override
				public void deposit() {
					System.out.println("��"+num+"���ˣ�������ҵ��,�����Ϊ��"+(Math.random()*10000));
					
					
				}
			});
		}
		dealWith(que);
	}
	
	//������ҵ��
	public static void dealWith(Queue<Request> que){
		Request req = null;
		while (null!=(req=que.poll())) {
			req.deposit();
		}
	}
	

}


interface Request{
	//���
	void deposit();
}
