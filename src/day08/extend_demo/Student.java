package day08.extend_demo;

import day10.practice02.Super;

public class Student extends Person {
	
	
	
	private String hobby;
	
	
	public Student() {
		
	}
	
	public void setHobby(String hobby) {
		
		
		this.hobby = hobby;
		
		
	}
	
	public String getHobby() {
		return this.hobby;
	}
	
	public void study() {
		System.out.println("我现在在学习啦!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
