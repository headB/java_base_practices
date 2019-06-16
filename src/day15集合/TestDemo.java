package day15集合;

//6. 作业六:
//需求:定义一个 Point 类，并为 Point 类定义泛型和使用泛型
//作业目的:掌握泛型类的定义和使用

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Point p1 = new Point();
		
		System.out.println(p1.getX());
		

	}

}

class Point<T>{
	
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}
	
	
}
