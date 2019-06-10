package day01;

import java.util.Arrays;

public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = plus(4,5);
		System.out.println(x);
		
		printString(6);
		
		int[] array1 = {1,2,3,4,5,6};
		MethodDemo3.printArray(array1);
		
		int index = MethodDemo4.returnIndex(array1, 4);
		System.out.println(index);
		
		double[] array2 = {10D,20D,30D};
		double total_price = VarArgsDemo.price(array2, 0.5);
		System.out.println(total_price);
		
		int result = SumDemo.getSum(1, 10);
//		int result = SumDemo.getSum(10, 3);
		System.out.println(result);
		
		//然后一个二维数组,然后就是,调用方法
		int[][] array  = {{1,2,3},{4,5,6,7,8}};
		int avg = AvgDemo.returnAvg(array);
		System.out.println(avg);
		
		System.out.println("测试方法的值传递测试");
		//基本类型参数
		int a = 10;
		System.out.println("before: " + a);
		//调用方法
		MethodParamDemo.change(a);
		System.out.println("end: " + a);

		//引用类型参数
		int[] arr1 = new int[]{10, 90};
		System.out.println("before: " + arr1[0]);
		//调用方法
		MethodParamDemo.change(arr1);
		System.out.println("end: " + arr1[0]);
		
		System.out.println("然后测试三角形的三边问题");
		
		//然后测试三角形的三边问题
		System.out.println(JudgeTriangleDemo.returnResult(1, 2, 3));
		System.out.println(JudgeTriangleDemo.returnResult(1, 1, 1));
		System.out.println(JudgeTriangleDemo.returnResult(1, 6, 1));
		System.out.println(JudgeTriangleDemo.returnResult(1, 6, 6));
		System.out.println(JudgeTriangleDemo.returnResult(7, 7, 6));
		
		
		//然后测试最后一个,就是,看看新组建的新数组
		int[] array11 = {1,2,3,4,5};
		int[] array22 = {6,7,8,9,10};
		System.out.println(Arrays.toString(CombineDemo.returnMerge(array11, array22)));
		
	}
	
//	1.第一题 MethodDemo1.java
//	需求:定义求两个整数之和的方法
//	步骤:
//	(1)定义方法 确定方法名，修饰符(暂时使用 static) 确定是否需要形式参数 确定是否需要返回
//	(2)调用方法 确定调用语法(暂时类名调用方法) 确定需要传入什么实际参数 确定是否需要定义变量接收返回值
	
	public  static int plus(int x,int y) {
		
		int c = x + y;
		
		//return x+y;
		return c;
		
	}
	
	
//	2.第二题 MethodDemo2.java
//	需求:定义一个方法，打印指定多少行的指定字符串
//	步骤:
//	(1)定义方法 (2)实现方法体 (3)调用方法
//	
	public static void printString(int x) {
		
		
		for(int i=0;i<x;i++) {
			System.out.println("我是字符串!");
		}
		
	}
	

}


//3.第三题 MethodDemo3.java
//需求:定义一个方法，传入一个 int 数组，按照格式打印 int 类型数组 步骤:
//(1)定义方法 (2)实现方法体 (3)调用方法

class MethodDemo3{
	
	public static void printArray(int[] array1) {
		
//		for(int i:array1) {
//			System.out.println(i);
//		}
		
		String str = "[";
		for(int i=0;i<array1.length;i++) {
			
			if(i==array1.length-1) {
				
				str+=array1[i]+"]";
			}else {
				str+=array1[i]+",";
			}
			
			
		}
		System.out.println(str);
		
	}
	
}
//4.第四题 MethodDemo4.java
//需求:定义一个方法，传入一个 int 数组，返回指定元素在数组中第一次出现的索引 步骤:
//(1)定义方法 (2)实现方法体
//遍历数组 如果当前元素和指定元素相同，返回当前元素所在的索引 遍历所有元素后，发现找不到则返回-1，表示找不到索引
//(3)调用方法
class MethodDemo4{
	
