package day10.practice01;

//需求:定义一个狗类 Dog，
//在狗类中定义静态字段和静态方法，
//定义对象字段和对象方法， 
//并在 StaticDemo 方法中测试调用狗类中的方法和字符

public class Dog {
	
	//定义静态字段
	public static String name = "英国威尔士犬-柯基";
	
	
	//定义静态方法
	public static String returnDogName() {
		return Dog.name;
	}
	
	

}
