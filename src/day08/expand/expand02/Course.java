package day08.expand.expand02;

//课程类中含有课程名称、成绩。
public class Course {
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", score=" + score + "]";
	}

	private String name;
	private double score;
	
	public Course() {
		
	}
	
	//设置带有参数的构造器
	
	public Course(String courseName, double courseScore) {
		// TODO Auto-generated constructor stub
		this.name = courseName;
		this.score = courseScore;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return this.score;
	}

}
