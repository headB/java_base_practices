package day08.abstract_demo;

public class Circle extends AbstractGraph {
	
	private double r;
	
	public void setR(double r) {
		this.r = r;
	}
	
	public double getR(double r) {
		return this.r;
	}

	public double getArea() {
		
		
		//所以需要设置传递一个r,半径进来,用于计算面积
		
		//圆的面积就是   πr2
		
		return 3.14 * r * r;
	}
	
}
