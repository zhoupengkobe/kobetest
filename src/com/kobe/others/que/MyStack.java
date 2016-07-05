package com.kobe.others.que;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ʹ�ö���ʵ���Զ����ջ
 * 1.��
 * 2.ѹ
 * 3.��ȡͷ
 * @author ko
 *
 */
public class MyStack<E> {
	//����
	private Deque<E> container = new ArrayDeque<E>();
	//����
	private int cap;
	/**
	 * @param cap
	 */
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	
	//ѹջ
	public boolean push(E e){
		if (container.size()+1>cap) {
			return false;
		}
		return container.offerLast(e);
	}
	
	//��ջ
	public E pop(){
		return container.pollLast();
	}
	
	//��ȡ
	
	public E peek(){
		return container.peekLast();
	}
	
	public int size(){
		return this.container.size();
	}
}
