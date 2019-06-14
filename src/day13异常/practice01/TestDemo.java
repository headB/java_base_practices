package day13异常.practice01;

import java.nio.channels.AlreadyBoundException;

//1.第一题
//需求:演示捕获单个异常 try-catch 的使用 作业目的:掌握 try-catch 的语法和代码的运行顺序

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			new TestDemo().test();

		} catch (Exception e1) {
			// 针对某一个类捉取
//		catch(ArithmeticException e1){

			// 如果设置的第三方的异常类,但是前面类出错的话,捕捉不到,就会引起外部的异常.!
//		catch(AlreadyBoundException e1){

			System.out.println("恭喜你啦,你出错啦.!six six six!");
			System.out.println(e1);
		}

		
		//然后继续常见其他的测试类,测试异常.!
		
		//实例化汽车和工人
		
		Car car = new Car();
		Worker w1 = new Worker(car);
		w1.gotoWork();
		
//		private String t22 = null;
		
		
		
	}

	public void test() {
		int i = 1 / 0;
	}
	
	
	
	
	
	
	
	

}
