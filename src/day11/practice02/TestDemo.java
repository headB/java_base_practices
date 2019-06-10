package day11.practice02;

import java.util.Arrays;

public class TestDemo {
	
	
	public static void main(String[] args) {
		
		
		//然后获取单例
		
		//设置一个数组,等待排序
		int[] array = {1,99,5,23,44,55,12,69,66};
		int[] array1 = {19,99,5,23,44,55,12,69,66};
		
		ArrayUtil2 a1 = ArrayUtil2.returnInstance();
		
		a1.sort(array);
		
		System.out.println(Arrays.toString(array));
		
//		ArrayUtil3 a2 = ArrayUtil3.INSTANCE;
		//针对上面的一步到位
		ArrayUtil3.INSTANCE.sort(array1);
		System.out.println(Arrays.toString(array1));
		
		Object i = 7;
		System.out.println(i);
		
	}
	

}
