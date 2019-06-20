package day16集合2.comprehensive02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



//2. 综合二:
//有如下 Student 对象，对象中包含姓名(name)、年龄(age)、成绩(score)、班级号 (classNum)等成员变量，
//其中，classNum 表示学生的班号，例如“class05”。 学生信息表数据如下:
//请根据学生信息表，完成下列要求:
//1)创建 ArrayList 对象 studList，并根据学生信息表添加学生数据。 
//2)修改 Jerry 的成绩将 70 修改为 90。
//3)删除 Kevin 这一条学生数据。
//4)计算 class05 班级的平均分。

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studList = new ArrayList<>();
		
		Student s1 = new Student(18,"Tom",100,"class05");
		Student s2 = new Student(22,"Jerry",70,"class04");
		Student s3 = new Student(25,"Owen",90,"class05");
		Student s4 = new Student(30,"Jim",80,"class05");
		Student s5 = new Student(24,"Kevin",100,"class04");
		Student s6 = new Student(24,"Kevin",100,"class04");
		
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		studList.add(s6);
		
		
		System.out.println(studList);
		studList.get(1).setScore(90);
		System.out.println(studList);
		System.out.println(studList.contains(s2));
		System.out.println("测试查看是否有Jim字符串");
		System.out.println(studList.contains("Jim"));
		System.out.println(studList.size());
		studList.set(studList.size()-1, s4);
		
		
		//然后准备删除Kevin
//		for(Student sTemp:studList) {
//			
//			if("Kevin".equals(sTemp.getName())) {
//				
//				studList.remove(sTemp);
//				
//			}
//			
//			
//		}
		
		//首先获取到迭代器
		Iterator<Student> it1 = studList.iterator();
		
		while(it1.hasNext()) {
			
//			if("Tom".equals(it1.next().getName())){
			if("Kevin".equals(it1.next().getName())){
				it1.remove();
			}
			
		}
		
		
		System.out.println(studList);
		
		double avg=0;
		double scoreTotal = 0;
		int count=0;
		
		for(Student sTemp:studList) {
			
			if("class05".equals(sTemp.getClassNum())) {
				System.out.println(sTemp);
				count++;
				scoreTotal += sTemp.getScore();
				avg = scoreTotal / count;
				
			}
			
		}
		
		System.out.println("class05的平均分是-> "+avg);
		

	}

}

class Student {
	
	private String name;
	private double score;
	private int id;
	private String classNum;
		
	
	public Student(int id,String name, double score, String classNum) {
		super();
		this.name = name;
		this.score = score;
		this.id = id;
		this.classNum = classNum;
		
	}
	
	@Override
	public String toString() {
//		super.toString();
		return "Student [name=" + name + ", score=" + score + ", id=" + id + ", classNum=" + classNum + "]";
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
	
}
