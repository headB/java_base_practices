package day10.practice01;

public class StaticDemo {
	
	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		
		//调用对象的name
		System.out.println(dog.name);
		//这个地方注意了,就是,这里底层实际上还是   -->底层使用类名访问
		
		//尝试调用对象的方法,   -->底层使用类名访问
		System.out.println(dog.returnDogName());
		
		//调用类的name
		System.out.println(Dog.name);
		
		//调用类的getDogName
		System.out.println(Dog.returnDogName());
		
		
		
	}

}
