package cn.kobe.collection;
/**
 * һ�������Ӧһ����¼
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) throws Exception {   //javabean  ʵ����
		Employee e = new Employee(3010,"����",3000,"�г���","2007-10");
		Employee e2 = new Employee(3011,"��ʿ��",3500,"��ѧ��","2008-08");
		Employee e3 = new Employee(3012,"����",3800,"����","2010-10");
		
		// �����ݴ�ŵ�һ�������У�����
		
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
