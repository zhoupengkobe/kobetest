package cn.kobe.sort.bubble;

import java.util.Comparator;

/**
 * ��������ҵ����
 * @author ko
 *
 */
public class StringComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int len1 = o1.length();
		int len2 = o2.length();
		return len1 - len2;
	}

}
