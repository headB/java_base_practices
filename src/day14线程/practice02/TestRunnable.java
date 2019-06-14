package day14线程.practice02;

class TestRunnable2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100; i++) {
			
			try {
				Thread.sleep(100);
				
				System.out.println("我是并发!");
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
	
}