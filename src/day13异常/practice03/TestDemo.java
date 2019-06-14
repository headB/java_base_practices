package day13异常.practice03;

//3. 第三题
//需求:演示捕获多个异常 try-catc-finally 的使用
//作业目的:掌握 try-catch-finally 的语法和代码的运行顺序 

public class TestDemo {

	public static void main(String[] args) {
		
		
		try {
			
			int i = 1/0;
			
		} 
		catch(Exception e) {
			System.out.println("恭喜啦!你出现异常了.!");
		}
		
		finally {
			// TODO: handle finally clause
			System.out.println("我是负责所有最后的步骤!");
		}
		
		
	}
	
}
