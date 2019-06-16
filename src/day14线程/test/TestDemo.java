package day14线程.test;

public class TestDemo {
	
	//这里想测试一下多线程的wait和notify方法

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadTest t1 = new ThreadTest();
		//想乱搞了!
		Thread1 t2 = new Thread1(t1);
		
		Thread t3 = new Thread(t2);
		Thread t4 = new Thread(t2);
		Thread t5 = new Thread(t2);
		
		t3.start();
		
		t4.start();
		
		t5.start();
		

	}

}

class Thread1 implements Runnable{

	private ThreadTest t1;
	//传递对象进来
	public Thread1(ThreadTest t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			run1();
		}
		//最后释放全世界的锁
		releaseLock();
		
		
	}
	
	synchronized  public void releaseLock() {
		
		this.notify();
		
	}
	
	 synchronized public void run1() {
		System.out.println("执行wait");
		try {
			this.notify();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.currentThread().sleep(10);
			this.wait();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("执行wait结束!");
	}
	
	
	
}


//所以下面这个只能当做是共享的对象.
class  ThreadTest{
	
	
	public synchronized void test1() throws InterruptedException {
		
		
		
		System.out.println("我想测试多线程的wait和notify啊,但是不知道具体如何测试!");
		this.wait();
		
	}
	
	
	
	
}
