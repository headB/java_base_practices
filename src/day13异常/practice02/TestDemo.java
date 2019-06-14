package day13异常.practice02;

//2. 第二题
//需求:演示捕获多个异常 try-catc-catch 的使用
//作业目的:掌握 try-catch-catch 的语法和代码的运行顺序

//对对,数组索引超过长度是常见的.
//还有操作null对象.
//对对,还有日常字符串转整形的错误!

public class TestDemo {
	
	private String s1 = null;
	
	public static void main(String[] args) {
		
		TestDemo t1 = new TestDemo();
		String[] s2 = new String[3];
		
		try {
			
//			s2[2].charAt(2);
			
			int i1 = 1/0;
			
			System.out.println("six six!");
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("恭喜啦.!你出错啦!.");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
			//最后设置Exception,意思就是,上面都捕捉不到的情况下,这里才捕获!
		}catch (Exception e) {
			
			System.out.println("有什么,最后我这里顶着!!");
			
		}
		
		
		
	}
	
	public void test() {
		
		int i = 1/0;
		
		
	}

}
