package day15集合.comprehensive02;

import java.util.ArrayList;
import java.util.List;

//2. 综合二:
//有如下 Student 对象，对象中包含姓名(name)、
//年龄(age)、成绩(score)、班级号 (classNum)等成员变量，
//其中，classNum 表示学生的班号，例如“class05”。 学生信息表数据如下:
//请根据学生信息表，完成下列要求:
//
//1)创建 ArrayList 对象 studList，并根据学生信息表添加学生数据。 
//2)修改 Jerry 的成绩将 70 修改为 90。
//3)删除 Kevin 这一条学生数据。
//4)计算 class05 班级的平均分。(明天做)


//1 Tom 18 100 class05 4 Jim 30 80 class05
//2 Jerry 22 70 class04 5 Steve 28 66 class06
//3 Owen 25 90 class05 6 Kevin 24 100 class04

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(18,"Tom",100,"class05");
		Student s2 = new Student(22,"Jerry",70,"class04");
		Student s3 = new Student(25,"Owen",90,"class05");
		Student s4 = new Student(30,"Jim",80,"class05");
		Student s5 = new Student(24,"Kevin",100,"class04");
		
		Student[] stus = new Student[] {s1,s2,s3,s4,s5};
		
		List<Student> studList = new ArrayList<>();
		
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		
		System.out.println(studList);
		
		s2.setScore(90);
		
		System.out.println(studList);
		
		studList.remove(s5);
		
		System.out.println(studList);
		
		double avg=0;
		double score=0;
		int i =0;
		for(Student sx:studList) {
			
			if("class05".equals(sx.getClassNum())) {
				score += sx.getScore(); 
				i++;
			}
			
		}
		if(score!=0 && i!=0) {
			
			avg = score / i;
		}
		
		System.out.println(avg);
		
		

	}

}

class Student{
	
	private int age;
	private String name;
	private double score;
	private String classNum;
	
	
	
	public Student(int age, String name, double score, String classNum) {
		super();
		this.age = age;
		this.name = name;
		this.score = score;
		this.classNum = classNum;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", score=" + score + ", classNum=" + classNum + "]";
	}
	
	
	
}
