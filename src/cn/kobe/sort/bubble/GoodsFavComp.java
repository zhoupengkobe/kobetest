package cn.kobe.sort.bubble;

import java.util.Comparator;

/**
 * 按收藏量排序的业务类（升序）
 * @author ko
 *
 */
public class GoodsFavComp implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		
		return o1.getFav()-o2.getFav();
	}
	
}
