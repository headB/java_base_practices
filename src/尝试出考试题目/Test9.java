package 尝试出考试题目;

import java.util.Arrays;

public class Test9 {
	
	public static void main(String[] args) {
		
		//快速冒泡排序法
		
		int[] arr = {1,101,201,45,76,12,89,45,106};
		
		System.out.println(Arrays.toString(arr));
		
		sortNumber(arr);
		
		System.out.println(Arrays.toString(arr));
		
		triangle(5);
		
	}
	
	static void sortNumber(int[] arr) {
		
		
		//需要前一个索引和后一个索引交换数值.
		
		
		//然后还有全部元素,都走一轮,除了最后一个.
		
		//尝试单轮排序.
		for(int i1=0;i1<arr.length-1;i1++) {
			
		
			for(int i=0;i<arr.length-1-i1;i++) {
			
				//前后数值对比.
				if(arr[i]>arr[i+1]) {
					
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
			}
			
		}
		
		
	}

	static void triangle(int lines) {
		
//		for(int i=1;i<=lines;i++) {
		for(int i=lines;i>=1;i--) {
			
			
			//然后就是输出三角形的*,然后就是空格,不分先后,都是可以的!.
			
			for(int i1=1;i1<=lines-i;i1++) {
				System.out.print(" ");
			}
			
			for(int i2=1;i2<=2*i-1;i2++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}
	
}
