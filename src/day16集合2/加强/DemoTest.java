package day16集合2.加强;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add(new int[1][10]);
		list.add(new int[2][2]);
		
//		for()
		
		for(Object ele:list) {
			
			//进行强转
			int[][] array = (int[][]) ele;
			System.out.println(Arrays.toString(array));
			for(int[] array1:array) {
				System.out.println(Arrays.toString(array1));
			}
			
		}
		
//		System.out.println(Arrays.toString(list));
		
		
		//快速打印倒三角形,直角的.!
		
		int lines = 8;
		
		for(int line=lines;line>0;line--) {
			
			//然后就可以打印空格.
			
			for(int i=0;i<lines-line;i++) {
				
				System.out.print(" ");
				
			}
			
			for(int i=0;i<line;i++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			//还有 *
			
			
			
		}
		

	}

}
