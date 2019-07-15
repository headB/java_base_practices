package day09.comprehensive.practice02;


//打印需求
//某公司旗下有三种型号(model)
//机器人(Roboot) A 、B、 C，
//他们都具有姓名 name, 型 号 model 和走路功能 walk。
// 其中 A 实现了说话功能 speak ，
// B 实现了图像识别功能 see，
// C 同时实现了说话和识别功能。 
//  
//  请利用继承、接口、多态等知识完成类的设计并编写测试 Demo


public class Practice02Demo {

	public static void main(String[] args) {
		
		//实例化A类型的机器人
		ISpeakable a = new ARoboot("kumanxuan","007");
		a.speak();
		a.walk();
		
		
		
		
		
		System.out.println();
		
		
		ISeeable b = new CRoboot("A","007");
		b.see();
		b.walk();
		
		System.out.println();
//		
		CRoboot c = new CRoboot("C","009");
		c.speak();
		c.see();
		c.walk();
		
		System.out.println();
		
		ISpeakable a1 = new AllInRoboot("D","0100");
		a1.speak();
		a1.walk();
		
		
		
		
		
		
		
		
		
//		//实例化B类型的机器人
//		ISeeable a2 = new BRoboot("索尼02","008");
//		a2.see();
//		
//		System.out.println();
//		
//		//实例化B类型的机器人
//		CRoboot a3 = new CRoboot();
//		a3.setName("索尼02");
//		a3.setModel("008");
//		a3.walk();
//		a3.see();
//		a3.speak();
						
	
		
		
	}
	
}
