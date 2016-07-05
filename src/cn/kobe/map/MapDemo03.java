package cn.kobe.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ����һ��Student�࣬���ԣ�������name  ��ţ�classNumber �ɼ���score
 * ���ڽ�����student�������List��
 * ͳ�Ƴ�ÿ���༶���ֺܷ�ƽ����
 * ����������˼ά�������
 * @author ko
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		exam(list);
		
		Map<String, ClassRoom> rooms = new HashMap<>();
		//ͳ�Ʒ���
		count(rooms,list);
		printScore(rooms);
	}
	
	//��ӡ�ֺܷ�ƽ����
	public static void printScore(Map<String, ClassRoom> rooms){
		Set<Map.Entry<String, ClassRoom>> entrySet = rooms.entrySet();
		Iterator<Map.Entry<String, ClassRoom>>it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, ClassRoom> entry = it.next();
			ClassRoom room = entry.getValue();
			double avg = room.getTotal()/room.getStus().size();
			System.out.println("���Ϊ��"+room.getNo()+"�ܷ�Ϊ��"+room.getTotal()+"ƽ����:"+avg);
		}
	}
	
	//ͳ�Ʒ���
	public static void count(Map<String, ClassRoom> rooms,List<Student> list){
		/**
		 * ����List���л�ȡ���༶�ţ�����
		 */
		for (Student stu : list) {
			String no = stu.getNo();
			double score = stu.getScore();
			//���ݰ༶��Ų鿴Map�Ƿ���ڸð༶���ּ�˼·
			ClassRoom room = rooms.get(no);
			if (null==room) {//��һ��
				room = new ClassRoom(no);
				rooms.put(no, room);
			}
			//�洢�ܷ�
			room.setTotal(room.getTotal()+score);
			room.getStus().add(stu);//����ѧ��
		}
	}
	
	//���ڽ�����student�������List��
	public static void exam(List<Student> list){
		list.add(new Student("a","001",80));
		list.add(new Student("b","002",90));
		list.add(new Student("c","003",20));
		list.add(new Student("d","002",70));
		list.add(new Student("e","001",100));
	}

}
