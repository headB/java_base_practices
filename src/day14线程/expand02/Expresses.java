package day14线程.expand02;


//公共资源类
//所以这里这个是静态类?

//这个是单例?

public class Expresses {
	
	//
	private int number = 300;
	int a = 0;
	int b= 0;
	int c= 0;
	
	synchronized void popMail() {
		int count = 0;
		if(number>=1) {
			System.out.println(Thread.currentThread().getName()+ " 派发-> "+number);
			number--;
			count++;
			String s1 = Thread.currentThread().getName();
			if(s1.equals("A")) {
				a++;
				
			}else if (s1.equals("B")) {
				b++;
				
			}else {
				c++;
			}
			
			
		}
//		System.out.println("===============\n\n");
//		System.out.println(Thread.currentThread().getName()+"一共派了"+count+"份");
	}
	
	int getNumber() {
		return this.number;
	}

}
