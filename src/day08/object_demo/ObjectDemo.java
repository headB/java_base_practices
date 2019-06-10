package day08.object_demo;

public class ObjectDemo {
//	. 第六题ObjectDemo.java
//	需求：演示Object类中的toString和equals方法
//	n 创建一个Person类，通过覆盖toString方法，打印Person对象的内容
//	n 使用==和equals比较两个Person对象，通过结果得到==和equals的区别
//
//	 
//	作业目的：
//	掌握Object类中的toString方法和equals方法
//	掌握==和equals的区别
	
	
	public static void main(String[] args) {
		
		//创建Person对象.,然后尝试打印.
		
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person();
		
		System.out.println("用==比较两个Person对象的结果是:-->"+(p1==p2));
		System.out.println("用equals比较两个Person对象的结果是:-->"+(p1.equals(p2)));
		
		//继续创建多个Person的对象,并且给定年龄
		Person p3 = new Person();
		p3.setAge(18);
		
		Person p4 = new Person();
		p4.setAge(18);
		
		System.out.println();
		System.out.println("用==比较两个Person对象的结果是:-->"+(p3==p4));
		System.out.println("用equals比较两个Person对象的结果是:-->"+(p3.equals(p4)));
		
		
	}
	

}
