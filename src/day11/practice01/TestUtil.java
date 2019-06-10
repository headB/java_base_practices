package day11.practice01;


//全部方法都是用static来修饰

public class TestUtil {

	//私有化构造器,防住去被实例化
	private TestUtil() {
		
	}
	
	public static void echo() {
		System.out.println("six!这个静态工具类全部都是用static来修饰的!");
		
		//尝试去调用非静态方法
		//然后就会失败了.!
	}
	
	public static void echo1() {
		System.out.println("six!这个静态工具类全部都是用static来修饰的!");
		
		//尝试去调用非静态方法
		//然后就会失败了.!
	}
	
	
	public void test() {
		
	}
	
}
