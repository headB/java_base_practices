package day01.加强练习题;

//联系等边三角形.

//哈哈哈,还有九九乘法表的啦!

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		triangleDraw(4);
//		triangleDrawOther(4);
		
		multiplicationTable();
		
		printQuary();
		
		
		
	}
	
	
	static void triangleDraw(int lines){
		
		//    * 第几行出现星星的数目就是    *   = 2n-1
		//   [空格] 出现第几行的规律是  [空格]  = n-1
		
		//具体第几行输出多少个星星.!
		
//		for(int line=lines;line>0;line--) {
//			
//			for(int i1=0;i1<line-1;i1++) {
//				System.out.print(" ");
//			}
//			
//			//星星的公式还是那条公式
//			for(int i=0;i<(lines-line+1)*2-1;i++) {
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println("");
//			
//		}
		
		
		for(int line=1;line<=lines;line++) {
			
			
			//然后是输出空格
			for(int i1=0;i1<line-1;i1++) {
				System.out.print(" ");
			}
			
			//然后先星星输出
			
			for(int i=0;i<(lines-line+1)*2-1;i++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			
			
		}
		
		
		
		
	}
	
static void triangleDrawOther(int lines){
		
		//    * 第几行出现星星的数目就是    *   = 2n-1
		//   [空格] 出现第几行的规律是  [空格]  = n-1
	
		for(int line=lines;line>0;line--) {
		
		//哈哈,我又来啦!.
			
		//然后我是来增加空格的!关键就是表达式了.!
			
		for(int i2=0;i2<lines-line;i2++) {
			System.out.print(" ");
		}
			
		
		for(int i1=0;i1<2*line-1;i1++) {
			System.out.print("*");
		}
		
		
		System.out.println();
		
		}
		
		
	
		
		
	}


//嗯嗯,开始练习九九乘法表

static void multiplicationTable() {
	
	//嗯嗯,开始啦!
	
	// 1 * 1 = 1
	// 1 * 2 = 2  2 * 2 = 4
	//
	
	for(int i3=1;i3<=9;i3++) {
		
		
		for(int i1=1;i1<=i3;i1++) {
			
			System.out.format(" %s * %s = %s ",i1,i3,i1*i3);
			
		}
		System.out.println();
		
	}
	
	
	
	
	
	
}

//打印正方形书
static void printQuary() {
	
	for(int i=1;i*i<=100;i++) {
		System.out.println(i*i);
	}
	
}

void testFunction() {
	
}


}



