package day15集合.practice04;

import java.util.ArrayList;
import java.util.List;

//需求:创建四个 User 对象，存储在 List 中，分析内存图。
//作业目的:掌握集合中存放的是对象的内存地址，不是对象本身

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("kumanxuan",1);
		
		List list = new ArrayList();
		list.add(u1);
		list.add(new User("beetle",5));
		list.add(new User("lizhixuan",10));
		list.add(new User("btou",51));
		
		System.out.println(list);
		
		u1.setName("beetle Lai");
		
		System.out.println(list);

	}

}


class User{
	
	private String name;
	private int age;
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}


	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
