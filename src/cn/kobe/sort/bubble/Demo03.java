package cn.kobe.sort.bubble;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 使用until工具类进行排序
 * @author ko
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		
		
		String[] a = {"a","ab","arfg","adf"};
		
		until.sort(a, new StringComp());
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("###################上面使用Comparator数组###########################");
		
		
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("ab");
		list.add("arfg");
		list.add("adf");
		
		until.sort(list);
		
		System.out.println(list);
		
		System.out.println("#######################################");
		
		String[] arr = {"a","ab","arfg","adf"};
		until.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Date 类的使用
		
		Date[] arr2 = new Date[3];
		arr2[0] = new Date();
		arr2[1] = new Date(System.currentTimeMillis()-1000*60*60);
		arr2[2] = new Date(System.currentTimeMillis()+1000*60*60);
		
		until.sort(arr2);
		
		for (Date date : arr2) {
			SimpleDateFormat format = new SimpleDateFormat("今天是"+"yyyy年MM月dd日 E kk点mm分");
			System.out.println(format.format(date));
		}

	}

}
