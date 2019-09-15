package 尝试出考试题目;

//sajh;lkslkh

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//父类
class Test_8 {
	
	String name = "kumanxuan";
	
	Test_8(){
		
	}
	
	Test_8(String score,Integer score1,char char1){
		
	}
	
	Test_8(String name){
		
	}
	
	void printEcho(){
		System.out.println();
	}
	
}

public class Test9 extends Test_8 {
	
	int age = 18;
	
	Test9(){
		System.out.println(this.name);
	}
	
	public Test9(String name) {
		
		super("asd",123,'A');
	}
	public Test9(int age,String name) {
		super("123");
	}
	
	
	public static void main(String[] args) {
		
		Test9 t3 = new Test9();
		
		Test9 t1 = new Test9("我是字符串");
		
		Test9 t2 = new Test9(100,"我是字符串");
		
		
		
		
		
		//快速冒泡排序法
		int x1,x2;
		
		
		
		
		System.out.println("asdasd");
		System.out.println(4+1%5);
		
		int money = 35;
		while(true) {
			System.out.println("吃了一顿饭");
			money -= 10;
			if(money<=10) {
				break;
			}
		}
		
		int[] arr = {1,101,201,45,76,12,89,45,106};
		
		
		int max = arr[0];
		int min = arr[0];
		
		int a = 1;
		System.out.println(++a);
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>min) {
				
				min = arr[i];
//			}else if (max<arr[i]) {
			}else  {
				max = arr[i];
			}
			
		}
		
		
		for(int i=3;i<=100;i=i+3) {
			if((i+4)%5==0) {
				System.out.println("我有->"+i);
			}
		}
		
		
		
		int [] arr2 = {1,3,4,5,101,6,9,201};
		
		System.out.println("arr2");
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("this is max and min ");
		System.out.println(max);
		System.out.println(min);
		
		System.out.println( 2 > 1? false:true);
		System.out.println(123%100);
		
		System.out.println(Arrays.toString(arr));
		
		sortNumber(arr,1);
		
		System.out.println(Arrays.toString(arr));
		
//		triangle(5);
		
		
		
		
		
	}
	
	static void sortNumber(int[] arr,int sortNumber) {
		
		
		//需要前一个索引和后一个索引交换数值.
		
		
		//然后还有全部元素,都走一轮,除了最后一个.
		
		//尝试单轮排序.
		for(int i1=0;i1<arr.length-1;i1++) {
			
		
			for(int i=0;i<arr.length-1-i1;i++) {
			
				//前后数值对比.
				if(arr[i]>arr[i+1]) {
					
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
			}
			
		}
		
		
	}

	static void triangle(int lines) throws FileNotFoundException {
		
//		for(int i=1;i<=lines;i++) {
		for(int i=lines;i>=1;i--) {
			
			
			//然后就是输出三角形的*,然后就是空格,不分先后,都是可以的!.
			
			for(int i1=1;i1<=lines-i;i1++) {
				System.out.print(" ");
			}
			
			for(int i2=1;i2<=2*i-1;i2++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		Map<Integer,String> m1 = new HashMap<>();
		
		m1.put(1, "中国");
		m1.put(2, "美国");
		
		System.out.println(m1);
		
//		m1.get(1).r
		
		System.out.println(m1);
		
		File file = new File("as");
		FileInputStream f1 = new FileInputStream(file);
		
		
	}
	
}
