package day14线程.practice03;

public class StudentRunnable implements Runnable {

	
	//设定50个苹果!
	private int apple =  50;
	
	//请我的构造器应该是如何初始化呢?
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <= apple; i++) {
			//获取父类的名字,的方式相当独特
			System.out.format("同学 %s  现在已经吃到了第%s 个苹果了.!\n",Thread.currentThread().getName() ,i);
		}
		
	}

}
