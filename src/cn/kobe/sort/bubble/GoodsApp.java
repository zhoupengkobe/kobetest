package cn.kobe.sort.bubble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {

	public static void main(String[] args) {
		
		List<Goods> list = new ArrayList<>();
		list.add(new Goods("������Ƶ",100,2000));
		list.add(new Goods("�ϸ���Ƶ",5000,3000));
		list.add(new Goods("������Ƶ",1000,1000));
		
		System.out.println("����ǰ��"+list);
		//����
		//Collections.sort(list, new GoodsPriceComp());
		Collections.sort(list,new GoodsFavComp());
		System.out.println("����ǰ��"+list);
	}

}
