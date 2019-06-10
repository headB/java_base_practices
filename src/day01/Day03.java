package day01;

public class Day03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//OK!第二天看得差不多了,准备把第三天的作业做一下!.
		
		
		
		{
		
//			1.第一题 IfDemo1.java
//			需求:演示 if 语句的使用 步骤:
//			(1)定义一个整数类型的变量 a
//			(2)判断 a 大于 5,大于打印“a 大于 5” (3)判断 a 大于 20,大于打印“a 大于 20”
			
			int a = 30;
			
			if (a > 5) {
				System.out.println("大于5");
			}
			
			if (a > 20) {
				System.out.println("大于20");
			}
		
		}
		
		{
			
//			2. 第二题 IfElseDemo.java
//			需求:演示 if-else 语句的使用 步骤:
//			(1)定义一个整数类型的变量 a
//			(2)判断 a 是奇数还是偶数，如果是偶数打印“a 是偶数”，否则打印“a 是奇数”
			
			int a =41;
			
			if (a%2==0) {
				System.out.println("a是偶数");
			}else {
				System.out.println("a是奇数");
			}
			
		}
		
		
		{
//			3.第三题 IfElseIfElseDemo.java
//			需求:演示 if-else if-else 语句的使用 步骤:
//			(1)定义整数类型的两个数 a 和 b (2)判断 a 和 b 的大小关系
			
			int a = 10;
			int b = 20;

			if(a > b)
			{
				System.out.println("a 大于 b");
			}
			else if(a < b)
			{
				System.out.println("a 小于 b");
			}
			else
			{
				System.out.println("a 等于 b");
			}
			
			
		}
		
		{
//			4.第四题 IfElseIfElseDemo2.java
//			需求:根据输入的一个数字，判断是星期几?
//			步骤:
//			(1)定义一个整数类型的变量 weekday
//			(2)判断变量 weekday，如果 weekday 为 1 输出“周一”，如此类推
			
//			int weekday = 1;
			int weekday = 6;
			
			if(weekday == 1)
			{
				System.out.println("周一");
			}
			else if(weekday == 2)
			{
				System.out.println("周二");
			}
			else if(weekday == 3)
			{
				System.out.println("周三");
			}
			else if(weekday == 4)
			{
				System.out.println("周四");
			}
			else if(weekday == 5)
			{
				System.out.println("周五");
			}
			else if(weekday == 6)
			{
				System.out.println("周六");
			}
			else if(weekday == 7)
			{
				System.out.println("周日");
			}
			else
			{
				System.out.println("请输入数字1~7之内的数字");

			}
			
		}
		
		{
			
//			5.第五题 IfElseIfElseDemo3.java
//			需求:根据QQ在线的天数来判断 QQ 的等级 步骤:
//			(1)定义一个变量 days，表示天数 (2)判断天数范围
//			
			int day = 22;
			if(day >=0 && day < 5)
			{
				System.out.println("没有登记");
			}
			else if(day >= 5 && day < 12)
			{
				System.out.println("☆");
			}
			else if(day >= 12 && day < 21)
			{
				System.out.println("☆☆");
			}
			else if(day >= 21 && day < 32)
			{
				System.out.println("☆☆☆");
			}
			else
			{
				System.out.println("终于有月亮了");
			}
			
			
		}
		
		{
			
//			6.第六题 SwitchDemo.java
//			需求:使用 switch 来完成,根据输入的一个数字，判断是星期几? 步骤:
//			(1)定义一个整数类型的变量 weekday
//			(2)判断变量 weekday，如果 weekday 为 1 输出“周一”，如此类推
			
		int weekday = 2;
		
		switch(weekday) {
		
		case 1:
			System.out.println("周1");break;
		case 2:
			System.out.println("周2");break;
		case 3:
			System.out.println("周3");break;
		case 4:
			System.out.println("周4");break;
		case 5:
			System.out.println("周5");break;
		case 6:
			System.out.println("周6");break;
		case 7:
			System.out.println("周日");break;
		default:
			System.out.println("出错啦!");
		
		}
			
			
		}
		
		{
			
//			7.第七题 WhileDemo.java
//			需求:使用 while 循环，打印 10 次帅哥 步骤:
//			(1)定义一个变量 count，表示计数器 (2)使用 while 循环，
//			判断 count 是否小于 10 (3)打印“帅哥”和循环次数 (4)计数器+1
			
			int count = 0;
			while(count<10) {
				System.out.println("I am handsome!");
				count++;
			}
			
			
		}
		
		{
			
			
//			8.第八题 WhileDemo2.java
//			需求:打印从 1 到 100 的数 步骤:
//			(1)定义一个变量 number (2)循环打印 number
			
			
			int number = 1;
			
			while(number <= 100) {
				System.out.println(number);
				number++;
			}
			
			
		}
		
		
		{
			
//			9.第九题 WhileDemo3.java
//			需求:计算 100 以内的正整数和 步骤:
//			(1)定义一个变量 number，表示加数
//			(2)定义一个变量 sum，表示前 N 个数之和
//			(3)使用 while 循环，每循环一次 sum 和当前的 number 相加一次 (4)number 自增 1
			
			int number = 0;
			int sum = 0;
			
			while(number<=100) {
				
				sum += number;
				
				number++;
				
			}
			
			System.out.println(sum);
			
			
		}
		
		{
			
//			10.第十题 DoWhileDemo1.java(作业不作要求)
//			需求:演示 while 和 do-while 的区别 步骤:
//			(1)定义两个整数变量 a 和 b (2)分别使用 while 和 dowhile 判断 a > b
//			注意:出来结果 while 没有打印任何内容，do-while 打印了一次“a > b”，才算作业完成。
			
			int a = 1;
			int b = 2;
			
			while(a>b) {
				System.out.println("这是测试while");
			}
			
			do {
				System.out.println("这里是测试dowhile");
			}
			while(a > b);
			
			int i = 0;
			
			
			//先执行,后判断,所以条件什么的,自己稍微注意一下就可以了
			do {
				i++;
				System.out.println("这里是测试dowhile+-->"+i);
//				i++;
			}
			//比如这里限制只有4次,但是实际上是执行了5次了.
			//所以控制好条件
			while(i<5);
			
		}
		
		
		{
			
//			11.第十一题 DoWhileDemo2.java(作业不作要求)
//			需求:演示 do-while 语句的使用 步骤:
//			(1)使用 do-while 循环打印 500 次“帅哥” (2)使用 do-while 循环求出 100 以内的正整数之和
			
			
			//这个地方自己想好一点,就是,思考一下关于计量器的统计
			
			//其实很简单,就是,相当于,你设置的初始条件,+1而已,可以回想一下如果只是简单的while是如何去做的.
			int count = 0;
			do {
				
				count++;   //进来就进行自增1   1
//				System.out.println("帅哥!+"+count);
				
				
			}
			while(count < 500);
			System.out.println("帅哥!+"+count);
			
			//dowhile情况
           //已经执行了
			//  1次   i=0;  然后增加i   i=1;    然后判断是i=1;
			//  2     i=1              i=2             i=2;
			//        i=100            i=101            i=101
			// 500    i=499            i=500            i=500;  (不执行)
			
			
			//while的情况
			//  	   当前的i值	执行了次数  自增后的i值
			//   判断  i=0       1次       i=1; 
		    //   判断  i=1       2次       i=2; 
			//	 判断  i=499		500次	  i=500;
			//   判断  i=500     不执行
			
			
			//这里就是,保证count1自增到
			//保证打印count1 500次
			int count1 = 0;
			while(count1<500) {
				
				
				
//				System.out.println("我这是count1的统计次数:->"+count1);
				count1++;
				
				
			}
			 System.out.println("我这是count1的统计次数:->"+count1);
			 
			 
			 int count2 = 1;
			 int sum1 = 0;
			 do {
				 
				 sum1+=count2;    //需要保证count2     sum1 += 100;
				 count2++;    //101
				 
			 }
			 while(count2<=100);    //      <=100;
			 System.out.println(sum1);
			 
			 //这个是文锦的书写
			 
			
			
		}
		
		{
			
//			12.第十二题 ForDemo.java
//			需求:演示 for 语句的使用 步骤:
//			(1)使用 for 循环打印 1 到 10
//			(2)使用 for 循环计算 100 以内正整数之和
			
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
			
			int sum = 0;
			
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			
			System.out.println("使用for最后累加得到的数值是-->"+sum);
		}
		
		{
			
//			13.第十三题 LoopInLoopDemo.java
//			需求:输出直角三角形
//			思路:
//			(1)傻 B 方式，逐行打印 (2)普通方式，使用循环打印每一行 (3)通过普通方式找到规律，写出最终通用版本
//			作业要求:把得到最终版本的过程写出来
			
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			
			System.out.println();
			
			for(int i=1;i<8;i++) {
				
				for(int i1=1;i1<=i;i1++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			//还是以文锦的版本为准
		
			
		}
		
		{
			
//			14.第十四题 Table99Demo.java
//			需求:打印九九乘法表
//			思路:
//			(1)傻 B 方式，逐行打印 (2)普通方式，使用循环打印每一行 (3)通过普通方式找到规律，写出最终通用版本
//			作业要求:把得到最终版本的过程写出来
			
			
			for(int i=1;i<=9;i++) {
				
				for(int i1=1;i1<=i;i1++) {
					
					if (i1==2) {
						
//						continue;
						//return;
//						break;
						
					}
					
					System.out.print(i1+"*"+i+"="+i*i1+" ");
					
					
					
				}
				System.out.println();
			}
			
			
		}
		
		
		{
			
//			15.第十五题 BreakDemo.java
//			需求:从 1 输出到 10，当迭代变量为 7，就停止循环 步骤:
//			(1)循环打印 1 到 10
//			(2)判断循环次数是否为 7，是就停止循环，否则打印循环次数
			
			for(int i=1;i<=10;i++) {
				
				if(i==7) {
					break;
//					return;
				}
				System.out.println(i);
				
			}
			
			
		}
		
		{
			
//			16.第十六题 ReturnDemo.java
//			需求:从 1 输出到 10，当迭代变量为 7，就终止程序 步骤:
//			(1)循环打印 1 到 10
//			(2)判断循环次数是否为 7，是就终止程序，否则打印循环次数
			
			for(int num = 1; num <= 10; num++)
			{
				if(num == 7)
				{
//					return;
				}
				System.out.println(num);
			}
			System.out.println("ending.....");
			
			
			
		}
		
		{
			
//			17.第十七题 ContinueDemo.java
//			需求:从 1 输出到 10，不要输出 4 步骤:
//			(1)循环遍历 1 到 10 的数
//			(2)判断如果 i 为 4，跳过当前循环，否则打印 i
			
			System.out.println("测试continue---->");
			for(int i =1;i<=10;i++) {
				
				if(i==4) {
					continue;
				}
				
				System.out.println(i);
				
			}
			
			
		}
		
		
		{
			
//	18.第十八题 BreakDemo2.java
//	需求:统计出 1~100 之间,前 5 个能整除 3 的数.-->3,6,9,12,15 步骤:
//	(1)定义一个变量 count，表示能被 3 整数的个数
//	(2)遍历 1 到 100
//	(3)判断 i 是否你被 3 整除，能被 3 整除 count 自增 1，并打印 i (4)判断 count 够不够 5 个，够 5 个，终止循环
			
			
			int count = 0;
			
			for(int i=1;i<=100;i++) {
				
				if(count>4) {
					break;
				}
				
				if ( i%3==0) {
					
					System.out.println("能被5整除的数有:"+i);
					
					count++;
					
				}
				
				
			}
			
			
		}
		
		{
			
//			二、综合练习:
//				1. 练习一 MonthChooseDemo.java
//				需求:定义一个 int 类型 变量存放当前月份(month)，
//				使用 switch 进行判断，例如 3 月 到 5 月是打印春季，6 月到 8 月打印夏季，
//				依次类推打印秋季和冬季，但月份不是 1 月 到 12 月，打印月份非法。
			
			int month=8;
			
			switch(month) {
			
			case 3:
			
			case 4:
				
			case 5:
				
				System.out.println("春季");break;
				
			case 6:
				
			case 7:
				
			case 8:
				
				System.out.println("夏季");break;
				
			case 9:
				
			case 10:
				
			case 11:
				
				System.out.println("秋季");break;
				
			case 12:
				
			case 1:
				
			case 2:
				
				System.out.println("秋季");break;
				
			default:
				System.out.println("非法月份");
			
			}
			
			
		}
		
		{
//			2. 练习二 EvenDemo.java
//			需求:找出 [1, 500] 之间偶数的个数。 步骤:
//			(1)遍历1到500的数 (2)判断是否是偶数，能被 2 整除的就是 0 数 (3)打印为偶数的值
			
			int count = 0;
			 for(int i=1;i<=500;i++) {
				 
				 if (i%2==0) {
					 count++;
//					 System.out.println(i);
				 }
				 
			 }
			 System.out.println("偶数的个数是:"+count);
			
		}
		
		{
//		3. 练习三 SevenDemo.java
//		需求:求 [1, 500] 之间能整除 7 的数的总和。 思路:
//		(1)定义一个变量 count，表示能被 7 整除的数的个数 (2)判断当前的数能被 7 整除，变量 count 就+1
			
			int sum = 0;
			int count = 0;
			for(int i=1;i<=500;i++) {
				
				if(i%7==0) {
					sum += i;
					count++;
				}
			}
			System.out.println("能被7整除的数的总个数是:"+count);
			System.out.println("能被7整除的数的总和:"+sum);
			
			
		}
		
		
		{
//			三、拓展练习
//			1.拓展一 NarcissisticNumberDemo.java 需求:打印所有的水仙花数，
//			所谓水仙花数是指一个三位数[100, 999]，其各位数字的立方
//			之和等于该数本身。 (114 == 1^3 + 1^3 + 4^3(66)这个不是水仙花数)
			
			//求出这三位数的个十百对应的数字
			
			int ge;
			int shi;
			int bai;
			
			for(int i=100;i<=999;i++) {
			
				ge = i / 100;
				shi = i / 10 % 10;
				bai = i % 100 % 10;
				
				
//				System.out.println(""+ge+shi+bai);
				
				if ( ge*ge*ge+shi*shi*shi+bai*bai*bai == i) {
					System.out.println("我是水仙花!-->"+i);
				}
				
			}
			
			
		}
		
		
		
		{
//			2.拓展二 SquareNumberDemo.java
//			需求:打印 [1, 100] 正方形数，比如 1，4，9，...。
			
			int temp;
			for(int i =1;i<=100;i++) {
				
				
				temp = i*i;
//				if (temp >100) {
//					break;
//				}
//				System.out.println(i*i);
				
				if(temp<=100) {
					System.out.println(temp);
				}
				
				
			}
			
			
		}
		
		
		{
			
//			3.拓展三 RegularTriangleDemo.java
//			需求:打印正三角形
//			思路:
//			
//			int space;
//			for(int i=4;i>0;i--) {
//				
//				space = (2*i-2) / 2;
//				
//				//打印空格
//				for(int i1=0;i1<=space;i1++) {
//					
//					System.out.print(" ");
//					
//				}
//				for(int i2=1;i-i2>=0;i2++) {
//					System.out.print("*");
//				}
//				
//				System.out.println();
//				
//			}
			
			
			//先打印空格,然后就是对应的数
//			int line = 4;
			
			//设置总的边数
			int lines= 6;
			
			for(int current_line=1;current_line<=lines;current_line++) {
				
				for(int space=lines-current_line;space>0;space--) {
					
					System.out.print(" ");
				}
				for(int i1 = 2*current_line-1;i1>0;i1--) {
					System.out.print("*");
				}
				
				System.out.println();
				
			}
			
//			//文锦的答案
//			int num = 5;
//			for(int line = 1; line <= num; line++)
//			{
//				int blank = 1;
//				int star = 1;
//				while(blank <= num-line)
//				{
//					System.out.print(" ");
//					blank++;
//				}
//				while(star <= 2*line-1)
//				{
//					System.out.print("*");
//					star++;
//				}
//				System.out.println();
//			}
			
			
			
		}
		
		
		{
			
			//4. 拓展四 FiveTimesDemo.java 需求:打印出 [1, 500] 之间是 5 的倍数的之和。
			int sum = 0;
			for(int i=1;i<=500;i++) {
				
				if(i%5==0) {
					sum+=i;
				}

				
			}
			System.out.println("是5的倍数的总和是:"+sum);
			
		}
		
		{
			
//			5.拓展五 ProfitDemo.java
//			需求:企业发放的奖金根据利润提成。
//			利润(profit)低于或等于 10 万元时，奖金(bonus)可提 10%;
			
			//利润高于 10 万元，低于 20 万元时，低于 10 万元的部分按 10%提成，高于 10 万元的 部分，
//			可提成 7.5%;
			
			//20 万到 40 万之间时，高于 20 万元的部分，
//			可提成 5%;40 万以上时 
			
			
			//高于 40 万元的部分，可提成 3%;求应发放奖金总数?
			
			double x=73;
			double profit=0;
			
			if(x<=10) {
				profit = x*0.1;
			}
			else if (10<x && x<=20) {
				profit = 1+ (x-10)*0.075;
			}
			else if (x>40) {
				
				profit = 1 + 0.75 + 1 + (x-40) * 0.03 ;
				
			}
			
			System.out.println("你想分多少钱就多少钱:"+profit);
			
			//文锦的答案
			
			//定义int类型变量
			int pro = 73;
			double bonus = 0; 
			if(pro <= 10)
			{
				bonus = pro * 0.1;
				System.out.println(bonus);
			}
			else if(pro > 10 && pro <= 20)
			{
				bonus = (10 * 0.1) + ((pro - 10) * 0.075);
				System.out.println(bonus);
			}
			else if(pro > 20 && pro <= 40)
			{
				bonus = (10 * 0.1) + ((20 - 10) * 0.075) + ((pro - 20) * 0.05);
				System.out.println(bonus);
			}
			else if(pro > 40)
			{
				bonus = (10 * 0.1) + ((20 - 10) * 0.075) + ((40 - 20) * 0.05) + ((pro - 40) * 0.03);
				System.out.println(bonus);
			}
			else
			{
				System.out.println("请输入数值");
			}
			
		}
	
		{
			//尝试再练熟一点关于99乘法表的步骤先.
			
//			int x=2;
//			for(int i=1;i<=x;i++) {
//				
//				System.out.print(i+"*"+x+"="+i*x+" ");
//				
//			}
//			System.out.println();
//			
//			int x1=3;
//			for(int i=1;i<=3;i++) {
//				
//				System.out.print(i+"*"+x1+"="+i*x1+" ");
//				
//			}

			
		}
		
		{
			for(int x=1;x<=9;x++) {
				
				for(int y=1;y<=x;y++) {
					
					System.out.print(y+"*"+x+"="+x*y+" ");
					
				}
				
				System.out.println();
				
			}
			
		}
		
		{
			System.out.println("\n\n");
			//再来看一下99乘法表的讲解.
			
			for(int lines=1;lines<=9;lines++) 
			{
				for(int i=1;i<=lines;i++) {
				System.out.print(  i+"*"+lines+"="+i*lines+" ");
			}
				System.out.println();
			
			}

		}
		{
			//最后做来尝试一下搞等边三角形
			//首先尝试一下自己的方法,先观察横向的.!
			
			//横向的是   空格和  * 组成.   *是2n-1个,然后 空格 是n-1
			
			//普通去打印  3个*,应该是如何打印呢?
			
			int lines = 3;
			
			for(int line=1;line<=lines;line++) {
				
				
				for(int i1=0;i1<lines -line;i1++) {
					
					System.out.print(" ");
				}
				
				for(int i=0;i<2*line-1;i++) {
				
					System.out.print("*");
					
				}
				
				System.out.println();
				
				
			}
			
			
			
		}
		
		
		
		

	}
	

}
