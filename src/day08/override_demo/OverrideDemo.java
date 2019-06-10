package day08.override_demo;

//
//3.第三题OverrideDemo.java（重点）
//需求：演示方法覆盖
//n 父类鸟类（Bird），鸟类中含有飞翔（fly）行为
//n 鸟的子类鸵鸟类（Ostrich），子类中覆盖父类飞翔（fly）方法

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//实例化一个鸵鸟对象
		
		Ostrich o1 = new Ostrich();
		o1.fly();
		
	}

}
