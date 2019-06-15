package day14线程.comprehensive01;

//1.练习一
//分别创建学生类（Student）和课程类（Course），
//其中学生类中含有一门课程，还有学生姓名、年龄这两个成员变量。
//课程类中含有课程名称、成绩。
//给出以下学生课程信息表：
//·学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
//·学生姓名：王飞，年龄:15,课程名称：数学，数学成绩：98
//要求：1）按照JavaBean规范定义学生类（Student）和课程类（Course）。
//2）使用有参构造器，根据学生课程信息表创建黄小铭和王飞两个对象。

public class TestDemo1 {
	public static void main(String[] args) {
		
		Student s1 = new Student("黄晓明",14,new Course("语文",88));
		Student s2 = new Student("王飞",14,new Course("数学",98));

		
		System.out.println(s1);
		System.out.println(s2);
		
	}
		
	
}
