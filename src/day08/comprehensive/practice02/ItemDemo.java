package day08.comprehensive.practice02;

//2)编写一个main方法,添加一个商品,其商品信息如下
//创建两个笔记本电脑的商品(computer),
//
//商品1：
//编号(code):666
//名称: 戴尔(DELL) 游戏笔记本
//类型: 游戏
//价格: 5499.00
//
//
//商品2：
//编号(code):007
//名称: 苹果（Macbook pro）笔记本
//类型: 电脑,办公
//价格: 18000.00
//在main方法打印笔记本电脑(computer)的名称和价格

public class ItemDemo {
	
	public static void main(String[] args) {
		Item computer1 = new Item("666","戴尔(DELL) 游戏笔记本");
		computer1.setType("游戏");
		computer1.setPrice(2000);
		System.out.println(computer1);
		
		Item computer2 = new Item("007","苹果（Macbook pro）笔记本");
		computer2.setType("电脑,办公");
		computer2.setPrice(4000);
		System.out.println(computer2);
		
		
		
		
		
	}
	
	

}
