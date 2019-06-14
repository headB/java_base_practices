package day13异常.comprehensive01;

//编写一个员工类:
//(1) 有属性:
//编号，姓名，年龄，工资，身份证号码，员工人数，员工工资总额
//(2) 有构造器:
//构造器:设置编号，年龄，姓名;

// 如果年龄小于 18，抛出年龄低异常，

//如果年龄大于 60 抛 出年龄高异常，

//如果姓名为 null 或为空字符串，抛出空异常。
//
//(3) 有方法
//增加工资 addSalary(double addSalary)，声明抛出工资高异常，
//当增加后的工资大于员工工 资总额时，抛出此异常。

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private int id;
	private  static int count;   //员工人数
	private  static double acount;  //工资总额
	
	
	public Employee() {
		
	}
	
	public static int getCount() {
		return count;
	}
	
	public static double getAcount() {
		return acount;
	}
	


	public Employee(String name, int age, double salary, int id) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.id = id;
		
		
		if(this.age <18) {
			throw new LowAgeException("童工啊!犯法的!");
		}
		
		if(this.age >60) {
			throw new HighAgeException("超老啦!");
		}
		
		if(this.name == null || this.name.equals("")) {
			throw new NullPointerException("空的名字啦!");
		}
		
		
		count++;
		acount+=this.salary;
		
		
	}
	
	public void addSalary(double salary) {
		
		if(this.salary+salary > acount) {
			throw new HighSalaryException("工资过高!");
		}
		
	}
	
	

}
