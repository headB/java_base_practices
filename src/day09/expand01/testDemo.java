package day09.expand01;

import java.util.function.IntFunction;

public class testDemo {
	
	
	
	public static void main(String[] args) {
		
		
		//实例化各种交通工具
		//的士
		Seater t1 = new Taxi();
		t1.setBrand("兰博基尼");
		t1.manned();

		
		
		
		//的士,多态的应用
		IRunable i1 = new Taxi();
		System.out.println("变态的的士!");
		i1.run();
		i1.work();

		
		IFcuntion i2 = new Taxi();
		System.out.println("变态的的士!");
//		i2.run();
		i2.work();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
