package day14线程.expand02;

//2、现有一百个快递待派发，
//定义快递类Expresses 作为公共资源类，定义快递员线程类Mailman ,
//请开启三个线程派发此100个快递，并打印哪个快递员派发了哪一个快递。
//
//【加分（很难，不做要求）：打印快递xx一共派发了xx个快递】

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//设置一个目标thread的run
		
		//公共资源类
		Expresses e1 = new Expresses();
		
		
		
		Mailman m1 = new Mailman(e1);
		
		new Thread(m1,"A").start();
		new Thread(m1,"B").start();
		new Thread(m1,"C").start();
		
//		Thread.currentThread().sleep(2000);
		
		
		
		
		

	}

}
