package day14线程.practice01;



//多线程
//一、视频作业:
//1.第一题
//需求：使用继承方式创建并启动线程
//作业目的：掌握继承方式创建并启动线程的步骤

public class TestDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t1 = new ThreadTest();
		t1.start();
		
		for(int i=0;i<=100;i++) {
			
			System.out.println("我有我做,你有你做!");
			Thread.sleep(100);
			
		}
		
		
	}

}
