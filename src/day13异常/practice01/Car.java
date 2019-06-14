package day13异常.practice01;

//设置一个汽车类

public class Car {
	
	public static final int NO_OK = 0;
	public static final int OK = 0;
	
	
	public int run() {
		
		int a = 2;
		if(a==2) {
			System.out.println("爆胎了?");
			return NO_OK;
		}else {
			System.out.println("开着benz去上班!");
			return OK;
		}
		
	}
	

}
