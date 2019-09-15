package 尝试出考试题目;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Dog();
		
		Dog d1 = (Dog)a1;
		
		changeArr();

	}
	
	
	public static void changeArr() {
		
		int[] array = {1,23,45,67,89,87};
		
		Map<String,Integer> map = new HashMap<>();
		
		
		for(int i:array) {
			
			map.put("asd",i);
			System.out.println(i);
			
		}
		
		for(String s1:map.keySet()) {
			System.out.format("kumanxuan");
			System.out.println(s1);
		}
		
		
		for(int i=0;i<array.length/2;i++) {
			
			int temp = array[i]; 
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
			
		}
		
		System.out.println(Arrays.toString(array));
		
		
	}
	

}

abstract class Animal{
	
	abstract void say();
	
}

class Dog extends Animal{

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("miao miao");
	}
	
	
	
}
