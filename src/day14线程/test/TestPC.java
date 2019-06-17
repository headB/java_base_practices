package day14线程.test;

import java.util.Date;
import java.util.Random;


public class TestPC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 共享对象
		ShareObject share = new ShareObject();

		// 一个生产者线程
		ThreadA a1 = new ThreadA(share);

		// 一个消费者
		ThreadB c1 = new ThreadB(share);
		

		new Thread(a1).start();
		new Thread(c1,"A").start();
		new Thread(new ThreadB(share),"B").start();
		new Thread(new ThreadB(share),"C").start();
		
		new Thread(new ThreadB(share),"D").start();
		new Thread(new ThreadB(share),"E").start();
		new Thread(new ThreadB(share),"F").start();
		
		new Thread(new ThreadB(share),"G").start();
		new Thread(new ThreadB(share),"H").start();
		
		new Thread(new ThreadC(share),"H1").start();
		

	}

}


//生产包子线程
class ThreadA implements Runnable {

	public ThreadA(ShareObject s1) {
		this.s1 = s1;

	}

	ShareObject s1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			int time = new Random().nextInt(3);
			try {
				Thread.sleep(time*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//生产包子
			synchronized (this) {

				Product p1 = new Product(s1);
				p1.create();
//				this.notify();
//				this.notifyAll();
			}
		}

	}
}

class ThreadB implements Runnable {

	public ThreadB(ShareObject s1) {
		this.s1 = s1;

	}

	ShareObject s1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//吃包子
		
		while(true) {
//			synchronized (this) {
				
				
				
				Client p1 = new Client(s1);
				try {
					p1.eat();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
				
//			}
		}
		
	}
}

//生产者

//我是习近平的包子铺
class Product {

	public Product(ShareObject s1) {
		this.shareObject = s1;
	}

	ShareObject shareObject;

	// 提供生产包子
	public void create() {

		if (shareObject.get() == 0) {

			// 设置设置一个名字,关键是数量.
			
			shareObject.push(1+new Random().nextInt(3));
			System.out.println("生产馒头!------------> "+shareObject.get());
		} else {

			shareObject.push( shareObject.get() + (new Random().nextInt(8)+4));
			System.out.println("生产第number个馒头------------> " + shareObject.get());
		}
		// 这里就生产包子

	}

}

//消费者
class Client {

	public Client(ShareObject s1) {
		this.shareObject = s1;
	}

	// 吃包子
	ShareObject shareObject;

	public void eat() throws InterruptedException {
		
//		Thread.sleep(700);
		
		// 消费者可以尽情吃包子!
		if (shareObject.get() > -1) {

			// 然后就是吃包子了
//			System.out.println(Thread.currentThread().getName()+" 我吃了第number个包-> " + shareObject.get());
			shareObject.pop();

		}else {
//			System.out.println("吃晒了.!");
		}

	}

}

//共享对象!
class ShareObject {

	private String productName;
	private double price;
	private int number;
	
	//把资源压进来
	synchronized public void push(int number) {
		
		this.number = number;
		if(number >=200) {
			this.notifyAll();
//			this.notify();
		}else if(number >=100){
			System.out.println(new Date().toString());
//			this.notify();
			this.notifyAll();
			String name = Thread.currentThread().getName();
			switch(name) {
			
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
			case "F":
			default:System.out.println(name);
			
			}
			
//			this.notify();
		}
		
		
	}
	
	synchronized public int get() {
		return this.number;
	}
	
	 public void pop() throws InterruptedException {
		
		 synchronized (this) {
			 
			 if(number<=10) {
//					System.out.println("吃晒了six six six!");
					String name = Thread.currentThread().getName();
//					System.out.println(name+"=======================");
					if("H1".equals(name)) {
						System.out.println(name);
						System.out.println("=======================");
					}else {
//						this.wait();
					}
					this.wait();
					
				}
				
				
				System.out.println(Thread.currentThread().getName()+" 我吃了第number个包-> " + number);
				System.out.println(this.number--);;
			
		}
		 
		 Thread.sleep(800);
		
		
	}
	

	@Override
	public String toString() {
		return "ShareObject [productName=" + productName + ", price=" + price + ", number=" + number + "]";
	}

}



//测试线程.
class ThreadC implements Runnable{
	private ShareObject s1;
	ThreadC(ShareObject s1) throws Exception{
		this.s1 = s1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =0;
		while(true) {
			
			if(i==0) {
				try {
					s1.pop();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				try {
					System.out.println(new Date().toLocaleString());
					s1.pop();
//					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			i++;
			System.out.println("=====>测试除了第一次锁定之外,之后就不锁定了.!<=========");
		}
		
		
		
		
	}
	
	
	
	
}
