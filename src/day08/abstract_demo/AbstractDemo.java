package day08.abstract_demo;


//4.第四题AbstractDemo.java（重点）
//需求：分别求出圆形和矩形的面积
//n 矩形（Rectangle）：求出矩形的面积
//n 圆形（Circle）：求出圆形的面积
//n 图形（AbstractGraph）：表示求形状面积的抽象类，
//    里面包含求面积的抽象方法，其他子类必须覆盖此方法
// 
//要求：先写没有继承抽象类的情况，再根据类抽取出抽象类，并且必须测试
//
// 
//作业目的：引出抽象类和抽象方法


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//然后调用圆,计算面积
		Circle c1 = new Circle();
		c1.setR(4);
		System.out.println(c1.getArea());
		
		//然后就是调用矩形
		Rectangle r1 = new Rectangle();
		r1.setHeight(4);
		r1.setWidth(5);
		System.out.println(r1.getArea());
		
//		5.第五题AbstractDemo2.java
//		需求：演示抽象类特点
		
		//尝试调用一下他们的非抽象方法.
		r1.test();
	}

}
