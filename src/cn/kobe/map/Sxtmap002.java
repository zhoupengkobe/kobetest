package cn.kobe.map;

import java.util.LinkedList;

import cn.kobe.map.Sxtmap001.SxtEntry;

/**
 * �Զ���Map��������
 * ��߲�ѯ��Ч��
 * @author ko
 * @param <SxtEntry>
 *
 */
public class Sxtmap002 {
	
	LinkedList[] arr = new LinkedList[990];//Map�ĵײ�ṹ��������+����
	
	int size;
	
	public void put(Object key,Object value){
		SxtEntry e = new SxtEntry(key, value);
		
		int a = key.hashCode()%arr.length;
		if (arr[a]==null) {
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				SxtEntry e2 = (SxtEntry) list.get(i);
				if (e2.key.equals(key)) {
					e2.value = value;//��ֵ�ظ�ֱ�Ӹ���
					return;
				}
			}
			arr[a].add(e);
		}
	}
	
	public Object get(Object key){
		int a = key.hashCode()%arr.length;
		if (arr[a]!=null) {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				SxtEntry e = (SxtEntry) list.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}return null;
	}
	
	public static void main(String[] args) {
		Sxtmap002 m = new Sxtmap002();
		m.put("aaa", "DDDD");
		m.put("aaa", "CCCCC");
		
		
		System.err.println(m.get("aaa"));

	}

}
