package day16集合2.practice03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//3. 作业三:
//需求:演示 HashSet 接口中的常用操作 
//增:删: 改: 查: 遍历
//作业目的:掌握 HashSet 接口中的常用方法的使用和遍历

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add("lizhixuan");
		set.add("kumanxuan");
		set.add("beetle");
		set.add("beetle Lai");
		set.add("cctv");
		set.add("cctv");
		
		System.out.println(set);
		
		//修改  ???   //查询???
		System.out.println(set.contains("beetle"));
		System.out.println(set.contains("beetle1"));
		System.out.println(set.size());
		
		set.remove("cctv");
		
		System.out.println("===========中间分界,心理变态================");
		
		for(String name:set) {
			
			System.out.println(name);
			
		}
		
		System.out.println("===========中间分界,心理变态================");
		
		
		//使用迭代器迭代
		Iterator<String> it1 = set.iterator();
		while(it1.hasNext()) {
			
			System.out.println(it1.next());
			
		}
		
		
		
		
		

	}

}
