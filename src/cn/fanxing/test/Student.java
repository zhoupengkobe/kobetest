package cn.fanxing.test;
/**
 * Object ���Խ����������ͣ���Ϊ������̬
 *
 * @author ko
 *
 * @param 
 */
public class Student {
	private Object javase;
	private Object oracle;
	
	public Student() {
		
	}
	
	/**
	 * @param javase
	 * @param oracle
	 */
	public Student(Object javase, Object oracle) {
		super();
		this.javase = javase;
		this.oracle = oracle;
	}
	
	
	public Object getJavase() {
		return javase;
	}
	public void setJavase(Object javase) {
		this.javase = javase;
	}
	public Object getOracle() {
		return oracle;
	}
	public void setOracle(Object oracle) {
		this.oracle = oracle;
	}
	
	

}
