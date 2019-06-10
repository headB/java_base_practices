package day12.comprehensive01;

//利用接口的知识，写个计算器，能完成两个数的加减乘除运算 
//1)定义一个接口 Compute 含有一个方法 int computer(int n,int m);
//2)定义加(Add)、减(Subtract)、乘(Multiply)、除(Divide)四个类,
//    分别实现此接 口，并分别覆盖 computer 方法完成加减乘除运算
//3)设计一个类 UseCompute，
//    含有方法:public void useCom(Compute com, int num1,int num2)
//
//此方法要求能够:
//    1.用传递过来的对象调用 computer 方法完成运算 
//    2.输出运算的结果
//4)设计一个测试类，调用 UseCompute 中的方法 useCom 来完成加减乘除运算 

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//然后测试UseCompute
		
		UseCompute u1 = new UseCompute();
		
		int num1 = 10;
		int num2 = 5;
		
		u1.useCom(new Add(), num1, num2);
		u1.useCom(new Subtract(), num1, num2);
		u1.useCom(new Multiply(), num1, num2);
		u1.useCom(new Divide(), num1, num2);
		

	}

}
