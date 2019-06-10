package day11.practice06;

//6. 第i六题
//需求:演示 String 中的常用方法的调用(9 个)
//作业目的:熟练操作 String 类中的常用方法


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9个那么多?
		
		String s1 = "lizhixuan is six six six!";
		
		System.out.println("长度->"+s1.length());
		
		System.out.println("1."+s1.charAt(2));
		System.out.println("2."+s1.codePointAt(2));
//		System.out.println("3."+s1.);
		System.out.println("返回出现第一次字符的索引"+s1.indexOf("xuan"));
		System.out.println("最后返回出现第一次字符的索引"+s1.indexOf("xuan"));
		System.out.println("没有找到索引的话?"+s1.indexOf("sixxuan"));
		System.out.println(s1.substring(1,2));
		System.out.println("比较内容!");
		String s11 = "lizhixuan";
		String s22 = "LizhixuAn";
		String s33 = "lizhixuan";
		
		System.out.println(s11.equalsIgnoreCase(s22));
		System.out.println(s11.equals(s22));
		System.out.println(s11.toUpperCase());
		System.out.println(s11.substring(6));
		System.out.println(s11.substring(3,9));
		
		

	}

}
