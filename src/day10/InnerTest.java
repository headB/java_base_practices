package day10;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerTest.Test t1 = new InnerTest().new Test();
		
		InnerTest.Test1 t2 = new InnerTest.Test1();
		
	}
	
	
	class Test {
		
		void speak() {
			System.out.println("hello word!");
		}
	}
		
	public static class Test1{
		
		void speak() {
			System.out.println("hello word!");
		}
		
	}
		
	

}
