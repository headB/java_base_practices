package day14线程.expand01;

//1、请编写程序利用线程输出从A到Z的字母，每隔一秒钟输出一个数字，
//请按顺序输出。

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(new Runnable() {
			public void run() {
				
				try {
					
					for(int i='A';i<='Z';i++) {
						Thread.sleep(1000);
						System.out.println(i);
						
					}
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();

	}

}
