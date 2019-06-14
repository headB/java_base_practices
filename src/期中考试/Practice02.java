package 期中考试;

public class Practice02 {

	public static void main(String[] args) {
		
		getCount(9);
		System.out.println("six");
		
	}
	
	
	public static void getCount(int num) {
		
		
		
		int count = 0;
		while(num!=1) {
			
			if(num ==1) {
				
				System.out.println("count当前的是-> "+ count);
				break;
			}
			
			if(num % 2 ==0) {
				//偶数
				num = num / 2 ;
				
				
			}else {
				
				//奇数
				 num = num * 3 +1;
				
			}
			
			count++;
			
		}
		System.out.println("当前的count为"+count);
		
	}
	
	
}
