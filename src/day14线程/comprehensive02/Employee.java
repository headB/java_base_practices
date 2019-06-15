package day14线程.comprehensive02;

public class Employee extends Person {
	
	String id;
	double salary;
	int age;

	public Employee(String name, String address,String id,double salary,int age) {
		super(name, address);
		this.id = id;
		this.salary = salary;
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	 
	
	void addSalary() {
		
		this.salary = salary * 0.1+ salary;
		
	}
	
	

}
