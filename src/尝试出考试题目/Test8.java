package 尝试出考试题目;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangleTest();
		

	}

	public static void triangleTest() {
		int count = 0;
		
		for(int i=0;i<5;i++) {
			
			for(int i1=0;i1<5;i1++) {
				
				if(i1>count-1) {
					
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
				
				
				
			}
			count++;
			System.out.println();
			
			
		}
	}

	
	
	
}
