package 期中考试;

//4.定义一个方法getSum，传入整数n，求出1*2 + 2*3 + 3*4 +...+ (n-1)*n的结果.
//注意：判断如果n小于等于1，打印“结果无效”并返回-1；否则返回计算结果。

public class Practice04 {
	
	public static void main(String[] args) {
		
		int sum = getSum(4);
		System.out.println(sum);
		
	}
	
	
	public static int getSum(int n) {
		
		int sum = 0;
		
		
		
		if(n<=1) {
			
			System.out.println("结果无效");
			return -1;
			
		}
		
		for(int i=1;(i+1)<=n;i++) {
			
			sum = sum + i * (i+1);
			
		}
		
		return sum;
		
		
		
		
	}
	

}
