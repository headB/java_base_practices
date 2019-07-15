package day09面向对象3.test1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cat c1 = new Cat("asd") { void test() {System.out.println("123");}};
		
		Cat1 c2 = new Cat1() {public void test(){System.out.println("asdsd");}};
		
		

	}

}


//弄一个接口和抽象类


abstract class  Cat{
	
	private String name;
	
	
	//尝试弄一个构造器
	public Cat(String name) {
		System.out.println("喵喵喵!");
	}
	
	
	abstract void test();
	
	
}


interface Cat1{
	
	//再次尝试创建一个构造器.
	void test();
	
	
}
