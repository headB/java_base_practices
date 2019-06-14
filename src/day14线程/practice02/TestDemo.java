package day14线程.practice02;

//2. 第二题
//需求：使用实现方式创建并启动线程
//作业目的：掌握实现方式创建并启动线程的步骤


//需要注意的是,多线程都是抢占模式的!.绝对不是交替运行,而是抢占模式.!

public class TestDemo {
	
	
	public static void main(String[] args) throws InterruptedException {

//		Runnable r1 = new TestRunnable();
		Thread t1 = new Thread(new TestRunnable());
		t1.start();
		
		Thread t2 = new Thread(new Runnable() { public void run() {System.out.println("我是匿名内部类啦.!"); }});
		t2.start();
		
		for (int i = 0; i < 100; i++) {
			
			Thread.sleep(10);
			System.out.println("six six!");
			
		}
		
		
		
	}

}

//实现接口?

class TestRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100; i++) {
			
			try {
				Thread.sleep(10);
				
				System.out.println("我是并发!");
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
	
}
