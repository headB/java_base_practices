package day01;

public class Day02_01 {

	public static void main(String[] args) {
		
		
		/*
		 * 需求：使用不同的数据类型定义变量 步骤： （
		 * 1）定义八大基本数据的变量，并打印 
		 * （2）定义引用数据类型String的变量，并打印
		 * 
		 * 
		 * 5.TypeConvertDemo2 求：演示强制类型转换 步骤： 
		 * （1）定义一个int类型变量a 
		 * （2）定义一个byte类型变量b
		 * （3）定义一个变量接收a加b的和 
		 * （4）把double类型的常量转换为int类型
		 * 
		 */
		
		
		int ii1 = 1;
		
		System.out.println("123123123123123");
//		while(ii1 <5) {
//			
//			ii1++;
//			System.out.println("123123123123123");
//			
//		}
		
//		for(int i=1;i<=5;i++) {
//			
//			System.out.println("sixsixsix");
//			ii1++;
//			
//		}
		
		do {
			ii1++;
		}
		while(ii1<=6);
		
		
		
		System.out.println(ii1);
		
		
		System.out.println("this is me!!!!!"+ii1);
		
		
		
		{
			
			int a = 1;
			byte b = 2;
			int c = a + b;
			int d = (int)3.14;
			System.out.println(d);
			
			
			
		}
		
		{
			
//			6.第六题ArithmeticOperatorsDemo1
//			需求：演示算术运算符
//			步骤：
//			（1）定义两个变量，分别求出和差积商 （+ - * /）
//			（2）取模,求余数（%）
//			（3）演示“+”号表示连接符号的例子
//			（4）演示8765 / 1000 * 1000，说明结果为什么是8000
//			（5）演示10 / 0，并说明报错原因
//			（6）演示前置++
//			（7）演示后置++
			
			
			int a1 = 2;
			
			System.out.println("后置"+(a1++));
			System.out.println("后置"+a1);
			
			int a2 = 3;
			System.out.println("前置"+(++a2));
			System.out.println("前置"+a2);
			
			
		}
		
		{
//			7.第七题AssigningOperatorDemo.java
//			需求：演示赋值运算符
//			步骤：
//			（1）定义一个int类型变量age
//			（2）演示“+=”符号，让age自身加10
//			（3）定义一个short类型变量s
//			（4）演示“+=”符号，让s自身加2，并说明“+=”符号的效果
			
			int age = 10;
			age += 10;
			System.out.println("age is :"+age);
			short s = 10;
			s += 10;
			System.out.println("this is s :"+s);
			
			
			
		}
		
		{
			
			
//			8.第八题ComparisonOperatorDemo.java
//			需求：演示比较运算符
//			步骤：
//			（1）使用>、<、>=、<=、!=、==等比较运算符操作两个整数类型的常量
//			（2）定义两个int类型的变量a和b
//			（3）使用比较运算符操作两个变量，并定义一个变量接收其运行果
			
			
			
			System.out.println(10 > 5);
			System.out.println(10 >= 5);
			System.out.println(10 >= 10);
			System.out.println(10 < 5);
			System.out.println(10 <= 5);
			System.out.println(10 <= 10);
			System.out.println(10 == 10);
			System.out.println(10 != 10);
			
			
			int a = 10;
			int b = 5;
			boolean result = a > b;
			
			
			
		}
		
		{
//			9.第九题TernaryOperatorDemo.java（重点）
//			需求：演示三元运算符
//			步骤：
//			（1）判断一个数99是不是偶数，并打印结果
//			（2）求出99和20之间的最大的一个值，并打印结果
//			（3）一共有55条数据,每页显示10条数据,请问一共分多少页
			
			System.out.println(99 % 2 ==0?"是偶数":"不是偶数" );
			
			int a = 99;
			int b = 20;
			//打印最大值
			System.out.println("打印最大值");
			System.out.println(a>b?a:b);
			
			//分页
			
			//打印总分页
			
			int total = 55;
			int pager = 10;
			System.out.println("打印总分页:");
			System.out.println(total % pager ==0 ? total / pager: total / pager +1  );
			
			
		}
		
		
		{
			
			
//			10第十题LogicalOperatorDemo.java
//			需求：演示逻辑运算符
//			步骤：
//			（1）与操作
//			（2）或操作
//			（3）取反操作
//			（4）证明&和&&的区别
//			（5）证明|和||的区别
			
			System.out.println("====逻辑运算测试======");
			System.out.println((3>1)&(4>2));
			System.out.println(4&10);
			
//			System.out.println(true&&1/0==0);会报错
			
			System.out.println(false&&1/0==0);
//			System.out.println(false||1/0==0);  报错
			System.out.println(true||1/0==0);
			
			System.out.println((3>1)|false);
			
			System.out.println(false^false);
			System.out.println(false^!false);
			
			
			//下面是文锦的操作
			
			System.out.println("-----新测试 常量数字和 | 的操作");
			System.out.println(4|5);
//			System.out.println(4||5);报错!因为两边只能连接boolean结果的表达式
			
			System.out.println(true & false);
			System.out.println(true | false);
			System.out.println(false && 1/0==1);  //false
			System.out.println(true || 1/0==1);   //true
			System.out.println("hello" + 7 + 8);  //hello78
			
	
			
			System.out.println("====逻辑运算测试======");
			
			
		}
		
		
		{
//			1.练习一VariableDemo.java
//			需求：请根据现实定义以下变量，姓名，年龄，身高，体重，存款
//			步骤：
//			（1）写出变量的定义和赋值的语法
//			（2）定义变量
			
			System.out.println("练习一VariableDemo.java");
			
			String name = "FWJ";
			int age = 18;
			int height = 180;
			float weight = 60.8F;
			double deposit = 100.5;
			
			System.out.println("练习一VariableDemo.java");
			
			
		}
		
		{
//			2.练习二ScoreDemo.java
//			需求：请定义一个整数类型的变量sc，代表小明的分数,请写一段程序判断并打印小明成绩是否合格。
//			步骤：
//			（1）用三元运算符判断，如果0<sc<60,返回“不合格”
//			（2）如果sc>=60,返回“合格”
//			（3）打印运算后结果
			
			System.out.println("2.练习二ScoreDemo.java");
			
			
			int sc = 70;
			String result = sc>=60  ? "合格" : "不合格";
			System.out.println(result);
			
			
			int score = 59;
			
			//判断是否超过60就输出
			
			System.out.println(score >= 60?"合格":"不合格");
			
			
			System.out.println("2.练习二ScoreDemo.java");
			
			
		
		}
		
		{
			
			
			System.out.println("==========计算年利率===========");
//			1.拓展一InterestDemo.java
//			需求：计算 12 个月贷款利息之和（totalInterest）。假如学费(tuition) 16000.00，每月利率（rate）1%，不用利滚利。
//			思路：
//			（1）1个月是：一个月的利率 = 学费*利率
//			（2）12个月是：12*一个月的利率
			
			double tuition = 16000.00;
			
			double rate = tuition * 0.01 * 12;
			
			System.out.println(rate);
			
			double tuition1 = 16000.00;
			double result = 12 * tuition1 * 0.01;
			System.out.println(result);
			
			
			
			System.out.println("==========计算年利率===========");
			
		}
		
		
		
		{
			
//			2.拓展二DigitDemo.java
//			需求：定义一个 int 变量存放一个三位数的正数，分别求出百位数上的值、十位数上的值和个位数上的值。
//			思路：
//			（1）百位：利用int类型整除不会四舍五入
//			（2）十位：利用取余（%）和除法（/）
//			（3）个位：利用取余（%）
			
			
			System.out.println("===分别求一个三位数的对应个十百======DigitDemo");
			int a = 789;
			
			int a1 = a / 100;           
			int a2 = a / 10 % 10;       
			int a3 = a % (a1*100+a2*10);
			
			int b1 = a / 100;           
			int b2 = a % 100 / 10;       
			int b3 = a % 10;
			
			
			
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			
			
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3);
			
			System.out.println("=========DigitDemo");
		}
		
