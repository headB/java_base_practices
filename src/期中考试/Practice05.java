package 期中考试;

import java.util.Arrays;

//5.现在有两个系的学生，分别为英文系（English）、计算机系（Computer），
//他们都继承了学生类（Student）。学生类根据子类抽取。


public class Practice05 {
	
	
	
	public static void main(String[] args) {
		Computer s1 = new Computer(99,98,89,76);
//		Student s1 = new Computer(99,98,89,76);
		
		
//		Student s2 = new English(85,95,90);
		English s2 = new English(85,95,90);
		
//		Student s3 = new English(99,88,85);
		English s3 = new English(99,88,85);
		
		
		System.out.println(s1.getSynthesize());
		System.out.println(s2.getSynthesize());
		System.out.println(s3.getSynthesize());
		
		Student[] studentArray = {s1,s2,s3};
		
		English e1 = new English(99,88,85);
		
		Student[] studentArray1 = {e1,s1,s2};
		System.out.println(e1);
		
		 
		
		
		
		
	}

}

class Student{
	
	//这个是学生类
	private double midScore;   //其中成绩
	private double endScore;   //期末成绩
	private double synthesize;  //综合成绩
	
	//或者设置构造器也可以实现的吧.!
	public Student() {
		
	}
	
	public Student(double midScore,double endScore) {
		
		this.midScore = midScore;
		this.endScore = endScore;
		
	}
	
	public void setMidScore(double midScore) {
		this.midScore = midScore;
	}
	
	public double getMidScore() {
		return this.midScore;
	}
	
	public void setEndScore(double endScore) {
		this.endScore = endScore;
	}
	
	public double getEndScore() {
		return this.endScore;
	}
	
	public void setSynthesize(double synthesize) {
		this.synthesize = synthesize;
	}
	
	public double getSynthesize() {
		return this.synthesize;
	}
	
	
}

class English extends Student{
	
	
	
	

	private double speech;
	
	public English(double midScore, double endScore,double speech) {
		super(midScore, endScore);
		// TODO Auto-generated constructor stub
		this.setSynthesize();
		
	}
	
	public void setSynthesize(){
		//英语系的计算方式
		double sum;
//		①　英语系： 演讲 50% 、期末考试 25% 、期中考试 25% 
		sum = speech * 0.5 + getMidScore() * 0.25 + getEndScore() * 0.25;
		
		super.setSynthesize(sum);
		
	}
	
	public double getSynthesize() {
		return super.getSynthesize();
	}
	
}

class Computer extends Student{
	
	private double operation;
	private double write;
	
	public Computer() {
		
	}
	
	public Computer(double midScore,double endScore,double operation,double write) {
		
		super(midScore,endScore);
		this.operation = operation;
		this.write = write;
		
		this.setSynthesize();
		
		
	}
	
	public void setSynthesize(){
		//英语系的计算方式
		double sum;
//		②　计算机系： 操作能力 40% 、英语写作 20% 、期末考试 20% 、期中考试 20% 
		sum = operation * 0.4 + write * 0.2  + getMidScore() * 0.20 + getEndScore() * 0.20;
		
		super.setSynthesize(sum);
		
	}
	
	
}


