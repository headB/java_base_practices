package day14线程.expand02;

//定义快递员线程类Mailman
public class Mailman implements Runnable {
	
	private Expresses e1;
	
	private int a = 0;
	private int b = 0;
	private int c = 0;

	public Mailman(Expresses e1) {
		this.e1 = e1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//看看如何读取和设置公共资源类吧!
//		synchronized (this) {
			int count = 0;
			while(e1.getNumber()>=1) {
				e1.popMail();
				count++;
			}
			System.out.println(Thread.currentThread().getName());
			
			String s1 = Thread.currentThread().getName();
			
			System.out.println(Thread.currentThread().getName()+" 统计当前的计数为-> "+count);
			
//			switch(s1) {
//			
//			case "A":System.out.println("A的count是-> "+e1.a);break;
//			case "B":System.out.println("B的count是-> "+e1.b);break;
//			case "C":System.out.println("C的count是-> "+e1.c);break;
//			
//			}
			
			
			
//			for (int i = 0; i < 100; i++) {
//				System.out.println(Thread.currentThread().getName()+" "+i);
//			}
//		}
		
		
		
	}

	
	
}
