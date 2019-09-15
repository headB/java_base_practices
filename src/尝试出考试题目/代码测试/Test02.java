package 尝试出考试题目.代码测试;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,9,3,4,7,12,11};
		int count = 0;
		// 奇数偶数需要分开放.
		for(int i:arr) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
			else {
				// 这个时候需要交换位置了.
				System.out.println("我这里输出的是偶数的了>!!↓↓");
				System.out.println(i);
				// 然后我这里进行遍历,找一个后面是奇数的数进行交换??
				for(int i1=count+1;i1<arr.length-1;i1++) {
					
					if(arr[i1]!=0) {
						//然后进行交换,并且使用break断开当前的循环.
						int temp = arr[count];
						arr[count] = arr[count+1];
						arr[count+1] = temp;
					}
					
				}
			}
			
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		

	}

}
