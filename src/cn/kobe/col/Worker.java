package cn.kobe.col;

public class Worker implements java.lang.Comparable<Worker>{
	//工种
	private String type;
	//工资
	private double salary;
	
	public Worker() {
		
	}
	
	
	/**
	 * @param type
	 * @param salary
	 */
	public Worker(String type, double salary) {
		super();
		this.type = type;
		this.salary = salary;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		
		return "工种:"+this.type+",工资："+this.salary+"\n";
	}

	/**
	 * 按工资升序
	 */
	@Override
	public int compareTo(Worker o) {
		
		return this.salary>o.salary?1:(this.salary==o.salary)?0:-1;
	}

}
