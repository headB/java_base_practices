package 尝试出考试题目;

import java.util.Arrays;

public class Test1 {
//	
//	4、已知数组 int[] arr = {1 ,2,1,1,2,3,4,4,5},
//			(6)int getElementCount(int[]arr ,int value),该方法返回value,在arr数组中出现的次数
//			(7)在主方法中,输出每个元素出现的次数:
//			例如:	1 在数组中出现了 3 次
//			        2 在数组中出现了 2 次

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,1,1,2,3,4,4,5};
		
		repeatTime(arr, 2);
		
		int[] a1 = new int[2];
		
		System.out.println(Arrays.toString(a1));
		
		
		statisticsTime(arr);
		
	}
	
	
	static void repeatTime(int[] array,int value) {
		
		//简单粗暴
		int[] newArray1 = new int[array.length];
		
		//循环所有元素.!
		int index = 0;
		int count = 0;
		for(int target:array) {
			
			if(target==value) {
				
				count++;
			}
			
////			判断跟当前所有的有没有冲突
//			for(int repeat:newArray1) {
//				
//				System.out.println(repeat);
//			}
			
			
		}
		
		System.out.format("%s 在数组中出现了 %s 次\n",value,count);
		
		
		
	}

	
	static void statisticsTime(int[] array) {
		
		//先去重吧.
		//数组保存起来.!
		if(array.length<1) {
			System.out.println("长度不足!");
		}else {
			
			int[] norepeatValArray = new int[array.length];
			
			int index = 0;
			
//			norepeatValArray[0] = array[0];
			
			for(int ele:array) {
				
				boolean t1 = true;
				//从第一个开始,然后
				for(int ele1:norepeatValArray) {
					
					if(ele1==ele) {
						
						t1 = false;
						break;
					}
					
					
				}
				
				if(t1) {
					norepeatValArray[index] = ele;
					index++;
				}
				
				
				
			}
			System.out.println(Arrays.toString(array));
			System.out.println(Arrays.toString(norepeatValArray));
			
			
			//去重之后就可以对比究竟出现多少次重复了.!
			
			
			for(int i=0;i<index;i++) {
				
				int count1 = 0;
				
				int target = norepeatValArray[i];
					
				for(int ele1:array) {
					
					
					if(ele1==target) {
						count1++;
					}
					
					
				}
					
				System.out.format("数字%s 出现重复的次数是-> %s \n",target,count1);
					
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	
}
