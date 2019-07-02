package day01.加强练习题;

//加强内部类和super的练习

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father s1 = new Son();
		System.out.println("this is test to print -> "+s1.name);
		s1.name.contains("1");
		System.out.println("字段不存在覆盖的问题!-> "+s1.name.contains("1"));
		
		//然后方法才有覆盖的问题,接收类型不管是子类或者是父类,
		//最终运行的都是子类的方法,就是假如子类都是存在的!.
		s1.test();
		
		Son s2 = new Son();
		
		
		s2.test();
		
		Son s3 = new Son();
		s3.test1();
		
		
		
		
		{
			System.out.println("main方法的代码块");
		}
		
		

	}

}

class Father{
	
	static {
		System.out.println("我比较吊,我是静态代码块,并且main方法不是在我这里!.");
		System.out.println();
	}
	
	String name = "kumanxuan";
	private int age = 10;
	
	void test() {
		System.out.println("我是Father!");
	}
	
	void test1() {
		System.out.println("只存在于父类的方法,没有被子类覆盖!");
	}
	
}

class Son extends Father{
	
	int name = 0;
	String age = super.name;
	
	
	Son(){
		
		System.out.println("究竟是运行谁先呢!?反正我是构造器");
	}
	
	void test() {
		System.out.println("我是子类!");
	}
	
	
	//利用方法尝试准备
	//代码块
	{
		System.out.println("我是代码块->输出年龄->"+age);
	}
	
}
