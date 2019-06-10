package day12.practice04;

import java.util.Date;

//4. 第四题 SimpleDateFormat.java(重点)
//需求:使用日期 Date 类常用方法
//作业目的:掌握 Date 对象的创建和常用方法的调用

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date();
		
		System.out.println("欧美人的打印风格-> "+d1);
		
		System.out.println("本地风格打印方式-> "+d1.toLocaleString());
		
		System.out.println("获取距离1970年到现在的时间间隔-> ?? "+d1.getDate());
		System.out.println("获取距离1970年到现在的时间间隔-> ?? "+d1.getDay());
		System.out.println("获取距离1970年到现在的时间间隔-> ?? "+d1.getTime());

	}

}
