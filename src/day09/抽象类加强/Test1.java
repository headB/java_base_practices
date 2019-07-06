package day09.抽象类加强;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt("6");
		System.out.println(a);
		
		Double b = Double.parseDouble("88");
		
		//手动拆箱
		int b1 = b.intValue();
		
		
		System.out.println(b1);
		System.out.println(b);
		
		//手动装箱
		Integer c = Integer.valueOf("88");
		
		List list = new ArrayList();
		
		//尝试加一个延迟
		list.add("six");
		list.add(6);
		list.add(48);
		list.add("CCTV");
		list.add("TVB");
		
		System.out.println(Arrays.toString(list.toArray()));
		
		
		
		
		

	}

}
