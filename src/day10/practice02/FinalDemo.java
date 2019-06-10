package day10.practice02;

//需求:演示 final 修饰符的特点
//  final 修饰的类:表示最终的类, 该类不能再有子类
//  final 修饰的方法:最终的方法, 该方法不能被子类覆盖
//  final修饰的变量:表示常量，该变量只能赋值一次，不能再重新赋值。
// 基本数据类型:表示的值不能改变
// 引用数据类型:所引用的地址值不能改变

public class FinalDemo {
	
	public static void main(String[] args) {
		
		//Super不能被继承,但是可以实例化
		Super s1 = new Super();
		s1.echo();
		
		//实例化一个带有final方法的类,
		TestFinalMethod t1 = new TestFinalMethod();
		t1.echoWithFinal();
		
		//然后尝试去继承
		TestFinalMethodSub t2 = new TestFinalMethodSub();
		t2.echoWithFinal();
		t2.echoWithFinal1();
		//报错
		//- Cannot override the final method from TestFinalMethod
		//- overrides 
		
		
		//然后尝试使用final去定义变量,普通的成员变量那种.
		final Super s2 = new Super();
		s2.echo();
		s2.setName("six seven eight!");
		
		
		//引用数据类型:所引用的地址值不能改变
		//The final local variable s2 cannot be assigned. It must be blank and not using a compound assignment
		//报错,大概意思就是,这个变量不能赋值两次
		//s2 = new  Super();
		
		
		//一般用final定义的变量,就是常量!!.需要全部变成大写字母!.
		
//		使用 public static final 修饰的成员变量，
//		称之为公共的静态常量。一般表示程序中固定的一个值，
//		常 量名称使用大写字母组成，多个单词之间使用下划线隔开。
		final String FIX_VAR = "固定变量,常量!";
		
		//首先,局部变量不能用修饰符去修饰.
		
		
//		出现这样的错，一般都是在方法中声明变量时提示，原因是用了public，private，static等修饰词去修饰方法内部变量，
		//然而在java类的方法里声明变量时，他是只能用final修饰(only final is permitted)（或者不加修饰）。
		//除此之外不能用其他的修饰符修饰，包括static也会报同样的错误。
//		public，private等是声明作用域的。方法内部定义的变量（只能在方法内部使用），在里面声明作用域无意义，也禁止声明。
//		但是在方法外面，是可以的。
		Super.FIX_WITHOUT_FINAL = "444";
		
		
		Super s11 = new Super();
		System.out.println("this is FIX_WITHOUT_FINAL->"+s11.FIX_WITHOUT_FINAL);
		s11.FIX_WITHOUT_FINAL = "666";
		System.out.println(Super.FIX_WITHOUT_FINAL);
		System.out.println("this is final define -> "+s11.FIX_VAR);
//		s11.FIX_VAR = "666123";  //无法设置
//		s11.FIX_VAR1 = "asdasdasd"; //也是无法设置,因为都是有final修饰的.!
		System.out.println(Super.FIX_WITHOUT_FINAL);
		

		//尝试去调用final定义各种类常量,和对象常量!还有没有final定义的static的变量.!
		
		//尝试一下final去定义形参的效果
		s11.print("198964");
		s11.print("19896422");
		
		
		
	}

}
