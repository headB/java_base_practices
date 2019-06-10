package day07;

public class Student01 {
	
	
	
//	姓名(name)：张三
//	年龄(age) ：18
//	性别(gender)：男
//	英语(enScore)：90
//	数学(mathScore)：135
//	语文(cnScore)：105
	
	private String name;
	private int age;
	private boolean gender;
	private int enScore;
	private int mathScore;
	private int cnScore;
	
	Student01(){
		
	}
	
	Student01(String name, int age, boolean gender, int enScore, int mathScore, int cnScore) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.enScore = enScore;
		this.mathScore = mathScore;
		this.cnScore = cnScore;
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

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getEnScore() {
		return enScore;
	}

	public void setEnScore(int enScore) {
		this.enScore = enScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getCnScore() {
		return cnScore;
	}

	public void setCnScore(int cnScore) {
		this.cnScore = cnScore;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		
	
	}

}
