package day16集合2.practice05;

import java.util.Set;
import java.util.TreeSet;

//5. 作业五:
//需求:演示 TreeSet 接口中的常用操作 增:
//删: 改: 查: 遍历
//作业目的:掌握 TreeSet 接口中的常用方法的使用和遍历

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new TreeSet<>();
		
		set1.add("six");
		set1.add("seven");
		set1.add("eight");
		set1.add("nine");
		set1.add("ten");
		
		System.out.println(set1.contains("six"));
		
		System.out.println(set1.size());
		
		//打印出来查看结果就是,哈哈哈,他们都是有序的,有排序的!>
		System.out.println(set1);
		
		
		for(String s1:set1) {
			
			System.out.println(s1);
		}
		
		set1.remove("ten");
		
		System.out.println(set1);
		
		
		

	}

}
