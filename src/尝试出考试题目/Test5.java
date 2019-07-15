package 尝试出考试题目;

import java.util.Arrays;

public class Test5 {
	
	public static void main(String[] args) {
		
		
//		需求:请输出 1-100 以内最大的五个质数(质数又称素数。一个大于 1 的自然数，
//				如果除了 1 和它自身外，不能被其他自然数整除的数)。
//				思路:
//				(1)一个数 num 和[2，num)这个范围的数进行对比，如果能被整除就不需要进行对比 
//				(2)5 个数，那么需要我们定义一个计数器，来记录符合要求的个数 
//				(3)最大的需要我们倒着循环
		
		short s1 = 2019;
		
		if(0<s1) {
			System.out.println("asdasdasd");
		}
		
		s1 += (short) s1;
		
		System.out.println(s1);
		
		System.out.println(16 % 4);
		
		for(int i=0;i<4;i++) {
//			return;
		}
		
		statisticsTime(300);
		
	}
	
	
	static int statisticsTime(int sope) {
		
		int[] array = new int[sope/2];
		
		int index = 0;
		
		
		
//		int count = 0;
		
//		for(int i=sope;i>=2;i--) {
		for(int i=2;i<sope;i++) {
			
			if(index>array.length-1) {
				break;
			}
			
			boolean flag = false;
			
			//从自己开始倒数
			
//			for(int number=(i-1);number>2;number--) {
			for(int number=2;number<i-1;number++) {
				
				if(i % number == 0) {
					
					flag = true;
					break;
					
				}
				
				
			}
			
			if(!flag) {
				
				array[index] = i;
				index++;
				
			}
			
			
		}
		
		System.out.println(index);
		
		System.out.println(Arrays.toString(array));
		
		//然后就可以分解了.!
		
		
		
		//可以一来就可以判断这个数是否为质数.
		if(array[24]==sope) {
			
			System.out.println("不同分解了,你就是质数了.!");
			
			return -1;
			
		}
		
		
		//顺便可以做分解因数.!
		
		String str = "";
		int sope1 = sope; 
		
		System.out.println("分解数字-> "+sope);
		
		int start = 0;
		
		while(array[start]<=sope1) {
			
//			System.out.println("this is start -> "+start);
//			System.out.println("this is index -> "+index);
			
			if(start>index-1) break;
			
			
			
			if(sope1 % array[start] ==0) {
				
				sope1 /= array[start];
				str += array[start];
				
				if(sope1==1) {
					System.out.println("数字"+sope+"的质因数分解-> "+ sope+" = "+str);
					
					return 1;
				}else {
//					System.out.println(" * ");
					str += " * ";
				}
				
			}else {
				
				start++;
				
			}
			
			
			
		}
//		
		if(sope1!=1) System.out.println("分解失败,"+sope+"这个数应该是一个质数!无法分解!");
		
		System.out.println(str);
		
		
//		int number1 = sope % 
		return -1;
		
		
		
	}

}
