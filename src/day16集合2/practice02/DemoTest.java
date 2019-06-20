package day16集合2.practice02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//2. 作业二:
//需求:演示 List 中的并发修改异常 作业目的:
//记住结论:迭代器迭代只能使用迭代器的 remove 方法 集合遍历只能使用集合的 remove 方法

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>(); 
		list.add("西施");
		list.add("王昭君");
		list.add("貂蝉");
		list.add("杨玉环");
		
		System.out.println("========中间分界,心理变态=========");
		
//		for(String name:list) {
//			
//			if("西施".equals(name)) {
//				
//				list.remove(name);
//				
//			}
//			
//		}
		
		
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()) {
			
			if("西施".equals(it1.next())) {
				//删除当前的元素
				it1.remove();
				
			}
			
		}
		
		System.out.println(list);
		
		

	}

}
