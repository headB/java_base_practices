package day16集合2.comprehensive02;

import java.util.ArrayList;
import java.util.List;

public class DemoTest1 {
	public static void main(String[] args) throws InterruptedException {
		
		
//		List<String> list1 = new ArrayList<>(); 
//		list1.add("kumanxuan123");
//		list1.add("123");
//		list1.add("666123");
//		list1.add("six123");
//		System.out.println(list1);
//		for (String ele : list1) {
//			
//		if("123".equals(ele)) { 
//			list1.remove(ele);
//		} }
//		System.out.println(list1);
		
		
		List<String> list = new ArrayList<>();
		
		list.add("kuman");
		list.add("kumanx");
		list.add("黎智煊123");
		list.add("niubility");
		System.out.println(list);
		for(String ele:list) {
			
//			Thread.currentThread().sleep(1000);
			if("kuman".equals(ele)) {
				list.remove(ele);
			}
//			Thread.currentThread().sleep(1000);
			
		}
		System.out.println(list);
		
		
		
		
	}

}
