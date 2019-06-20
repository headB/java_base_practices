package day16集合2.practice01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1. 作业一:
//需求:演示 List 迭代的三种方式
//作业目的:掌握 List 迭代的三种方式

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>(); 
		list.add("西施");
		list.add("王昭君");
		list.add("貂蝉");
		list.add("杨玉环");
		list.add("西施");
		
		System.out.println(list);
		
		//for循环  获取当个索引
		for(int i=0;i<list.size();i++) {
			
			String name = list.get(i);
			System.out.println(name);
			
		}
		
		System.out.println("========中间分界,心理变态=========");
		
		//使用迭代器
		Iterator<String> iter1 = list.iterator();
		
		while(iter1.hasNext()) {
			
			System.out.println(iter1.next());
			
		}
		
		System.out.println("========中间分界,心理变态=========");
		
		//还有一种,估计就是使用复合型的for
		for(String name:list) {
			
			System.out.println(name);
			
		}
		
		System.out.println("========中间分界,心理变态=========");
		
		
		
		
		
		
		

	}

}
