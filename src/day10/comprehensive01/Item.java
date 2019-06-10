package day10.comprehensive01;

public class Item {
	
//	编号(code) String 类型 商品编号
//	名称(name) String 类型 商品名称
//	类别(type) String 类型 商品的具体类别 
//	价格(price) double 类型 商品的价格 
//	总商品数量(totalNum) int 类型 商品的总商品数量
	
	private String code;
	private String name;
	private String type;
	private double price;
	private static int totalNum;
	
	
	public Item() {
		
		Item.totalNum++;
	}
	//创建一个以编号(code),名称(name) 作为形式参数的构造器
	public Item(String code,String name) {
		//我可以这样写吗?
		this();
		this.code = code;
		this.name = name;
		
	}
	
	public static int getTotalNum() {
		return Item.totalNum;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
	
	

}
