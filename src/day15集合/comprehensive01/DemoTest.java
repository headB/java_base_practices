package day15集合.comprehensive01;
//1. 综合一:
//集合使用.
//1写一个点类 Point, 有 X,Y 坐标.
//2创建 5 个 Point 对象, 添加到 list 集合 ArrayList 中
//3删除索引为 2 的点对象
//4再把 list 合集中索引为 3 的点对象修改成坐标 X=3,Y=3 的点对象 
//5遍历 list 集合对象并打印输出该 list 对象 (明天做)

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point<String> p1 = new Point<>();
		Point<Integer> p2 = new Point<>();
		Point<Double> p3 = new Point<>();
		Point<Character> p4 = new Point<>();
		Point<Long> p5 = new Point<>();
		
		List<Point> list = new ArrayList<Point>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		list.remove(2);
		
		p2.setX(3);
		p2.setY(3);
		
		System.out.println(list);
		
		for(Point<?> px:list) {
			
			System.out.println(px);
			
		}
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Point point = (Point) iterator.next();
			System.out.println(point);
		}
		
		
		

	}

}

class Point<T>{
	
	private T x;
	private T y;
	
	void setX(T x) {
		this.x = x;
	}
	
	T getX() {
		return this.x;
	}
	
	void setY(T y) {
		this.y = y;
	}
	
	T getY() {
		return this.y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}