package day10.practice05;

import java.util.Arrays;

//需求:定义一个 ClothType 枚举类，
//表示衣服分类的三种情况:男装、女装、中性服装
//
//并在测试类中获取枚举中的常量对象，
//并调用枚举中的 name、ordinal 方法。 
//
//作业目的:定义枚举类和枚举的使用

public class TestDemoTest {
	
	
	
	//第三题
	public void change(int[] array1) {
		
		//这里题目要求肯定是求最大值和最小值,两次手动冒泡?
		//但是这里仅仅是求到最大数值的索引就可以了.!
		
		int maxIndex=0;
		int minIndex=0;
		
		int maxValue = array1[0];
		int minValue = array1[0];
		System.out.println("这个是交换之前的数组->"+Arrays.toString(array1));
		//冒泡是交换位置,所以这里不能用冒泡,就是要求出最大值,就是需不需要交换数就可以了.!
		for(int i=0;i<=array1.length-2;i++) {
			
			//然后开始比较两个数的最大值.
			if(array1[i] < array1[i+1]) {
				
				if(array1[i+1] > maxValue) {
					
					maxValue = array1[i+1];
					//并且需要记录当前最大值的索引位置
					maxIndex = i+1;
				}
				
				
				
				
			}
			
			
			//然后开始比较两个数的最小值.
			if(array1[i] > array1[i+1]) {
				
					if(array1[i+1] < minValue) {
					
						minValue = array1[i+1];
						//并且需要记录当前最大值的索引位置
						minIndex = i+1;
					}
				
			}
			
		}
		System.out.println("最大值的索引是->"+maxIndex);
		System.out.println("最小值的索引是->"+minIndex);
		
		//然后操作这个当前索引,交换数值
		//单独设置最大值和最小值的两个变量
		//int temp = array1[maxIndex];
		//然后开始操作数组
		array1[maxIndex] = minValue;
		array1[minIndex] = maxValue;
		
//		array1[min]
		System.out.println("这个是交换之后的数组.!"+Arrays.toString(array1));
		
		
		
	}
	
	
	public int change(String[] array1) {
		
		return 1;
	}
	
	//第四题
			void getLetter(char[] chars) {
				
				String letter1 = "{";
				
				for(int i=0;i<=chars.length-1;i++) {
					
					
					if ( (chars[i]>=65 && chars[i] <= 90) || (chars[i]>=97 && chars[i] <= 122) ) {
							
						//确定这里是最后一个了.!
						if(i==chars.length-1) {
							
							letter1 += "'"+chars[i] + "' }";
							
						}else {
							letter1 += "'"+chars[i]+"' ,";
						}
						
					}
			
				}
				System.out.println(letter1);
				
				
			}
			
	
	public static void main(String[] args) {
		
		
		char[] chars = {'a','c','5','#','^','f','F','U'};
		
		TestDemoTest t1 = new TestDemoTest();
		
		t1.getLetter(chars);
		
		
		//测试第三题
		int[] array1 = new int[] {44,12,31,2,55};
		
		int[] array2 = new int[] {3,4,1,45,99,22,2,3};
		
		t1.change(array1);
		
		t1.change(array2);
		
	
		//第五题
		int a = 2;
		int b = 5;
		int sum = 0;
		for(int i=1;i<=b;i++) {
			
			int sum1 = 0;
			int sum2 = 1;
			

				
				for(int x=i;x-1>=1;x--) {
					
					sum2 = 10*sum2;
					sum1 = sum2*a + sum1;
					
				}
		
			sum = sum + sum1 + a;
		}
		
		System.out.println(sum);
		
		
		//第六题
		//统计个数
		int count = 0;
		
		for(int i=1;i<=1000;i++) {
			
			//求出个十百  三个位数的数字是否等于  1或者3或者6
			
			//百位
			int thousand = i / 100;
			//十位
			int ten = i / 10 % 10;
			//个位
			int one = i % 10;
			
			
			if(i%2==0) {
				continue;
			}
			
			if (one == 1 | one ==3 | one==6) {
				
				if ((ten == 1 | ten ==3 | ten==6 | ten==0)) {
					
					if (thousand == 1 | thousand ==3 | thousand==6 | thousand==0) {
						count++;
						System.out.println(i);
					}
					
				}
				
			}
			
			
			
		}
		
		System.out.println("个数是:->"+count);
		
			
		System.out.println("============");
		////创建cloneType实例.!
		for(int i=10;i<=99;i++) {
			
			
			
			if(809*i==800*i+9*i+1) {
				System.out.println("809*i==800*i+9*i+1");
				System.out.println(i);
				
				
		
		////尽量还是把条件放到这个地方就可以了.!都是算法问题,但是上面的,程序还是可以运行的.!
		
				break;
			}
			
			if (8*i>100) {
				System.out.println("8*i>100");
				System.out.println(i);
				break;
			}
			
			if(9*i>1000) {
				System.out.println("9*i>1000");
				System.out.println(i);
				break;
			}
			
		}
		
		
	}
	
	

}
