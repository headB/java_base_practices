package day12.practice05;

public class TestDemo {
	
	//OK!稍微加一个总结,就是,OK的,就是,等边三角形,我排除了两次bug就OK了.!
	
	public static void main(String[] args) {
		
		//然后尝试快速打印等边三角形
		
		//100%先输出空格
		
		//先设置要输出多少行先.
		int lines = 3;
		
		for(int line=1;line<=lines;line++) {
			
			//先输出空格,
			for(int i1=0;i1<=lines-line;i1++) {
				System.out.print(" ");
				
			}
			
			//然后就是输出*
			for(int i2=0;i2<2*line-1;i2++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

}
