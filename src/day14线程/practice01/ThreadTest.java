package day14线程.practice01;

public class ThreadTest extends Thread {
	
	 //覆盖run方法
	
	public void run() {
		
		for(int i=0;i<=100;i++) {
			
		
		//暂停功能
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("six six six!");
		
		}
		
		
	}

}
