package day14线程.comprehensive03;

//3、练习三
//定义一个程序猿类 Programmer，有一个私有的 int 类型的字段余额 netInCome，
//有 3 个方法：吃饭 eat、交房租 payRent、看电影 seeMovie。
//这 3 个方法都接收有一个 int 类型的参数 money 表示消费金额，
//用于对余额做减法运算。*
//要求：
//1)、实现 Programmer 类的定义；                                                
//2)、定义一个测试类 TestDemo，在 main 方法中创建 Programmer 的实例 p1，
//初始余额为 13000 元，每月吃饭开销为 1000 元，房租每月 1000 元，
//陪女友看电影 200*2 元。请打印 p1 的余额。

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p1 = new Programmer();
		p1.setNetInCome(13000);
		
		p1.eat(1000);
		p1.payRent(1000);
		p1.seeMovie(400);
		
		System.out.println(p1.getNetInCome());
		

	}

}
