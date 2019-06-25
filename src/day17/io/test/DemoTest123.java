package day17.io.test;

import java.util.Arrays;

public class DemoTest123 {
	
	//将重复的元素的数组去重.
	
	public static void main(String[] args) {
		
		int[] reap_array = {11,12,13,13,14,14,15,16,18};
		
		int[] array2 = new int[reap_array.length];
		
		int i1 = 0;
		for(int i=0;i<reap_array.length;i++) {
			
			System.out.println(reap_array[i]);
			
			if(i>0) {
				
				if(array2[i1]!=reap_array[i]) {
					i1++;
					array2[i1] = reap_array[i];
					
				}
				//然后就可以根据有没有重复值来进行保存数据了.!
				
			}else {			
				array2[i1] = reap_array[i];
				
					
			}
			
		}
		
		System.out.println(Arrays.toString(array2));
		
		//尝试手动去重.
		
	}
	
	public static void mian1(int[] ar1) {
		
		
		
	}

}
