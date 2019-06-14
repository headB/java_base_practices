package day09.comprehensive.test;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new TestClass("six","18");
		s1.walk();
//		s1.speak();
		

	}

}


class TestClass extends Son {

	public TestClass(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("我会走路!");
	}
	
}
