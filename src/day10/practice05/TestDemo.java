package day10.practice05;

public class TestDemo {
	
	public static void main(String[] args) {
		
		//面对对象第四天测试
		
//		CloneType c1 = new CloneType();
//		c1.setType(CloneType.MEM);
		
		//尝试直接打印枚举类
		System.out.println(CloneType.MEN);
		
		CloneType i = CloneType.MEN;
		System.out.println(i);
		
		System.out.println(i.name());
		
		System.out.println(i.ordinal());
		System.out.println(CloneType.WOMEN.ordinal());
		
		
		
	
		
	}
	
	
	
	

}
