package 尝试出考试题目;

public class Test7 {
	
	public static void main(String[] args) {
		int num = 3;
		
		int num1 = 2;
		
		for(num1 = 3;num1>0;num1--) {
			
		}
		
		System.out.println("this is num1->" + num1);
		
		int total = 0;
		int rank = 1;
		
		for(int index=1;index<=num;index++) {
			
			rank *= index;
			total += rank;
			
			
		}
		
		System.out.println(total);
	}
	
	

}
