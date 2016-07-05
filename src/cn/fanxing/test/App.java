package cn.fanxing.test;
/**
 * 获取值：
 * 1.强制类型转化
 * 2.手动类型检查错误：避免转换错误    java.lang.ClassCastException:
 * @author ko
 *
 */
public class App {

	public static void main(String[] args) {
		Object obj = 80;
		//int score = (int) obj;//jdk1.7以后Object-->integer-->自动拆箱
		int score = (Integer)obj;
		System.out.println(score);
		
		//存入整数 int-->Integer-->Object
		Student stu = new Student(80,90);
		int javaseScore =(Integer)stu.getJavase();
		String oracleScore = null;
		if (stu.getOracle() instanceof String) {
			oracleScore = (String) stu.getOracle();
		}
		System.out.println("分数为："+javaseScore+","+oracleScore);
	}

}
