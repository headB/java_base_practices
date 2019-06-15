package day14线程.practice03;

public class StudentThread extends Thread {
	
	
	//模拟每一个小朋友
	
	//第一个是简单的???单独自己吃自己的苹果
	private int apple = 50;
	
	//然后设置一个构造器
	public StudentThread(String name) {
		super(name);
	}
	
	public void run() {
		
		//设置循环去吃苹果,我觉得直接用while好像写的代码会更加少一点
		for (int i = 1; i <=50 ; i++) {
			
			System.out.format("%s同学已经吃了编号为 %s 的苹果了!\n\n", super.getName(),apple--);
			
		}
		
		
		
	}

}
