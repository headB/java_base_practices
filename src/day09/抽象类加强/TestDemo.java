package day09.抽象类加强;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//匿名内部类.
		
		Cat c1 = new Cat() { public void speak1() {System.out.println("汪汪!");}};
		c1.speak();
		c1.speak1();
		System.out.println(c1.getName());
		
	}

}

abstract class Cat{
	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void speak() {
		
		System.out.println("喵喵喵!");
		
	}
	
	abstract public void speak1();
	
	
}
