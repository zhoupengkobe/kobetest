package cn.fanxing.test;
/**
 * ��ȡֵ��
 * 1.ǿ������ת��
 * 2.�ֶ����ͼ����󣺱���ת������    java.lang.ClassCastException:
 * @author ko
 *
 */
public class App {

	public static void main(String[] args) {
		Object obj = 80;
		//int score = (int) obj;//jdk1.7�Ժ�Object-->integer-->�Զ�����
		int score = (Integer)obj;
		System.out.println(score);
		
		//�������� int-->Integer-->Object
		Student stu = new Student(80,90);
		int javaseScore =(Integer)stu.getJavase();
		String oracleScore = null;
		if (stu.getOracle() instanceof String) {
			oracleScore = (String) stu.getOracle();
		}
		System.out.println("����Ϊ��"+javaseScore+","+oracleScore);
	}

}
