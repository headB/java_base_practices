package day12.practice07;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//7.第七题
//需求:查询某个时间最近一周的信息，
//如何表示最近这一周的开始时间和结束时间 作业目的:熟悉 Calendar 类中的方法。

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OK!搞掂了翻墙的问题了,嗯嗯,就是慢了点,但是还是可以获取外部的信息
		//还有就是,是可以向外发布信息的,毕竟.现在的互联网,不能全部去封堵.!
		
		//给定一个字符串形式的日期先.
		Date d1 = new Date();
		System.out.println(d1);
		
		String date2 = "2019-06-09 16:23:47";
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		
		Date d2 = null;
		//然后进行格式化
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		
		sdf1.applyPattern(pattern);
		try {
			d2 = sdf1.parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(d2);
		
		//然后再次实例化一个日历类.
		
		Calendar c1 = Calendar.getInstance();
		
		//把当前的时间对象设置到日历类里面.
		c1.setTime(d2);
		
		System.out.println(c1);
		
		//然后设置到今天的最后一天?
		
		//设置时分秒
		
		c1.set(Calendar.HOUR_OF_DAY,23);
		c1.set(Calendar.MINUTE,59);
		c1.set(Calendar.SECOND,59);
		
		//然后,就是下一步了.!
		//尝试获取当前的时间
		//所有这个当前时间是结果时间
		Date d3 = c1.getTime();
		System.out.println("结束时间:");
		System.out.println(d3.toString());
		
		//然后设置多加一秒?获取前前7天还是后7天呢?
		
		//然后减去前七天,就可以知道开始的位置
		c1.add(Calendar.SECOND,1);
		
		//然后减去前七天,就可以获取得到一周前的时间了.!
		c1.add(Calendar.DAY_OF_MONTH, -7);
		System.out.println("开始时间");
		Date d4 = c1.getTime();
		System.out.println(d4.toString());
		
		
		
		

	}

}
