package day01.加强练习题;

//内部类可以看作和字段、方法一样，是外部类的成员，而成员可以有 static 修饰。
//
// 静态内部类:使用 static 修饰的内部类，那么访问内部类直接使用外部类名来访问 
// 实例内部类:没有使用 static 修饰的内部类，访问内部类使用外部类的对象来访问 
// 局部内部类:定义在方法中的内部类，一般不用
// 匿名内部类:特殊的局部内部类，适合于仅使用一次使用的类 对于每个内部类来说，
//        Java 编译器会生成独立.class 文件。
//
//
// 静态和实例内部类:外部类名$内部类名字
// 局部内部类:外部类名$数字内部类名称
// 匿名内部类:外部类名$数字

public  class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.Test t1 = new Student(). new Test();
		
		Student.Test1 t2 = new Student.Test1();
		
		System.out.println(t1.testName);
		System.out.println(t2.testName);
		
		new Student().testMethod();
		
		int i = 0;
		for(int i1=i;i<10;i++) {
			
		}
		
		System.out.println(i);
		

	}

}

interface IUsb{
	
	void test();
	
}

class Student{
	
	String name = "kumanxuan";
	
	static String name2 = "Beetle Lai";
	
	
	//方法内部类.
	void testMethod() {
		
		String names="kumamon123";
		
		//匿名内部类
		
		IUsb u1 = new IUsb() {
			
			public void test(){
//				System.out.println();
				System.out.println("\n测试匿名内部类"+name+"\n");	
			}
		};
		
		u1.test();
		
		
		class TestSix{
			
			{
				System.out.println("我是方法内部类的代码块!");
				System.out.println(name);
			}
			
			//匿名内部类里面再写个方法.
			public void test() {
				
				System.out.println("asd测试内部类的方法调用->"+names);
				
			}
			
		}
		
		new TestSix().test();
		
	}
	
	
	class Test{
		
		
		String testName = "lizhixuan";
		String name = "asdasd";
		
		//不能定义static修饰的成员!.
		
		//估计final是可以修饰的!.?
		
		final String name1 =  "asd";
		String name2 = "beetle li";
		
//		static String name2 = "asd";
		
		{
			 System.out.println("测试打印内部类!-> "+name);
			 System.out.println("测试name2的就近原则!-> "+name2);
			 System.out.println("测试name2的就近原则!-> "+Student.name2);
			 System.out.println("测试打印内部类!-> "+Student.this.name);
			 System.out.println("测试打印内部类!-> "+Test.this.name);
		}
		
//		static class Test666{
//			
//		}
		
		class Test6{
			
			class Test66{
				//无限内部类!.
			}
			
		}
		
		
	}
	
	static class Test1{
		
		String testName = "beetle";
		
	}
	
	
	
}
