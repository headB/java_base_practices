package day11.practice05;

//需求:
// 演示 String 类创建对象的两种方式，并使用 == 和 equals 方法进行比较
// 判断字符串非空
//作业目的:了解 String 的原理，掌握 String 判断字符串是否为空 


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//演示创建String的两种方式
		
		//1
		String s1 = "ABCD";
		String s2 = new String("ABCD");
		System.out.println("1->"+(s1==s2)); 
		String s3 = "ABCD";
		System.out.println("2->"+(s1==s3));//看起来,"ABCD"好像每次都会覆盖之前的内容
		System.out.println("3->"+("ABCD"=="ABCD"));
		String s4 = "A";
		String s5 = "A";
		System.out.println("4->"+(s4==s5));  //然后好像还真是有缓存机制的啦!
		//测试超过128的字符串是否可以继续想等
		String s6 = "A.";
		String s7 = "A.";
		System.out.println("5->"+(s6==s7));
		
		String s8 = new String("A");
		String s9 = new String("A");
		System.out.println("6->"+(s8==s9));
		
		System.out.println("equals instance 7->"+(s8.equals(s8)));
		System.out.println("equals instance 8->"+(s1.equals(s2)));
		
		
		//掌握如何去判断空字符串
		String s10 = new String("");
		String s11 = "";
		System.out.println("字符串为->"+hasLength(s10));
		System.out.println("字符串为->"+hasLength(s11));
		System.out.println("字符串为->"+hasLength(s9));
		
		
//		String[] int
		
		
	}
	
	static boolean hasLength(String s1) {
		
		//然后直接用retun一步到位
		
		return s1!=null && !"".equals(s1.trim());
		
//		if ("".equals(s1.trim()) || s1 == null) {
//			return false;
//		}
//		
//		return true;
		
	}
	

}
