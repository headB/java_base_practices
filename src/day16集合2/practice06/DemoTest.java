package day16集合2.practice06;

import java.util.Set;
import java.util.TreeSet;

//6. 作业六:
//需求:使用 Comparable 接口按照用户的年龄从小到大排序 步骤:
// 定义User类，并实现Comparable接口，覆盖compareTo方法 
// 创建TreeSet对象，将User对象添加进TreeSet对象中
//
//
//作业目的:了解 Comparable 的作用 

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("kumanxun",18);
		User u2 = new User("kumanxun Lai",30);
		User u3 = new User("kumanxun Lee",22);
		User u4 = new User("kumanxun CC ",13);
		
		//然后实例化红黑树
		Set<User> set = new TreeSet<>();
		set.add(u1);
		set.add(u2);
		set.add(u3);
		set.add(u4);
		
		System.out.println(set);
		
		System.out.println(set.toArray());

	}

}


//按照年龄排序!
class User implements Comparable<User>{
	
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


	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		
		//然后就是比较年龄,需要强转?
		if(this.age > o.age) {
			
			return 1;
			
		}else if(this.age < o.age) {
			return -1;
		}
		
		
		return 0;
	}
	
	
	
	
	
}