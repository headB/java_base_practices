package 尝试出考试题目;

import java.util.Arrays;

public class BaseKnowedge {

	public static void main(String[] args) {
		
		//
		
		
		//5.可能是倒数第二题编程大题
//		已知 两个三位数相关,  ABC+BCC=532，其中，A、B、C 为数字，编程求出 A、B 和 C 的值。
		// TODO Auto-generated method stub
		
//    999=>x*100>=100
//	    99=>y*10>=10
//	    99=>y*10>=10
		//    
//		for(int x=1;x<=4;x++) {
//			
//			for(int y=1;y<=4;y++) {
//				
//				for(int z=0;z<=9;z++) {
//					
//					if(  (x*100+y*10+z)+(y*100+z*10+z) == 532) {
//						System.out.format("%s %s %s\n",x,y,z);
//					}
//					
//				}
//				
//			}
//			
//		}
		
		
		
		//2.定义一个方法,请打印一个类似这样的倒立的直角三角形,如图所示.!
//		*****
//		 ****
//		  ***
//		   **
//		    *  
		
		
		//1.求 [1, 666] 之间能整除 7 的数的总和。
		
		
		
		//4.定义一个方法change，该方法需要传递一个整型数组参数arr但无返回，
		//在该方法中实现对arr进行从大到小排序.
		//例如对{1,45,23,11}重新排序,从大到小排列,变成{45,23,11,1}
		
		
		
		//5.定义一个方法 calculate(int num1, int num2, char operator)，
		//根据 operator 对 num1 与 num2 进行计算并返回结果，
		//限制 operator 只能传入 [+, -, *, /] 若传入非法操作符则返回 -1。
		
		
		//6、定义一个方法getLetter，接收一个 char[]数组，
		//然后将该数组中元素为 A-Z & a-z 之间的元素拼接为
		//一个全部大写化的字符串返回,并调用该方法输出返回结果。
		//如：传入数组 char[] chars= {‘*’, ‘J’, ‘0’, ‘-’, ‘a’, ‘$’, ‘v’, ‘a’} ，方法返回“JAVA”字符串
				//（//提示：大写字母的 ascii 范围是 65-90，小写字母的范围是：97-122）
		
		
		    
		    
		    
		//最后count和number的数值分别是多少
		
		int number=0;
		int count=0;
		while(number<=10) {
			count++;
			number++;
		}
		while(number<10) {
			--count;
			++number;
		}
		System.out.println(number);
		System.out.println(count);
		
		String str = "java";
		
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
		char[] char1 = str.toCharArray();
		
		for(char x:char1) {
			
			if(x>=97 && x<=112) {
				System.out.println((char)(x-32));
			}
			
		}
		
		int[] array = {1,45,23,11,87,32,45,13,98,44,101};
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		String s1 = "a";
		s1 = s1+"B"+"c";
		System.out.println(s1);
		
		

	}

}

//弄一题普通的水仙花数题目?




//文字题目
//1.使用/定义变量有什么要注意?


//2、声明一个变量：short num = 6。请分别阐述num += 6 与 num = num + 6 能不能编译通过？为什么？


//3.最后count和number的数值分别是多少

//		int number=0;
//		int count=0;
//		while(number<=10) {
//			count++;
//			number++;
//		}
//		while(number<10) {
//			--count;
//			++number;
//		}
//		System.out.println(number);
//		System.out.println(count);
//
//	}

//4
//请画出以下代码的内存分析图
//public static void main(String[] args) {
//	int[] arr = {10,20};
//	change(arr);
//}
//static void change(int[] arr) {
//	arr[0] = 100;
//}

//5
//请说出 |与|| 和 &与&& 的区别。


