package day09.practice03;

//
//需求:定义一个鱼类(Fish)实现会游泳(ISwimable)的接口，创建鱼的多态对象调用游泳
//方法
//作业目的:
//
// 掌握实现关系多态对象的创建 
// 多态对象调用方法的执行流程

public class FishDemo {

	//类似的,和上面的多态的父类接收那个一样的.!
	//编译类型和运行不一样,然后多态的情况就产生了.!
	
	//然后这种好像,更加好去理解  多态啊~...因为,接口肯定是没有具体的实现方法的.
	//但是这个地方呢,变量的数据类型是接口,
	//这个地方,接口类其实就是在检查这个实现类有没有实现具体某一个方法.
	//但是呢,如果这个具体的实现类,有其他多出来的方法的话,不进行强转的话,就不能调用了.!
	
	//那还有一种多态的实现好像没有实现出来了.!
	
	public static void main(String[] args) {
		
		ISwimable f1 = new Fish();
		f1.swim();
		
		int[] array1 = {1,2,3,4};
//		array1[0] = null;
		System.out.println(array1);
		String[] array2 = new String[5];
		System.out.println(array2);
		System.out.println(array2[1]);
		int[] array3 = null;
		System.out.println(array3);
		
		array3 = new int[2];
		array3[1] = 1;
		System.out.println(array3[1]);
		
	}
	
	
	
	
	
	
}
