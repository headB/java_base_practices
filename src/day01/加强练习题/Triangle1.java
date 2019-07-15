package day01.加强练习题;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//输出等边倒立三角形.
		
		
		
		triangle(8);
		

	}
	
	static void triangle(int lines) {
		
		
		//输出的高度
		
		for(int line=lines;line>0;line--) {
			
			//输出空格或者星星都是可以的.
			//不是,的确是空格先.
			
			for(int i=1;i<=line-1;i++) {
				System.out.print(" ");
			}
			
			for(int x=1;x<=2*(lines-line+1)-1;x++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
		
	}

}
