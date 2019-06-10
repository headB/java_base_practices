package day01;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(3.14D);
		System.out.println(3.14F);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println(012);
		System.out.println(0x22);
		
		
		long l = 17;
		float f1 = 17L;
		float f2 = l;
		
		byte b1 = 1;
		byte b2 = 2;
		
		int i1 = b1+b2;
		
		char c11 = 2;
		
		
		System.out.println("asd"+c11);
		System.out.println(f1);
		System.out.println(f2);
	

		
		
		System.out.println(   87654D / 10000   );
		
		char c7 = '◀';
		System.out.println("------");
		System.out.println(c7);
		System.out.println((int)c7);
		System.out.println((char)10);
		System.out.println("------");
		
		
		{
			
			int num1 = 4;
			System.out.println(4+3.14);
			System.out.println(num1+=3.14);
			
		}
		
		
		
		{
			
    System.out.println("FWJ");
    System.out.print("hahahah");
    
    
    //现在是测试通过二进制给byte来赋值.
    System.out.println("测试二进制来赋值");
    
    byte b22 = 0b000000_000000_00000001;
    short s22 = 65; 
    int b23 = 0b00000000_10000000_00000000_00000001;
    int i24 = 2147483647;
    System.out.println("this is i24-->+"+i24);
    //byte b22 = 1;
    
    char c12 = '8';
    System.out.println(c12 +1);
    
    System.out.println("输出integer的最大值:");
    System.out.println(Integer.MAX_VALUE);
    
    System.out.println(b22);
    System.out.println(b23);
    
    
  }


			
			
		
		
		
		
		
	}

}
