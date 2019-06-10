package day08.extend_demo;


//2.第二题ExtendDemo.java（重点）
//需求：使用面向对象的知识定义出
//老师（Teacher）、学生（Student）、员工（Employee）三个类：
//
//n 老师：拥有名字、年龄、级别三个状态，有授课和休息两个功能
//n 学生：拥有名字、年龄、学好三个状态，有学习和休息两个功能
//n 员工：拥有名字、年龄、入职时间三个状态，有工作和休息两个功能

public class ExtendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher();
		
		Student s1 = new Student();
		
		Employee e1 = new Employee();
		
		t1.setName("beetle");
		System.out.println(t1.getName());
		
		t1.giveLession();
		
		s1.study();
		
		e1.work();
		

	}

}
