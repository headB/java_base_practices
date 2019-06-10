package day09.practice02;


//需求:我家有一种动物(Animal)，
//你猜它的叫声(shout)是怎么样的，
//猜不到，因为这个 动物有多种形态。

public class AnimalDemo {
	
	public static void main(String[] args) {
		
		Animal a = new Cat();
		a.shout();
		
		System.out.println();
		
		a = new Dog();
		a.shout();
		
	}

}
