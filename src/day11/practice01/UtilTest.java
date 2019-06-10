package day11.practice01;

import java.util.Arrays;

//需求:使用 static 方法的方式定义一个数组的工具类，并测试
//
//作业目的:熟悉工具类的设计方式

//工具类如何设计，在开发中有两种设计:




//如果工具方法全部使用 static 修饰
// 此时只需要使用工具类名调用工具方法
// 此时必须把工具类的构造器私有化，防止创建工具类的对象来调用静态方法


//如果工具方法没有使用 static 修饰
// 此时必须使用工具类的对象去调用工具方法  此时把必须工具类设计为单例模式的

//一般的出于简单考虑，首选第一种，如 JDK 中提供的工具 java.util.Arrays 类。

public class UtilTest {
	
	public static void main(String[] args) {
		
		//调用自己设计的静态测试类!
		int[] array = {1,66,2,88,100,3,4,9,8};
		ArrayUtil.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