	public static int returnIndex(int[] array1,int x) {
		
		for(int i=0;i<array1.length;i++) {
			
			if(x==array1[i]) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	
}

//5.第五题 VarArgsDemo.java
//需求;定义一个方法，传入两个参数，一个 double 数组表示多个货品的价格，一个 double 类型的折扣，返回货品总价格
//步骤:
//(1)定义方法，使用数组作为参数 (2)定义方法，使用可变参数作为参数 (3)调用两个方法

class VarArgsDemo{
	
	public static double price(double[] array1,double discount) {
		
		
		double price = 0;
		for(double i:array1) {	
			price += i;
		}
		
		double totalPrice = price*discount;
		
		
		return totalPrice;
	}
	
}

//6.第六题 MethodParamDemo.java
//需求:演示基本数据类型值传递机制和引用数据类型值传递机制的区别 步骤:
//(1)基本数据类型的值传递机制 定义一个方法，改变一个基本类型变量的值
//(2)引用数据类型值传递机制 定义一个方法，改变一个数组中的一个元素的值
//(3)调用方法，并观察值之间的区别 (4)请画出基本类型值传递的内存分析图 (5)请画出引用类型值传递的内存分析图

class MethodParamDemo{
	
	static void change(int x)
	{
		x = 100;
	}

	static void change(int[] arr2)
	{
		arr2[0] = 30;	
	}

	public static void main(String[] args)
	{
		System.out.println("测试方法的值传递测试");
		//基本类型参数
		int a = 10;
		System.out.println("before: " + a);
		//调用方法
		MethodParamDemo.change(a);
		System.out.println("end: " + a);

		//引用类型参数
		int[] arr1 = new int[]{10, 90};
		System.out.println("before: " + arr1[0]);
		//调用方法
		MethodParamDemo.change(arr1);
		System.out.println("end: " + arr1[0]);

	}
	
}

//二、综合练习:
//1.练习一 SumDemo.java
//需求:定义一个方法 getSum，接收两个 int 类型的参数 [min, max]，返回这个两个参数范 围之内的偶数之和。


//但是这个地方,就不好了,就是,这里要求的是,定义两个方法,有一个是防住用户输入错的数.
class SumDemo{
	
	public static int[] swap(int min,int max) {
		
		//设置数组来保存
		int[] array = new int[2];
		
		if(min>max) {
			
			int temp;
			temp = max;
			max = min;
			min = temp;
		}
		array[0] = min;
		array[1] = max;
		
		return array;
		
	}
	
	public static int getSum(int min,int max) {
		
		int[] array = swap(min,max);
		
		min = array[0];
		max = array[1];
		
		int sum = 0;
		for(int x=min;x<=max;x++) {
			
			if(x%2==0) {
				sum += x;
			}
			
		}
		
		return sum;
		
	}
	
}

//2.练习二 AvgDemo.java
//需求:定义一个方法接收一个 int 类型的二维数组，返回所有元素平均值(int 类型)。
//思路:{{0,1,2}，{3,4}} 结果(0+1+2+3+4)/5 = 2
class AvgDemo{
	
	public static int returnAvg(int[][] array) {
		
		int sum = 0;
		int count = 0;
		for(int[] x:array) {
			for(int y:x) {
				
				sum += y;
				count++;
				
			}
		}
		
		//然后求平均数
		int avg = sum / count;
		
		return avg;
		
	}
	
}

//三、拓展练习
//1.拓展一 JudgeTriangleDemo.java 
//需求:定义一个方法，给定三条边，判断三角形的边,如果其中两边相等返回 1，如果三边相
//等返回 2，其他返回 0.

class JudgeTriangleDemo{
	
	public static int returnResult(int a,int b,int c) {
		
		
		if(a==b && b==c) {
			return 2;
			
		}else if(a!=b && b!=c && a!=c) {
			return -1;
		}
		else {
			return 1;
		}

	}
	
	
}

//2.拓展二 CombineDemo.java
//需求:定义一个名为 combineArrays 的方法，
//以两个 int 类型的数组 arr1 和 arr2 作为参数， 
//实现将 arr1 和 arr2 两个数组合并为一个新的数组，
//并返回合并后的新数组。 例如:arr1={1,2},arr2={3,4}，则该方法应该返回{1,2,3,4}。
//思路:
//(1)先求出符合要求的元素个数 
//(2)创建一个新的数组存放符合要求的元素 
//(3)将符合要求的元素存放到新的数组中
class CombineDemo{
	
	int[] array1 = {1,2};
	int[] array2 = {3,4};
	
	public static int[] returnMerge(int[] x,int[] y) {
		
		//创建一个新数组,然后长度是两个数组的相加结果
		int[] array1 = new int[x.length+x.length];
		
		int count = 0;
		
		for(int x1:x) {
			array1[count] = x1;
			count++;
		}
		
		for(int y1:y) {
			array1[count] = y1;
			count++;
		}
		
		
		return array1;
		
		//文锦的答案
		//主方法
		/*
		 * public static void main(String[] args) { //定义两个数组并静态初始化 int[] arr1 = new
		 * int[]{1, 2, 3}; int[] arr2 = new int[]{4, 5, 6};
		 * 
		 * //调用arrcompound方法 String arr3 = CombineDemo.arrcompound(arr1, arr2);
		 * System.out.println(arr3); }
		 * 
		 * 
		 * //将两个数组合并成一个数组的方法 static String arrcompound(int[] arr1, int[] arr2) {
		 * //arr1和arr2的总长度 int size = arr1.length + arr2.length; //定义一个新数组 int[] arr3 =
		 * new int[size]; //初始化索引 int index = 0;
		 * 
		 * //foreach循环遍历数组
		 * 
		 * for(index = 0; index < arr1.length; index ++) { arr3[index] = arr1[index]; }
		 * for(int index2 = 0; index2 < arr2.length; index2 ++) { arr3[index] =
		 * arr2[index2]; index ++; } //调用将数组转换成字符串显示 String a =
		 * CombineDemo.arrstring(arr3); //返回 return a; }
		 * 
		 * 
		 * 
		 * //将数组装换成字符串 static String arrstring(int[] arr) { //定义一个String类型 String str =
		 * "["; //foreach循环 for(int index = 0; index < arr.length; index ++) { if(index
		 * != arr.length - 1) { str = str + arr[index] + ", "; } else { str = str +
		 * arr[index] + "]"; } }
		 * 
		 * //返回 return str; }
		 */
		
	}
	
	
}



