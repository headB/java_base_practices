package day08.comprehensive.practice02;


//需求:
//商品类: Item
//具有成员变量,:
//编号(code)   String类型  商品编号
//名称(name)  String 类型  商品名称
//类别(type)   String 类型  商品的具体类别
//价格(price)   double 类型 商品的价格

public class Item {
	
	private String code;
	private String name;
	private String type;
	private double price;
	
	public Item() {
		
	}
	
	
	
	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}


	//带参数的构造器!
	public Item(String code,String name) {
		this.code = code;
		this.name = name;
	}
	
	public String toString() {
		
		System.out.format("当前电脑名字是%s,当前电脑的价格是%s",this.name,this.price);
		
		return "";
	}

}
