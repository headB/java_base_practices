package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	
	int index = 1,min = 4;
	
	
	public void test() {
		
		if(index>0) {
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s= "1";
		int i1 = Integer.parseInt(s);
		
		int index = 1,min = 4;
		
		System.out.println("this is -> min "+min);
//		//
//		int index;
//		//The local variable index may not have been initialized
//		if(index>0) {
//			
//		}
	
		
		LinkedHashSet<String> s1 = new LinkedHashSet<>();
//		Set<String> s1 = new HashSet<>();
		
		
		s1.add("six six");
		s1.add("kumanxuan123");
		s1.add("asdasdasd");
		s1.add("1");
		
		
		
		
		
		
		
		System.out.println(s1);
		
		
		LinkedList<String> s2 = new LinkedList<>();

		s2.add("six six");
		s2.add("kumanxuan123");
		s2.add("asdasdasd");
		s2.add("1");
		
		s2.addFirst("kumanxuan");
		
		
		System.out.println(s2);
		
		
		Set<String> s3 = new TreeSet<>();
		
		
		s3.add("six six");
		s3.add("kumanxuan123");
		s3.add("asdasdasd");
		s3.add("1");
		
		System.out.println(s3);
		
		
		Integer i =  Integer.valueOf("44");
//		int i1 =  Integer.valueOf("44");
		int i2 =  Integer.valueOf("44").intValue();
		
		int i3 =  Integer.parseInt("44");
		
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		

	}
	
	 int testMethod(int a,int b) {
		 
		 int index;
//		 
		 for(int i=0;i<=100;i++) {
			 
			 return index = 1;
			 
		 }
		 
		 index = -1;
		 return index;
		 
	 }

}
