package day13异常.practice06;

//6. 第六题
//需求:自定义异常 LogicException，使用自定义异常模仿用户注册功能 作业
//目的:掌握自定义异常的两种方式

public class TestDemo {

	
	//模拟数据库中已经存在的账户
	private static String[] usernames = {"lizhixuan","kumanxuan","lucy"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//打印字符串的count   ???
		
		String s1 = "kumanxuan";
		
//		System.out.println(s1.count);
		
		
		try {
			checkUsername("kumanxuan");
			System.out.println("注册成功!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		

	}

//	private static boolean checkUsername(String name) {
	private static boolean checkUsername(String name) throws LogicException {
		// TODO Auto-generated method stub
		
		//然后开始去检查
		for(String s1:usernames) {
			
			if(name.equals(s1)) {
				
				throw new LogicException("你的用户名已经被注册了.!");
				
			}
			
		}
		
		return true;
		
		
		
		
	}

}
