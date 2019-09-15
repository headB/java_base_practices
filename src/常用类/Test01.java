package 常用类;

import java.math.BigDecimal;
import java.util.Arrays;




public class Test01 {
	
	public static void main(String[] args) {
		
		BigDecimal b1 = new BigDecimal("666");
		int number1 = 44;
		Integer i66 = Integer.valueOf(number1);
		String s111 = i66.toString();
		int i667 = Integer.parseInt(s111);
		
		
//		b1.intValue()
//		System.out.println(b1);
		// 尝试一下使用常用类。
		String s1 = "刘备;奕刘菲;关羽;王刘;张飞;曹操";
		
		int c1 = s1.indexOf("刘");
		System.out.println(c1);
		
		String[] s2 = s1.split(";");
		System.out.println(Arrays.toString(s2));
		
		//打算用总索引位置去找.
		int count;
		for (String s3 : s2) {
//			s3.indexOf("刘");
			if(s3.contains("刘")){
//				
				if(s3.matches("^[^刘].+")) {
					System.out.print("是刘但是不是开头的结果是->");
					System.out.println(s3);
				}
				
				if(s3.matches("^[^刘]刘.*")) {
					System.out.print("是刘但是不是开头的结果是->");
					System.out.println(s3);
				}
					
				
			}
		}
		
		
		
	}

}
