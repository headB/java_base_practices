package day10.practice03;

//3. 第三题
//需求:演示静态代码块、初始化代码块、局部代码块的写法
//作业目的:掌握静态代码块的语法

public class testDemo {
	public static void main(String[] args) {
//		局部代码块: 直接定义在方法内部的代码块，一般的，不会直接使用局部代码块的，结合 if、while、
//		for 等关键字使用，表示一块代码区域。
		{
			System.out.println("我是main方法的局部代码块!!!");
		}
		//尝试实例化一个Dog类
		Dog d1 = new Dog();	
		Dog d2 = new Dog();
		
//		静态代码块:使用static修饰的初始化代码块，
//		当该代码块的类的字节码被加载进JVM，
//		就执行static 代码块代码。在开发中，用来做加载资源、加载配置文件等操作。
		
		
	}

}
