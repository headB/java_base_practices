package static测试;

public class Test01 {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("hello world!");
		
		String s1 = "ABCD";
		String s2 = "ABCD";
		
		String s3 = new String("ABC") + "D";
		String s5 = new String("ABC") +"D";
		
		System.out.println("this is s5 s5 s5 s5 --->"+s5);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("this is s5 --> s3 "+(s5==s3));
		
		String receive = s3.toString();
		
		System.out.println("this is s5 --> s3 xxx "+(s1==receive));
		
		
		
		StringBuilder s4 = new StringBuilder("ABC").append("D");
		StringBuilder s6 = new StringBuilder("ABC").append("D");
		
		System.out.println(s3.equals(s4.toString()));
		
		System.out.println(s4==s6);
		
		
		
	}
	
//	static {
//		System.out.println("this is main of static coding");
//	}
//	
//	{
//		System.out.println("this is main of  coding");
//	}

}


class Han {
	
	{
		System.out.println("asd");
	}
	
	static {
		System.out.println("asd cctv  cctvb  tvb!  construction");
	}
	
	//这里不打算用static来返回,但是呢,那怎么返回呢?用static就可以不实例化直接访问,但是现在
	//私有化构造器了,那么现在用谁去返回呢?
	
	private Han() {
		System.out.println("我一开始,不用static方法修饰的成员变量,也会一开始就会实例化!???");
	}
	
	private final static  Han han = new Han();
	
	public static  Han returnObject() {
		
		StringBuilder sb1 = new StringBuilder("asd");
		
		sb1.append("asdasd");
		
		System.out.println(sb1);
		
		return han;
	}
	
	
	//普通内部方法.
	
	
	protected void test() {
		System.out.println("hello world!I am 普通方法");
	}
	
	
}