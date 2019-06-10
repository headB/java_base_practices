package day11.practice04;

import java.math.BigDecimal;
import java.math.RoundingMode;

//需求:创建 BigDecimal 类的对象，并调用常用方法
//作业目的:掌握 BigDecimal 类的使用


public class TestDemo {
	
	public static void main(String[] args) {
		
		//证实double类型的确是不精确的!
		System.out.println(0.01+0.09);
		System.out.println(0.1+0.9);
		
		BigDecimal x = new BigDecimal(0.01);
		BigDecimal y = new BigDecimal(0.09);
		
		//这里是错误的演示
		//System.out.println(x+y);
		
		//然后不能用数字去赋值
		System.out.println(x.add(y));
		
		BigDecimal x1 = new BigDecimal("0.01");
		BigDecimal y1 = new BigDecimal("0.09");
		
		//然后是日常的加减乘除
		System.out.println(x1.add(y1));
		System.out.println(x1.subtract(y1));
		System.out.println(x1.multiply(y1));
		
		//需要保留小数位  //需要四舍五入
		//System.out.println(x1.divide(y1));
		System.out.println(x1.multiply(y1).setScale(9,RoundingMode.HALF_UP));
		System.out.println(x1.divide(y1,6,RoundingMode.HALF_UP));
		
		
		
		
		
		
		
	}

}
