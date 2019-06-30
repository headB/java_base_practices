package day06;

import java.util.Arrays;

//加强冒泡法的练习

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] array = {9,99,10,66,34,28,11,98,101,101,25,35,99,101};
		
//		然后就是核心的方法,位置排序,第一个,第二个交换.
		
		int index1 = 0;
		int index2 = 0;
		int temp1 = 0;
		
		int count = 0;
		for(int i1 = 0;i1<array.length-1;i1++) {
			
			for(int i=0;i<array.length-1-i1;i++) {
				
				//首先搞清楚   前一个   和   后一个  索引是如何表示
				
				//    i    i+1
				
				//大的放前面
				
				if(array[i]>array[i+1]) {
					
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					
				}else if (array[i]==array[i+1]){
					
					
						temp1 = array[i];
						array[i] = 0;
						
					}
				//然后就可以顺便去重.!

			}
			
		}
		
		//创建新数组
		Integer[] array2 = new  Integer[array.length];
		int count2 = 0;
		for(int x:array) {
			
			if(x==0) {
				count2++;
			}
			
		}
		
		//创建新数组
		Integer[] array3 = new  Integer[array.length-count2];
		
		int newIndex = 0;
		for(int x=0;x<array.length;x++) {
			
			if(array[x]!=0) {
				
				array3[newIndex] = array[x];
				newIndex++;
				
			}
			
		}
		
		
		System.out.println(Arrays.toString(array3));
		
		//但是上面步骤只是负责将最大的数放到最后,但是呢,前面的数还是没有排好序的!>
		
		System.out.println(Arrays.toString(array));
		
		
		

	}
	
	

}
