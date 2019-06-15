package day14线程.practice05;

//这里就涉及了线程同步问题了.!

//5. 第五题
//需求：使用实现方式实现吃苹果案例（线程安全方式1）
//作业目的：
//n 掌握线程安全的作用（能解决什么问题）
//n 掌握线程安全的语法

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//照旧,继续设置共享的苹果对象.
		StudentRunnable s1 = new StudentRunnable();
		
		new Thread(s1,"嘉玲的朝伟").start();
		new Thread(s1,"德华").start();
		new Thread(s1,"阿尔冯斯").start();
		
		

	}

}
