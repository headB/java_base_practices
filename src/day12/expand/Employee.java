package day12.expand;

import java.math.BigDecimal;
import java.util.Date;

//类 Employee 有 
//name(String 类型)、
//age(int 类型)、
//salary(薪水是 BigDecimal 类型)、 
//hireDate(入职日期是 Date 类型)

public class Employee {
	
	//傻逼了吧.忘记私有化成员变量了吧.!啊哈哈哈哈哈!
	
	private String name;
	private int age;
	private BigDecimal salary;
	private Date hireDate;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, BigDecimal salary, Date hireDate) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//日常的javabean
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Date getHireDate() {
		return this.hireDate;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	

}
