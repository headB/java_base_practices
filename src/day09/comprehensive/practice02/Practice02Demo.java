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
		ARoboot a1 = new ARoboot();
		a1.setName("索尼");
		a1.setModel("007");
		a1.walk();
		a1.speak();
		
		System.out.println();
		
		//实例化B类型的机器人
		BRoboot a2 = new BRoboot();
		a2.setName("索尼02");
		a2.setModel("008");
		a2.walk();
		a2.see();
		
		System.out.println();
		
		//实例化B类型的机器人
		CRoboot a3 = new CRoboot();
		a3.setName("索尼02");
		a3.setModel("008");
		a3.walk();
		a3.see();
		a3.speak();
						
				
		
		
		
	}
	
}
