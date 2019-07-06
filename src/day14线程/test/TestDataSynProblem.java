package day14线程.test;

public class TestDataSynProblem {
	
	public static void main(String[] args) {
		
		//测试多线程延迟测试的效果.!
		
		//创建对象.
		
		MultiProcess m1 = new MultiProcess();
		
		//然后创建多个线程,同时运行同一个对象.
		
		new Thread(m1).start();
		new Thread(m1).start();
			
		
	}

}


class MultiProcess implements  Runnable{

	//共享变量对象.
	int number = 0;
	
	

@Override
public  void run() {
	// TODO Auto-generated method stub
	
	for(int i=0;i<=1000;i++) {
//		int number1 = number;
		try {
//			Thread.sleep(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(number!=-1) {
			
			number = number + 1;
			System.out.println(number);
		}
		
		
		
	}
	
	System.out.println(number);
	
	
	
	
}

}
