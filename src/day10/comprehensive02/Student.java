package day10.comprehensive02;

public class Student {
	
	//javabean规范的!
	/*
	 * 1)请用 javaBean 规范设计一个学生类 Student，具有: 属性:no(学号)、name(姓名)和 score(成绩)
	 * 功能:输出一位学生的数据内容(toString)、计算学生的平均分(getAvg)
	 */
	
	private int no;
	private String name;
	private double score;
	private static double totalScore;
	private static double scoreCount;
	
	public Student() {
		
	}
	
	
	public String  toString() {
		
		return "\n学生的所有信息是->,no->"+no+",name->"+name+",score->"+score;
		
	}
	
	//可以根据具体的数据去计算所有学生的平均分
	public double getAvg(double[] score) {
		
		int sum = 0;
		for(double i:score) {
			sum += i;
		}
		
		return sum / score.length;
		
	}
	
	//根据类本身的变量去计算!.
	
	public static double getAvg() {
		
		return totalScore / scoreCount;
		
	}
	
	public  Student(int no,String name,double score) {
		
		this.no = no;
		this.name = name;
		this.score = score;
		totalScore += score;
		scoreCount ++;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public void setScore(double score) {
		this.score = score;
		totalScore += score;
		scoreCount ++;
	}
	
	public double getScore() {
		return this.score;
	}
	
	
	
	
	

}
