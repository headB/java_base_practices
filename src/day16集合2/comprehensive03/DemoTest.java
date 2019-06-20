package day16集合2.comprehensive03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//分别创建员工类(Employee)和部门类(Department)，
//其中员工包含员工姓名(name)， 年龄(age)。
//部门类中含有部门名称(deptName)，
//每个部门中含有一个集合(emps)表 示一个部门中含有多个员工，每个员工是是唯一的，无需记录添加顺序。

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//创建多个员工类.
		
		Employee e1 = new Employee("kumanxuan",18);
		Employee e2 = new Employee("beetle123123",25);
		
		Department d1 = new Department("service");
		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		d1.getEmps().add(e1);
		
		System.out.println(d1);
		

	}

}

class Employee{
	
	private String name;
	private int age;
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}


	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	
	
}

class Department{
	
	private String deptName;
	private Set<Employee> emps = new HashSet<>();
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", emps=" + emps + "]";
	}
	public Department(String deptName) {
		super();
		this.deptName = deptName;
//		this.emps = emps;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<Employee> getEmps() {
		return emps;
	}
//	public void setEmps(List<Employee> emps) {
//		this.emps = emps;
//	}
	
	
	
	
	
	
}
