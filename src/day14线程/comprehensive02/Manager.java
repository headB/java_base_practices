package day14线程.comprehensive02;

public class Manager extends Employee {
	
	public Manager(String name, String address, String id, double salary, int age,String level) {
		super(name, address, id, salary, age);
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	 String level;
	
	void addSalary() {
		
		this.salary = salary*0.2 + salary;
		
	}
	

}
