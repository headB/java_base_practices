package day15集合.practice07;

import java.util.ArrayList;
import java.util.List;

//7. 作业七:
//需求:使用泛型创建 ArrayList 类对象，
//并调用 ArrayList 中的增删改查方法 作业目的:掌握泛型类的基本使用

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new ArrayList<>();
		
		//增
		l1.add(5566);
		l1.add(12345);
		l1.add(7890);
		l1.add(12890);
		
		//查询
		System.out.println(l1.get(0));;
		
		//改
		l1.set(1, 505606);
		
		System.out.println(l1);
		
		
		//删除
		
		l1.remove(l1.indexOf(12890));
		
		System.out.println(l1);
		
		l1.remove(l1.toArray().length-1);
		
		System.out.println(l1);
		
		
		

	}

}