		{
			
			
//			3.拓展三PageDemo.java
//			需求：
//			（1）一共有55条数据,每页显示10条数据,当前页为2，请求出上一页
//			（2）一共有55条数据,每页显示10条数据,当前页为2，请求出下一页
			
			int data = 55;
			int page = 10;
			int currentpage = -10;
			
			//总页数
//			int amount = data % page == 0 ? data / page : data / page + 1;
//			//下一页
//			String uppage =  currentpage <= 0 || currentpage  >= amount ? "大哥,我是有底线的" : "下一页: " +(currentpage + 1);
//			//上一页
//			String downpage = currentpage <= amount && currentpage > 1  ? "上一页: " + (currentpage - 1) : "大哥,我是有底线的";
//			//System.out.println(amount);
//			System.out.println(uppage);
//			System.out.println(downpage);
			
			
			//首先求出所有的页数先
			int total_page = data % page ==0 ? data / page : data / page +1;
			
			//然后手动设置一个当前页,或者输入一个当前页,然后程序就可以自动求
			//上一页和下一页.
			
			//尝试求出下一页
			//先判断当前页是否小于  0 或者  大于总页数
			String nextPage =   (currentpage > 0 && currentpage < total_page)?"下一页是:"+(currentpage + 1):"没有查不到超过范围了";
			
			//尝试求出上一页
			String prevPage = (currentpage > 0 && currentpage <= total_page)?"上一页是:"+ (currentpage -1):"没有查不到超过范围了";
			
			System.out.println(nextPage);
			System.out.println(prevPage);
		}
		
		{
			
			String b1 = 3 > 4 ? "resultA":"resultB";
			
		}
		
		
		
		
	}
	
}
