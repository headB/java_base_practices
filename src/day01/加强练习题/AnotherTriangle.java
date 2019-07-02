package day01.加强练习题;

import java.util.Arrays;

public class AnotherTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle(4);
		
		multiTable();
		
		triangleYangHui();
		
		triangleYangHui1();

		int[] list = {1,3,5,6,9,11};
//		System.out.println(list[1]);
		
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

	
	static void multiTable() {
		
		//然后就是,快速联系99乘法表!.
		
		for(int number=1;number<=9;number++) {
			
			for(int i=1;i<=number;i++) {
				
				System.out.format("%s * %s = %s  ",i,number,i*number);
				
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
	
	
	//尝试一下高难度的杨辉三角.
	
	static void triangleYangHui() {
		
		int lines = 10;
		
		//正三角形
		
		for(int line=1;line<=lines;line++) {
//		for(int line=lines;line>0;line--) {
			
			//空格
			for(int i=0;i<lines-line;i++) {
				System.out.print("   ");
			}
			
			//输出*
			for(int i1=0;i1<2*line-1;i1++) {
				System.out.print(" * ");
			}
			
			System.out.println();
			
			
		}
		
		
		
	}
	
	
	static void triangleYangHui1() {
		
		int lines = 10; 
		int[] tempLast = new int[1]; 
		//用数组来做处理?
		//然后就设置循环.
		for(int line=1;line<=lines;line++) {
			
			//大于1的时候,就可以设置一个数组了.!
			
				
				int[] temp = new int[line];
			
			
			for(int space=0;space<lines-line;space++) {
				System.out.print(" ");
			}	
			
			for(int i=0;i<line;i++) {
				
				//然后就是
				
				//然后这里就是套用公式了.!
				if(line==1) {
					
					temp[i] = 1;
					System.out.format("%s ",1);
				}else {
					
					//然后这些地方都是需要判断索引边界的问题了.!
					
//					第一个和最后一个都不行.!
					if(i==0 || i==line-1) {
						
						System.out.format("%s ",1);		
						temp[i] = 1;
					}else {
						
						//上一个数组的第一个和第二个相加
						
						int val = tempLast[i-1]+tempLast[i];
						System.out.format("%s ",val);	
						temp[i] = val;
					}
				}
				
				//最后就可以将数组交换.
				
				
			}
			
			System.out.println();
//			System.out.println(Arrays.toString(tempLast));
//			System.out.println(Arrays.toString(temp));
			
			tempLast = new int[line];
			tempLast = temp;
			
			
			
			
		}
		
	}
	
}
