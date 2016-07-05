package cn.kobe.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 定义一个Student类，属性：姓名：name  班号：classNumber 成绩：score
 * 现在将若干student对象放入List中
 * 统计出每个班级的总分和平均分
 * 以面向对象的思维解决问题
 * @author ko
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		exam(list);
		
		Map<String, ClassRoom> rooms = new HashMap<>();
		//统计分数
		count(rooms,list);
		printScore(rooms);
	}
	
	//打印总分和平均分
	public static void printScore(Map<String, ClassRoom> rooms){
		Set<Map.Entry<String, ClassRoom>> entrySet = rooms.entrySet();
		Iterator<Map.Entry<String, ClassRoom>>it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, ClassRoom> entry = it.next();
			ClassRoom room = entry.getValue();
			double avg = room.getTotal()/room.getStus().size();
			System.out.println("班号为："+room.getNo()+"总分为："+room.getTotal()+"平均分:"+avg);
		}
	}
	
	//统计分数
	public static void count(Map<String, ClassRoom> rooms,List<Student> list){
		/**
		 * 遍历List从中获取到班级号，分数
		 */
		for (Student stu : list) {
			String no = stu.getNo();
			double score = stu.getScore();
			//根据班级编号查看Map是否存在该班级，分拣思路
			ClassRoom room = rooms.get(no);
			if (null==room) {//第一次
				room = new ClassRoom(no);
				rooms.put(no, room);
			}
			//存储总分
			room.setTotal(room.getTotal()+score);
			room.getStus().add(stu);//加入学生
		}
	}
	
	//现在将若干student对象放入List中
	public static void exam(List<Student> list){
		list.add(new Student("a","001",80));
		list.add(new Student("b","002",90));
		list.add(new Student("c","003",20));
		list.add(new Student("d","002",70));
		list.add(new Student("e","001",100));
	}

}
