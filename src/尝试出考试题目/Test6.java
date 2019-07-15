package 尝试出考试题目;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 6;
		int b;
		
		int[] arr = {1,101,86,97,110,220,8,3,145};
		
		System.out.println(Arrays.toString(arr));
		
		sortNumber(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		int n = 197;
		
		// 做出判断循环
				for(int k=2;k<=n;k++) {
					while(n!=k) {
						if(n%k==0) {
							System.out.print(k+"*");
							n=n/k;
						}else{
							break;
						}
					}
				}
				
				
				System.out.println(n); // 表示打印出的是最後一个数
		

	}

	
	//快速排序法
	
	static void sortNumber(int[] array) {
		
		//OK!开始排序.
		
		//准备轮询.每一轮都会减少一次的!.
		
		//先简单轮询一次
		
		//对啊,需要交换两个数值啊.
		for(int i=0;i<array.length-1;i++) {
			
			for(int i1=0;i1<array.length-1-i;i1++) {
				
				
				//前面一个和后面一个做对比.
				if(array[i1]>array[i1+1]) {
					
					//交换数值/
					int temp = array[i1];
					array[i1] = array[i1+1];
					array[i1+1] = temp;
					
				}
				
				
			}
			
			
		}
		
		
		
	}
	
}
