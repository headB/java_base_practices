package day13异常.test;

public class DemoTest {
	
	public static int test() throws Exception   {
		
		test('+');
//		throw new NullPointerException();
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
//			test('+');
			test();
			
//			throw new Exception("six!");
//			throw new NullPointerException("six!");
//			int i1 = 1 / 0 ;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("six six!");
			return ;
		}
		
		System.out.println("小猪!");
		

	}
	
	public static void test(char c) throws Exception {
		
		
		
		if(c=='+') {
			System.out.println("6666");
		}
		
		throw new Exception("six!");
		
		
	}

}
