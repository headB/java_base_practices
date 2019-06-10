package day11.comprehensive02;

import java.util.Arrays;

//二、练习二
//定义一个商品类(Item)，拥有私有化的成员变量商品名称(name)，商品价格(price)，
//请提 供所有成员变量的 setter 和 getter 方法，
//并且提供一个无参数的构造器和一个所有参数的构 造器。
//
//现有字段 String text="name:移动硬盘;price:58.0"，
//请通过常用类的相关方法利用文本 text 的信息创建一个对应 Item 对象。
//
//分析:
//1，将字符串进行拆分 
//2，拆分后的字符串转换成和商品类(Item)字段类型相同的数据 
//3，将转换后的数据保存到对象中

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="name:移动硬盘;price:58.0;name:移动硬盘;price:66.0";
		
		Item itemx = string2Item(text);
		System.out.println((itemx));
		
		Item item1 = string2ItemManual(text);
		System.out.println(item1);
		Item item2 = string2ItemManual("sadasd");
		System.out.println(item2);
		
		
//		System.out.println("hello world!");

	}
	
	static Item string2Item(String object) {
		
		//使用split功能!
			
			String name = null;
			double price = -1;
			
			String[] res = object.split(";");
			System.out.println(Arrays.toString(res));
			if(res.length >1 && (name==null || price ==-1) ) {
				
				for(String str:res) {
					
					String[] str1 = str.split(":");
					if(str1.length>1 &&(name==null || price==-1)) {
//						System.out.println(str1[1]);
						if(str1[0].equals("name")) {
							name = str1[1];
							System.out.println(str1[1]);
						}
						if(str1[0].equals("price")) {
							price = Double.parseDouble(str1[1]);
						}
					}
					
				}
				
			}else {
				System.out.println("???");
				System.out.println(name);
				System.out.println(price);
				return new Item(name,price);
			}
			
			if(name!=null && price!=-1) {
				return new Item(name,price);
			}
			
			
			return new Item();
	}
	
	static Item string2ItemManual(String object) {
		
		//使用原始的方式去匹配字符串,这样可以多搞懂逻辑思维.程序的.!
		
		
		//1.首先匹配;
		
		//然后多少个;   就分配多少个循环.
		
		String name = null;
		double price = -1;
		int lastIndex=0;
		
		for(int i=0;i<object.length();i++) {
			
			if(object.indexOf(";")!=-1 && (name==null || price==-1)) {
//				System.out.println(name);
//				System.out.println(price);
				
				lastIndex = object.indexOf(";");
				//然后获取前面有效的字符
				String res = object.substring(0,lastIndex);
//				System.out.println(res);
				
				//然后继续去处理核心的业务
				if(res.indexOf(":")!=-1) {
					
					//然后获取前后两个关键字索引,字符串的索引位置是重点,
					//前面
					String first = res.substring(0,object.indexOf(":"));
					//可以的话,就进行强转,没有其他方法了,不过其实可以用split

					
					//后面
					String second = res.substring(object.indexOf(":")+1);
					
					//懂了,==是比较内存,然而,java需要比较内容的话,是最后
					//需要使用equals比较的啦!.
					
					if(first.equals("name") && !second.equals("")) {
						name = second;
//						System.out.println("????");
					}
					
					if(first.equals("price") && !second.equals("")) {
						price = Double.parseDouble(second);
					}
					
//					System.out.println("this is first->"+first);
//					System.out.println("this is secod->"+second);
					
					//查看是否设置生效
//					System.out.println("设置效果->this is name"+name);
//					System.out.println("设置效果->this is price"+price);
					
				}
				
				
			}else {
//				终止条件
				break;
			}
			
			//然后处理过后,继续查看查看后面的有没有需要继续去处理.
			//否则就是终止条件
			object = object.substring(lastIndex+1);
			if(object.indexOf(";")!=-1) {
				
//				System.out.println(object);
				
			}else {
				break;
			}
			
			
		}
		
		if(name!=null && price !=-1) {
			return new Item(name,price);
		}else {
			return new Item();
		}
		
		
	}

}
