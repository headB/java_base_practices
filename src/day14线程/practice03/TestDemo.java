package day14线程.practice03;

//3. 第三题
//需求：使用继承方式实现吃苹果案例（线程不安全）
//作业目的：巩固继承方式创建并启动线程

public class TestDemo {
	
	
	
	void test() {
		
//		private int apple = 100;  //这里会出现报错!因为方法里面只能局部使用,没有必要使用修饰符了.!
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//然后创建多个小朋友来吃苹果
//		new StudentThread("朝伟").start();
//		new StudentThread("德华").start();
//		new StudentThread("柏豪").start();
		
//		4. 第四题
//		需求：使用实现方式实现吃苹果案例（线程不安全）
//		作业目的：巩固实现方式创建并启动线程
		
		//这里一共只设置50个苹果
		
		//在这里,多线程的环境,设置了共享变量的先例了.!
		
		StudentRunnable s1 = new StudentRunnable();
		
		new Thread(s1,"林志颖").start();
		new Thread(s1,"周秀娜").start();
		new Thread(s1,"李思捷").start();
		
		

	}

}
