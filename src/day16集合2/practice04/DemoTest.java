package day16集合2.practice04;

import java.util.HashSet;
import java.util.Set;

//4. 作业四:
//需求:创建三个 User 对象，覆盖 equals 和 hashCode 方法，存储在 HashSet 中。
//作业目的:了解 HashSet 添加元素过程，以及 HashSet 是如何判断元素相同的

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("beetle",18);
		User u2 = new User("beetle Lai",22);
		User u3 = new User("beetle Lee",25);

		Set<User> set1 = new HashSet<>();
		set1.add(u1);
		set1.add(u2);
		set1.add(u3);
		
		
		
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	
}
