package cn.fanxing.test;
/**
 * �����ࣺ����ʱʹ�÷���
 * ��ĸ��
 * T Type��ʾ����
 * K V �ֱ�����ֵ�е�Key Value��
 * E ����Element��
 * ʹ��ʱȷ������
 * ע�⣺
 * 1.����ֻ��ʹ���������ͣ�����ʹ�û�����������
 * 2.��������ʱ��ĸ����ʹ���� ��̬����|��̬������
 * @author ko
 *
 * @param <T1>
 * @param <T2>
 */
public class Student2<T1,T2> {
	private T1 javaScore;
	private T2 oracleScore;
	
	//Cannot make a static reference to the non-static type T1
	//��������ʱ����ʹ�þ�̬����|��̬����
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
		
		//ʹ��ʱָ�����ͣ��������ͣ�
		Student2<String, Integer> stu2 = new Student2<>();
		//1.��ȫ�����ͼ��
		stu2.setJavaScore("����");
		//2.ʡ�ģ�����ת��
		int it = stu2.getOracleScore();//�Զ�����

	}

}
