package day09.instanceof_demo;


//4. 第四题 InstanceofDemo.java
//需求:演示类型转换和 instanceof 关键字的使用 
//
//作业目的:
// 了解引用数据类型的自动转换和强制类型转换 
// 了解instanceof关键字的含义和使用



//哪里体验自动转换呢?
public class InstanceofDemo {
	
	public static void main(String[] args) {
		//自动转换
		//然后这里就是子类对象赋给父类变量
		Animal a1 = new Dog();
		Object o1 = new Dog();
		
		Dog d11 = new Dog();
		//强制转换的示例
		//前提,就是父类对象的真实类型是子类类型.
		Animal a2 = new Dog();
		Dog d1 = (Dog) a2;  //这个是正确的.
		System.out.println("hello world!");
		//Cat c1 = (Cat) a2; //这个是错误的.!虽然IDE不报错,但是呢,IDE无法编译!
		//下面演示instanceof 运算符?	
		//判断某一个对象,某一个实例,是否为某一类的实例.!
		//是啊,判断啊,一看到判断啊,就是,对,或者错,所以,结果应该是用一个boolean去接收.!
		
		//又或者说, A 是否为 B 的一个子类.!注意了,不然的话,就容易搞错概念了.!
	
		boolean b1 = a1 instanceof Dog;
		System.out.println("a1是否为Dog的实例?-->"+b1);
		boolean b2 = o1 instanceof Dog;
		System.out.println("o1是否为Dog的实例?-->"+b2);
		boolean b3 = d11 instanceof Dog;
		System.out.println("b3是否为Dog的实例?-->"+b3);
		
		boolean b4 = a1 instanceof Animal;
		System.out.println("a1是否为Animal的实例?-->"+b4);
		
		boolean b5 = a1 instanceof Object;
		System.out.println("a1是否为Object的实例?-->"+b5);
		
		
		
	}
	
	
	

}
