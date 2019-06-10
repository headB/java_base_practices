package day11.practice03;

//需求:包装类、基本数据类型、String 三者的互换
//作业目的:掌握包装类、基本数据类型、String 三者的互换操作

public class TestDemo {
	
	public static void main(String[] args) {
		
		
		//自动装箱
		Integer i1 = 1;
		//自动拆箱
		int i2 = i1;
		System.out.println(i1);
		System.out.println(i2);
		
		//手动装箱
		Integer i3 = new Integer(1);
		Integer i4 = Integer.valueOf(1);
		int ii4 = i3 + i4;
		System.out.println("两个integer相加->"+ii4);
		//手动拆箱
		int i5 = i3.intValue();
		System.out.println(i5);
		
		
		//然后就是基本类型,包装类,还有String 相互转换.
		
		//基本转包装.
		Integer i6 = 7;
		int a = i6 +7;
		System.out.println(a);
		Integer b = i6 +7;
		System.out.println("this is "+b);	
		//基本装字符串
		String i7 = Integer.toString(8);
		System.out.println(i7+1);// 证明这个8是一个字符串
		
		//包装装字符串
		String i8 = i6.toString();
		System.out.println(i8+5);
		//包装类转基本类型
		int a1 = i6 +7;
		
		//字符串转包装
		Integer i9 = Integer.valueOf("66");
		//字符串转基本类型
		int i10 = Integer.parseInt("666");
		System.out.println("这个是字符串转换基本类型的->"+(i10+1));
		
		
		
	}
	

}
