package day10.practice03;

public class Dog {
	
	static
	{
		//这里是的静态的代码块,随着类的加载而加载启动,不管有没有调用我!>
		System.out.println("我是静态代码块!!!");
		System.out.println("但是就是加载整个程序,只加载一次,后面类调用多少次,都不会调用我了!");
		System.out.println();		
	}
//	初始化代码块(构造代码块):直接定义在类中。
//	每次创建对象的时候都会执行初始化代码块，
//	开发 中不使用初始化代码块，即使要做初始化操作，可以直接在构造器中完成即可。
	
	{
		System.out.println("这个类被实例化的时候,就调用我!");
		System.out.println("我是属于Dog类的!");
		System.out.println("我是静态代码块!");
	}
	public static void main(String[] args) {
			
		Dog d1 = new Dog();	
		Dog d2 = new Dog();
	}

}
