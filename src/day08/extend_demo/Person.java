package day08.extend_demo;

public class Person {
	
	
	private String name;
	private int age;
	
	//容易漏掉了一个公共无参数的构造器了.!
	
	public Person() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	//然后还有一个休息功能
	public void rest() {
		
		System.out.println("我在休息啦!");
		
	}
	

}
