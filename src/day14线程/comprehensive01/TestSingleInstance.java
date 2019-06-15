package day14线程.comprehensive01;

import java.util.Arrays;

public class TestSingleInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testVar("kumanxuan","A","B","C","D");
		
		String[] s1 = {"lizhixuan","CCTV","ATV"};
		
		testVar("kumanxuan",s1);
	}
	
	static void testVar(String name,String ... Array) {
		
		String s1 = Arrays.toString(Array);
		System.out.println(s1);
		
	}

}

//测试可变参数.






//测试单例
class SingleInstance {
	
	//测试一下创建单例,但是呢,就是不使用static
	
	//私有化构造器是必须的
	private SingleInstance() {
		
	}
	
	//然后设置一个变量,尝试不是设置成为static,也就是类变量哪一种.
	
	//然后这里稍微明白了点了,就是,如果你这个instance不设置成为static修饰的话,下面的静态方法也就无法设置这一个公共位置的instance
	//再加上就是,static修饰的是变成了类变量了,在jvm加载类的时候就加载完成了,然后保存到方法区中
	//提供给所有的对象去使用.
	
	//static的静态初始代码块的话,就是,也是局部变量,但是呢,他是
	static private SingleInstance instance = null;
	
//	设置一个公共参数返回实例
	static public SingleInstance returnInstance() {
		if (instance==null) {
			
		}
		
		return instance;
	}
	
	
}
