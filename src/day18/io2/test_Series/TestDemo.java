package day18.io2.test_Series;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDemo {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		//创建对象,并且赋值.
		User u1 = new User();
		u1.setName("kumanxuan");
		u1.setAge(18);
		u1.setPassword("lizhixuan123!");
		
		//然后就是序列化.
		
		ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream("object.txt"));
		
		o1.writeObject(u1);
		
		o1.close();
		
		
		ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("object.txt"));
		
		Object oo1 = o2.readObject();
		
		System.out.println(oo1);

		o2.close();
		
		
		

	}

}
