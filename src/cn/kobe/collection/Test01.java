package cn.kobe.collection;
/**
 * 一个对象对应一条记录
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) throws Exception {   //javabean  实体类
		Employee e = new Employee(3010,"高琪",3000,"市场部","2007-10");
		Employee e2 = new Employee(3011,"马士兵",3500,"教学部","2008-08");
		Employee e3 = new Employee(3012,"裴新",3800,"财务部","2010-10");
		
		// 将数据存放到一个容器中，链表
		
		List<Employee> list = new ArrayList();
		list.add(e);
		list.add(e2);
		list.add(e3);
		
		printEmpName(list);
	}
	
	
	public static void printEmpName(List<Employee> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}

}
