package day12.practice01;

//1.第一题 MathDemo.java
//需求:使用 Math 类常用方法
//
//
//例如:获取随机数方法 作业目的:了解 Math 是一个操作什么的类，能够查 API 调用方法即可

public class TestDemo {
	
	public static void main(String[] args) {
		
		//利用Math里面的方法去获取最大值和最小值
		
		//最大值
		System.out.println("最大值");
		System.out.println(Math.max(200, 299));
		
			
		//最小值
		System.out.println("最小值");
		System.out.println(Math.min(200, 299));
		
		// 返回一个[0,1)之间的随机小数
		System.out.println("返回随机数");
		System.out.println(Math.random());
		
		
		//灵活运行
		System.out.println("可以利用相乘获取其他的位数的随机数");
		System.out.println((int)(Math.random()*100));
		
		//然后想想如何精确控制   范围来选取随机数
		//就是给某一个数字 设置一个限制,小数, 比如说是  0  到 1
		// 那么就给这个数  好像买东西一样,   打折.!!    0.1 * 40  =  4;
		
		System.out.println("1到100之间的随机数");
		System.out.println((int)((Math.random()*50+Math.random()*50)));
		
		System.out.println("1到100之间的随机数");
		System.out.println((int)((Math.random()*100)));
		
//		byte i =55;
		
//		for(int i=0;i<=1000;i++) {
//			
//			int i1 = (int)((Math.random()*100+1));
//			if(i1<5) {
//				System.out.println(i1);
//			}
//			
//		}
	
		//用for循环来期待一下小于100的随机数
//		for(int i=0;i<=1000;i++) {
//			int i2 = (int)((Math.random()*50+Math.random()*50));
//			if(i2<=10) {
//				System.out.println(i2);
//			}
//		}
		
		
		
		
	}
	

}
