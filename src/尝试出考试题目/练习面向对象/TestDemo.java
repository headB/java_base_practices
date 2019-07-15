package 尝试出考试题目.练习面向对象;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son();
		
		s1.name = "asd";
		
		System.out.println(s1.name);
		
		s1.echo1();

	}

}


class Father{
	
	String name;
	int age;
	
	void echo() {
		System.out.println("我是父类!.");
	}
	
	int returnSon() {
//		return new Son();
		return 1;
	}
	
	
}

class Son extends Father{
	
	void echo() {
		System.out.println("我是子类!");
	}
	
	Integer returnSon(int i) {
//		return new Son();
		return 2;
	}
	
	
	void echo1() {
		super.echo();
		
	
	}
	
}
