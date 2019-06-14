package day08.comprehensive.practice01;

//要求:
//1、分析上面信息，代码化(用到知识点:
//1、this 
//2、super 
//3、javabean 
//4、继承)。 
//
//2、写测试类 Test 测试
//3、添加一定的剧情(随意发挥)。

public class Practice01Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//哈哈,我自己傻逼啦!.就是,不小心,这边的接收的类型写成了Monkey类的啦!!!哈哈哈.!
		
		Monkey p1 = new Monkey();
		p1.setName("张卫健");
		p1.setWeapon("定海神针!");
		p1.setFormula("江华给我设定的紧箍咒");
		p1.extDevil();
		System.out.println(p1);
		System.out.println();
		
		Monkey p2 = new Monkey();
		p2.setName("陈浩民");
		p1.setWeapon("定海神针!");
		p2.extDevil();
		System.out.println(p2);
		
		
		//这里利用构造器就完成成员变量的初始化.
		Monkey m1 = new Monkey("六小龄童",70,"金刚棒","紧箍咒");
		System.out.println(m1);
		
		
		
	}
	
	

}
