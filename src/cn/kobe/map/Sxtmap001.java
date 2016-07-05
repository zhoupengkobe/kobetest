package cn.kobe.map;
/**
 * �Զ���ʵ��Map�Ĺ��ܣ�
 * �ݲ�������
 * Map����ż�ֵ�ԣ����ݼ������Ҷ�Ӧ��ֵ����
 * @author ko
 *
 */

public class Sxtmap001 {
	
	SxtEntry[] arr = new SxtEntry[990];
	int size;
	
	public void put(Object key,Object value) {
		SxtEntry e = new SxtEntry(key, value);
		//�����ֵ�ظ�������
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				arr[i].value = value;
				return;
			}			
		}
		arr[size++] = e;
	}
	
	public Object get(Object key){
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return arr[i].value;
			}			
		}
		return null;
	}
	
	public boolean containsKey(Object key){
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return true;
			}			
		}
		return false;
	}
	
	public boolean containsValue(Object value){
		for (int i = 0; i < size; i++) {
			if (arr[i].value.equals(value)) {
				return true;
			}			
		}
		return false;
	}
	

	public static void main(String[] args) {
		Sxtmap001 map = new Sxtmap001();
		map.put("aaa", "bbbb");
		map.put("aaa", "cccc");
		System.err.println(map.get("aaa"));

	}
	
public static class SxtEntry{
	Object key;
	Object value;
	/**
	 * @param key
	 * @param value
	 */
	public SxtEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}

}
