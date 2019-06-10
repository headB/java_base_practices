package day10.comprehensive01;

public class TestDemo {
	
	//测试Item类
	
//	2)编写一个 main 方法,添加一个商品,其商品信息如下 创建两个笔记本电脑的商品(computer),
//
//	商品 1:
//	编号(code):666
//	名称: 戴尔(DELL) 游戏笔记本 类型: 游戏
//	价格: 5499.00
	public static void main(String[] args) {
		Item computer1 = new Item("666","戴尔(DELL)");
		computer1.setPrice(5499.00);
		
//		商品 2:
//			编号(code):007
//			名称: 苹果(Macbook pro)笔记本 类型: 电脑,办公
//			价格: 18000.00
		
		Item computer2 = new Item("007","苹果(Macbook pro)笔记本");
		computer2.setPrice(18000.00);
		
		
		System.out.format("笔记本名称%s,他的价格是%s",computer1.getName(),computer1.getPrice());
		System.out.println();
		System.out.format("笔记本名称%s,他的价格是%s",computer2.getName(),computer2.getPrice());
		
		System.out.format("\n已经添加了%s个笔记本",Item.getTotalNum());
		
		
		
	}
	
	

}
