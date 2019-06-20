package day16集合2.comprehensive01;

import java.util.ArrayList;
import java.util.List;

//1. 综合一:
//集合使用.
//1写一个点类 Point, 有 X,Y 坐标.
//2创建 5 个 Point 对象, 添加到 list 集合 ArrayList 中
//3删除索引为 2 的点对象
//4再把 list 合集中索引为 3 的点对象修改成坐标 X=3,Y=3 的点对象 
//5遍历 list 集合对象并打印输出该 list 对象

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(4,5);
		Point p2 = new Point(10,5);
		Point p3 = new Point(14,5);
		Point p4 = new Point(42,5);
		Point p5 = new Point(43,5);
		
		List<Point> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.get(3).setX(3);
		list.get(3).setY(3);
		System.out.println(list);
		
		for(Point pTemp:list) {
			System.out.println(pTemp);
		}

	}

}

class Point{
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
