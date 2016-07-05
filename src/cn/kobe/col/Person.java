package cn.kobe.col;

public class Person {
	private final String name;//����
	private final int handsome;//˧��ָ��
	
	
	public Person() {
		name = null;
		handsome = 0;
	}
	/**
	 * @param name
	 * @param handsome
	 */
	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public String getName() {
		return name;
	}
	
	public int getHandsome() {
		return handsome;
	}
	
	
	@Override
	public String toString() {
		
		return "������"+this.name+",˧��ָ��"+this.handsome+"\n";
	}

}
