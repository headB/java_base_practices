package day10.practice04;

public class Animal {
	
	//类的内部类
	
	void echo() {
		System.out.println("hello world!我是一个普通的动物类!");
	}
	
	
	//设置接收一个多态
	void getIUSB(IUSB usb) {
		System.out.println(usb);
	}
	
	
	//非static的内部类
	public class Human{
		
		public Human() {
			
		}
		
		void speak() {
			System.out.println("我是人类!");
		}
		
	}
	
	//static修饰的类
	static class HumanStatic{
		
		void speak() {
			System.out.println("我是人类,static修饰的版本!");
		}
		
	}
	

}
