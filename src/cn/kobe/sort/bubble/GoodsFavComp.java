package cn.kobe.sort.bubble;

import java.util.Comparator;

/**
 * ���ղ��������ҵ���ࣨ����
 * @author ko
 *
 */
public class GoodsFavComp implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		
		return o1.getFav()-o2.getFav();
	}
	
}
