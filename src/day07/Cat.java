package day07;

//需求
//1.第一题
//Cat.java
//需求：描述猫类
//步骤：
//（1）猫有名字、年龄等状态
//（2）说话的功能
//

//2.第二题
//Cat.java
//需求：描述猫类
//步骤：
//（1）猫有名字、年龄等状态
//（2）无参构造器
//（3）带参数构造器初始化名字和年龄两个字段
//（4）说话的功能
//
//CatDemo.java
//需求：作为Cat类和对象的测试类
//步骤：
//（1）使用无参数构造器创建对象c1并初始化c1的成员变量
//（2）使用带参构造器创建对象c2同时初始化成员变量，并调用说话方法
//
//作业目的：掌握构造器的定义和使用构造器创建对象，通过两种不同方式创建对象理解有参数和无参数构造器的区别




public class Cat {
	
	String name = "kumanxuan";
	int age = 18;
	
	//无参数构造器
	 Cat(){
		 
	 }
	 
	 //有参数构造器,自定义构造器
	 Cat(String n,int a){
		
		 name = n;
		 age = a;
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cat cat = new Cat();
//		cat.say();

	}
	
	 public void say() {
		//System.out.println("我会讲话!");
		System.out.println("我的名字是->"+name+",  我的年龄是->"+age);
	}

}
