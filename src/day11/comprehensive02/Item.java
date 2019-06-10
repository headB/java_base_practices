package day11.comprehensive02;


//定义一个商品类(Item)，拥有私有化的成员变量商品名称(name)，商品价格(price)，
//请提 供所有成员变量的 setter 和 getter 方法，
//并且提供一个无参数的构造器和一个所有参数的构 造器。
//
//现有字段 String text="name:移动硬盘;price:58.0"，
//请通过常用类的相关方法利用文本 text 的信息创建一个对应 Item 对象。

public class Item {
	
	private String name;
	private double price;
	
	public Item() {
		
	}
	
	public Item(String name,double price) {
		
		this.name = name;
		this.price = price;
		
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

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	

}
