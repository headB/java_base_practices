package day12.practice05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//5. 第五题
//需求:通过 SimpleDateFormat 类进行格式化和解析操作
//作业目的:掌握格式化和解析操作


public class SimpleDateFormatDemo {
	
	public static void main(String[] args) {
		
		//首先产生一个普通的日期时间先.
		Date d1 = new Date();
		System.out.println(d1);
		
		//然后就是自定义去输出日期时间了.!
		
//		格式化(format):Date 类型转换为 String 类型:String format(Date date)
//		解析(parse):String 类型转换为 Date 类型:Date parse(String source)
		
		//创建SimpleDateFormat对象.
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		//应用
		sdf1.applyPattern(pattern);
		
		//然后就进行格式化输出
		String s1 = sdf1.format(d1);
		System.out.println(s1);
		
		//然后就尝试解析,其实就是将字符串转换成为Date类.
		
		//原来用同样的  SimpleDateFormat  对象就可以了.!
		
		//尝试延迟两秒钟.
		Date d3 = null;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			
			d1 = sdf1.parse(s1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(d1);
		System.out.println(d3);
		
		
	}

}
