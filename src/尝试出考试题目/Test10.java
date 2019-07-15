package 尝试出考试题目;


//这里就是分解质因数.

public class Test10 {
	
	public static void main(String[] args) {
		
		int number = 987;
		System.out.format(" %s = ",number);
		analysisNumber(number);
		System.out.println();
		
		
		analysisNumbers(number);
		
		
	}
	
	
	//分解某个数的最后的
	
	public static void analysisNumber(int number) {
		
		for(int i=2;i<=number;i++) {
			
			//这里就得设置出口了.!
			
			if(number % i ==0) {
				
				if(number/i==1) {
					
					System.out.print(i);
					
					
				}else {
					
					System.out.print(i+" * ");
				}
				
				analysisNumber(number/i);
				break;
				
			}else if(i+1<=number) {
				
//				analysisNumber(number/i);
			}
			else {
				
//				System.out.println("结束了.!");
				break;
			}
			
			
		}
		
	}

	
	public static void analysisNumbers(int number) {
		
		System.out.format(" %s = ",number);
		
		int number1 = number;
		
		for(int i=2;i<=number1;i++) {
			
			
			//这里是可以整除的情况
			if(number1 % i == 0) {
				
								
				if(i==number) {
					System.out.print(" 我是质数 "+i);
					break;
				}
				
				if(number1 / i ==1) {
					System.out.print(i);
				}else {
					System.out.format("%s * ",i);

				}
				
				number1 /= i;
				
				//不能整除的情况
			}else {
				
				
				
				
			}
			
			
		}
		
		
	}

}
