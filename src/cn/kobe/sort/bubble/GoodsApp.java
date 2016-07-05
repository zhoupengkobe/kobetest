package cn.kobe.sort.bubble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {

	public static void main(String[] args) {
		
		List<Goods> list = new ArrayList<>();
		list.add(new Goods("老马视频",100,2000));
		list.add(new Goods("老高视频",5000,3000));
		list.add(new Goods("老裴视频",1000,1000));
		
		System.out.println("排序前："+list);
		//排序
		//Collections.sort(list, new GoodsPriceComp());
		Collections.sort(list,new GoodsFavComp());
		System.out.println("排序前："+list);
	}

}
