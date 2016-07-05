package cn.fanxing.test;
/**
 * 泛型类：声明时使用泛型
 * 字母：
 * T Type表示类型
 * K V 分别代表键值中的Key Value。
 * E 代表Element。
 * 使用时确定类型
 * 注意：
 * 1.泛型只能使用引用类型，不能使用基本数据类型
 * 2.泛型声明时字母不能使用在 静态属性|静态方法上
 * @author ko
 *
 * @param <T1>
 * @param <T2>
 */
public class Student2<T1,T2> {
	private T1 javaScore;
	private T2 oracleScore;
	
	//Cannot make a static reference to the non-static type T1
	//泛型声明时不能使用静态属性|静态方法
	//private static T1 test;
	

	public T1 getJavaScore() {
		return javaScore;
	}





	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}





	public T2 getOracleScore() {
		return oracleScore;
	}





	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}





	public static void main(String[] args) {
		
		//使用时指定类型（引用类型）
		Student2<String, Integer> stu2 = new Student2<>();
		//1.安全：类型检擦
		stu2.setJavaScore("优秀");
		//2.省心：类型转化
		int it = stu2.getOracleScore();//自动拆箱

	}

}
