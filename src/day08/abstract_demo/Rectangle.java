package day08.abstract_demo;

public class Rectangle extends AbstractGraph {
	//矩形的面积就是长 * 宽 
	
	private double height;
	private double width;
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	
	public double getArea() {
		
		
		
		return height*width;
	}
	
	
}
