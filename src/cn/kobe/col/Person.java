package cn.kobe.col;

public class Person {
	private final String name;//名称
	private final int handsome;//帅气指数
	
	
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
		
		return "姓名："+this.name+",帅气指数"+this.handsome+"\n";
	}

}
