package day14线程.test;

import java.util.Random;
import java.util.RandomAccess;

public class TestPC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 共享对象
		ShareObject share = new ShareObject();

		// 一个生产者线程
		ThreadA a1 = new ThreadA(share);

		// 一个消费者
		ThreadB c1 = new ThreadB(share);

		new Thread(a1).start();
		new Thread(c1).start();

	}

}

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
			
			synchronized (this) {

				Product p1 = new Product(s1);
				p1.create();
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
		while(true) {
			synchronized (this) {

				Client p1 = new Client(s1);
				p1.eat();
			}
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

		if (shareObject.number == 0) {

			// 设置设置一个名字,关键是数量.
			shareObject.productName = "馒头";
			shareObject.price = 2;
			shareObject.number = 1+new Random().nextInt(3);
			System.out.println("生产馒头!------------> "+shareObject.number);
		} else {

			shareObject.number+= new Random().nextInt(8)+4;
			System.out.println("生产第number个馒头------------> " + shareObject.number);
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

	public void eat() {

		// 消费者可以尽情吃包子!
		if (shareObject.number > 0) {

			// 然后就是吃包子了
			System.out.println("我吃了第number个包-> " + shareObject.number);
			shareObject.number--;

		}

	}

}

//共享对象!
class ShareObject {

	String productName;
	double price;
	int number;

	@Override
	public String toString() {
		return "ShareObject [productName=" + productName + ", price=" + price + ", number=" + number + "]";
	}

}
