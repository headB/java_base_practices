package day12.practice06;

import java.util.Calendar;

//6. 第六题
//需求:创建 Calendar 对象，并分别设置和获取日期的年、月、日、时、分、秒。
//作业目的:掌握 Calendar 对象的创建，简单的设置和获取日期信息。 


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//获取实例,看起来像单例了.!
		Calendar c1 = Calendar.getInstance();
		int i1 = c1.get(Calendar.YEAR);
		System.out.println("这是年-> "+i1);
		
		int month = c1.get(Calendar.MONTH)+1;
		System.out.println("这个是获取月份-> "+month);
		System.out.println("这个是获取日份-> "+c1.get(Calendar.DAY_OF_MONTH));
		System.out.println("这个是获取时份-> "+c1.get(Calendar.HOUR_OF_DAY));
		System.out.println("这个是获取分份-> "+c1.get(Calendar.MINUTE));
		System.out.println("这个是获取秒份-> "+c1.get(Calendar.SECOND));

		//然后尝试增加100年.
		c1.add(Calendar.YEAR, 10);
		System.out.println(c1);
		
		System.out.println(c1.get(Calendar.YEAR));
		
		
		
	}

}
