package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList，帮助我们更好的理解 Arraylist
 * 类的底层结构！
 * @author ko
 *
 */
public  class SxtArrayList {
	
	private Object[] elementData;
	
	private int size;
	
	public SxtArrayList(){
		this(10);
	}
	
	public int size(){
		return size;
	}
	
	private void RangeChaeck(int index) {
		if (index>=size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public Object get(int index){
		RangeChaeck(index);
		return elementData[index];
	}
	
	public void remove(int index){
		
		RangeChaeck(index);
		//删除指定位置的对象
		int remNum = size-index-1;
		if (remNum>0) {
			
			System.arraycopy(elementData, index+1, elementData, index, remNum);
		}
		
		elementData[size--]=null;
	}
	
	public void remove(Object obj){
		
		for (int i = 0; i < size; i++) {
			if (get(i).equals(obj)) {
				remove(i);
			}
		}
		
		elementData[size--] = null;
	}
	
	public void add(int index,Object obj){
		RangeChaeck(index);
		int removeNum = size-index;
		System.arraycopy(elementData, index, elementData, index+1, removeNum);
		elementData[index] = obj;
		size++;
	}
	
	public Object Set(int index, Object obj){
		RangeChaeck(index);
		Object oldValue = elementData[index];
		elementData[index] = obj;
		return oldValue;
	}
	public SxtArrayList(int initialCapacity){
		if (initialCapacity<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		elementData = new Object[initialCapacity];
	}
	
	public void add(Object obj) {
		//数组扩容和数据的拷贝
		ensureCapacity();
		elementData[size++] = obj;
	}
	
	public void ensureCapacity(){
		//数组扩容和数据的拷贝
		if (size==elementData.length) {
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
		
//			for (int i = 0; i < elementData.length; i++) {
//				newArray[i] = elementData[i];
//			}
//			
			elementData = newArray;
		}
	}
	
	public static void main(String[] args) {
		SxtArrayList list = new SxtArrayList();
		
		list.add("333");
		list.add("444");
		list.add("5");
		list.add("121233");
		list.add("345");
		list.add("39990");
		
		list.Set(3, "ccc");
		
		System.out.println(list.get(3));
		System.out.println(list.size());
	}

}
