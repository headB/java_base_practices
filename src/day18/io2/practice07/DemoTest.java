package day18.io2.practice07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//7. 作业七: 
//需求:演示对象流(ObjectOutputStream-ObjectInputStream)序列化和反序列操作
//作业目的:掌握对象流(ObjectOutputStream-ObjectInputStream)序列化和反序列操作

public class DemoTest {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		//需要保存的目标.
		
		String target = "/Users/lizhixuan/Downloads/testJavaSerializable.txt";
		
		ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream(target));
		
		User u1 = new User("kumanxuan",22);
		
		o1.writeObject(u1);
		
		o1.close();
		
		
		//然后马上读取文件
		ObjectInputStream o2 = new ObjectInputStream(new FileInputStream(target));
		
		Object u2 = o2.readObject();
		System.out.println(u2);
		
		//然后进行尝试强转
		User u3 = (User)u2;
		
		System.out.println(u3.getName());
		
		System.out.println(u3);

	}

}

class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private transient String name;
	private String name;
	private int age;
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
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
