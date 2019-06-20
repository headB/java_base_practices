package day16集合2.practice07;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//7. 作业七:
//需求:使用    接口根据用户的名字长度排序，如果名字相同按照年龄排序。
// 步骤:
// 定义一个NameComparator类实现Comparator接口
// 定义User类，作为TreeSet的元素类型
// 创建TreeSet对象，并传入一个NameComparator比较器对象作为TreeSet构造器的参数 
//作业目的:了解 Comparator 的作用

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//然后直接实例化几个User对象.
		
		User u1 = new User("kumanxuan",18);
		User u2 = new User("kumanxuan123",18);
		User u3 = new User("kumanxuan123",18);
		User u4 = new User("kumanxuan",22);
		User u5 = new User("kumanxuan",11);
		User u6 = new User("six",68);
		
		
		//然后创建TreeSet
		Set<User> userSet = new TreeSet<>(new NameComparator());
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);
		userSet.add(u4);
		userSet.add(u5);
		userSet.add(u6);
		
		System.out.println(userSet);
		
		System.out.println(userSet.size());

	}

}


class User{
	
	private String name;
	private int age;
	
	
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


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
}



class NameComparator implements Comparator<User>{

	//根据用户名的长度做排名,然后呢,就是年龄来排序
	
	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		
		int res = o1.getName().length() - o2.getName().length();
		int ageRes = o1.getAge() - o2.getAge();
		
		if(res>0) {
			
			return 1;
			
		}else if(res==0) {
//			System.out.println(o1);
			
			if (ageRes > 0) {
				return 1;
			}
			else if(ageRes<0) {
				return -1;
			}else {
				return 0;
			}
			
			
			
		}else {
			return -1;
		}
		
//		if(o1.getName()!=null && o2.getName()!=null ) {
//			
//			if(o1.getName().length() > o2.getName().length()) {
//				return 1;
//			}
//			else if(o1.getName().length() == o2.getName().length()) {
//				
//				if(o1.getAge()> o2.getAge()) {
//					
//					return 1;
//					
//				}
//				else if ((o1.getAge() < o2.getAge())) {
//					return -1;
//				}else {
//					return 0;
//				}
//				
//			}else if(o1.getName().length() < o2.getName().length()) {
//				return -1;
//			}
//			
//		}
		
		
	}
	
	
	
}
