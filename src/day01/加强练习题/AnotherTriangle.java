package day01.加强练习题;

public class AnotherTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle(4);

	}
	
	static void triangle(int lines) {
		
		
		//分别打印空格  和  星星.
		
		//倒三角形
//		for(int line=0;line<=lines;line++) {
		//正三角形
		for(int line=lines;line>0;line--) {
			
			
			//然后进行输出空格.
			//然后就是输出星星了.!
			
			for(int i=0;i<line-1;i++) {
				System.out.print(" ");
			}
			
			for(int i1=0;i1<2*(lines-line+1)-1;i1++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
		}
		
		
	}

}
