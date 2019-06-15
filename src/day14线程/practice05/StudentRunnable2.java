package day14线程.practice05;

//6. 第六题
//需求：使用实现方式实现吃苹果案例（线程安全方式2）
//作业目的：
//n 掌握线程安全的作用（能解决什么问题）
//n 掌握线程安全的语法

public class StudentRunnable2 implements Runnable {

	// 设定50个苹果!
	private int apple = 50;

	// 请我的构造器应该是如何初始化呢?

	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 50; i++) {
			// 获取父类的名字,的方式相当独特

			// 这里设置延迟!
			eat();
		}

	}
	
	synchronized void eat() {
		
		//这个位置添加同步锁
		
		if (apple > 0) {
			System.out.format("同学 %s  现在已经吃到了第%s 个苹果了.!\n", Thread.currentThread().getName(), apple--);
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
