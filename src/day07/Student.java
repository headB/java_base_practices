package day07;

public class Student {
	
	
//	Student.java
//	需求：定义一个符合JavaBean规范的学生类
//	作业要求：
//	（1）学生有姓名、年龄两个字段
//	（2）符合JavaBean规范
	
	//记得设置的时候是带参数的!
	//然后记得格式是  [修饰符] [数据类型]
	
	public Student() {
		
	}
	
	private String name;
	private int age;
	
	//这个需要把字段名字和形式参数的变量名一样,用于特别声明不同this就会出现问题的情况
	public Student(String name,int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge(int a) {
		
		age = a;
		
		
	}
	
	public int getAge() {
		
		return age;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
