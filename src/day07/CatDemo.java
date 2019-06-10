package day07;

//CatDemo.java
//需求：作为Cat类和对象的测试类
//步骤：
//（1）创建Cat对象c
//（2）使用c对象调用说话方法
//（3）给对象成员变量设置值
//（4）再使用c对象调用说话方法，观察成员变量的值的改变
//（5）获取c对象的成员变量


//CatDemo.java
//需求：作为Cat类和对象的测试类
//步骤：
//（1）使用无参数构造器创建对象c1并初始化c1的成员变量
//（2）使用带参构造器创建对象c2同时初始化成员变量，并调用说话方法
//
//作业目的：掌握构造器的定义和使用构造器创建对象，通过两种不同方式创建对象理解有参数和无参数构造器的区别


public class CatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cat c1 = new Cat();
//		c1.say();
		
		c1.name = "beetle Lai!";
		c1.age = 20;
		c1.say();
		
//		String catName = c1.name;
//		int age = c1.age;
//		System.out.println(catName);
//		System.out.println(age);
		
		
		Cat c2 = new Cat("Kumaon!",33);
		c2.say();
		
		
		
	}
	
}
