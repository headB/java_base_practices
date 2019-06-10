package day08.expand.expand02;


//其中学生类中含有一门课程，
//还有学生姓名、年龄这两个成员变量。课程类中含有课程名称、成绩。
//给出以下学生课程信息表：
//·学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
//·学生姓名：王飞，年龄:15,课程名称：数学，数学成绩：98
//
//
//要求：1）按照JavaBean规范定义学生类（Student）和课程类（Course）。
//      2）使用有参构造器，根据学生课程信息表创建黄小铭和王飞两个对象。

 

public class Student {

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
	}

	private String name;
	private int age;
	private Course course;
	
	public Student() {
		
	}
	
	//准备定义一个带有参数的构造器
	//·学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
	public Student(String name,int age,String courseName,double courseScore) {
		
		this.name = name;
		this.age = age;
		this.course = new Course(courseName,courseScore);
		//然后这里顺便实例化一个Course对象?
		
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}
