package day09面向对象3.test1;

public class Test01 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.test(new Person() { public void test() {System.out.println("hello xx world!"+s1);}});
		
	}
	
	
}

class Person{
	
	String s1 = "kumanxuan";
	
	public void test() {
		System.out.println("hello world!"+s1);
	}
	
	
}

class Employee{
	
	private String name;
	
	
	public void test(Person p1) {
		
//		e1.test();
		System.out.println(this);
		System.out.println(p1);
		p1.test();
		
	}
	
	
}