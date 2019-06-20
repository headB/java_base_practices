package day15集合.practice06;

import java.lang.reflect.Field;

//6. 作业六:
//需求:定义一个 Point 类，并为 Point 类定义泛型和使用泛型
//作业目的:掌握泛型类的定义和使用

public class TestDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		
		//泛型我记起来了,就是,如果啊,你默认啊,什么都不写的话,就是会输出object类型的啦!
		
		Point<String> p1 = new Point<String>();
		p1.setX("kumanxuan");
		
		String name1 = p1.getX();
		
		System.out.println(name1);
		
		Point<Integer> p2 = new Point<>();
		p2.setX(5566);
		System.out.println(p2.getX());
		
		Point p3 = new Point();
		System.out.println(p3.getX());
		p3.setX('a');
		
		System.out.println("获取这个数据的数据类型!");
		System.out.println(p3.getX().getClass().getName());
		
		
//		Class c1= p1.getClass();
//		
//		Field f1 = c1.getDeclaredField("x");
//		System.out.println(f1.getName());
//		System.out.println(f1.getType().toString());

	}

}

class Point<T>{
	
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}
	
	public void setX(T x){
		
		this.x = x;
	}
	
	
	
}





class Test1{
	
	String name = "kumanxuan!";
	
}
