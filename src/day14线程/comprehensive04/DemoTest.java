package day14线程.comprehensive04;

import java.util.Arrays;

//4.练习四
//如何计算两个有序整型数组（没有重复元素）的交集？
//例如 a={0,1,2,3,4};b={1,3,5,7,9}; 交集为{1，3}。 



public class DemoTest {

	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,9};
		int[] b = {1,3,5,7,9};
		int[] c = new int[a.length];
		int count = 0;
		
		for(int temp:a) {
			
			for(int temp1:b) {
				if(temp==temp1) {
					
					
					c[count++] = temp;
//					记住索引
					
				}
				
			}
			
		}
		
		//然后创建新数组
		int[] d = new int[count];
		for(int i=0;i<count;i++) {
			d[i] = c[i];
		}
		
		System.out.println(Arrays.toString(d));
		
	}
	
}
