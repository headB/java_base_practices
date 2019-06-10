package day01;

import java.util.Arrays;

public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
//			1.第一题 ArrayDemo1.java
//			需求:定义数组和数组的静态初始化操作
//			步骤:
//			(1)先定义后初始化数组(不能使用简写方式) (2)定义数组，同时初始化
//			(3)打印数组长度 (4)数组赋值为空，并演示空指针错误 (5)请在纸上画出以上代码的内存分析图
			
	
//			int[] array1 = new int[]{1,3,4,5,6};
//			
//			//简写的方式是
//			int[] array2 = {1,2,3,4,5,6};
//			
//			//动态初始化
//			int[] array3 = new int[4];
			
			//不能同时指定元素值和数组的长度
			//下面这个是禁止的.
			// int[] array4 = int[5]{1,2,3,4,5}
			
			
			//先定义后初始化
			int[] arr1;
			arr1 = new int[]{1, 2, 3, 4};
			//定义数组同时初始化
			int[] arr2 = new int[]{1, 2, 3};
			
			System.out.println("本数组的长度"+arr2.length);
			
			//当数组赋值为空
//			arr2 = null;
//			System.out.println(arr2[0]); //NullPointerException空指针错误
			
			
		}
		
		{
//			2. 第二题 ArrayDemo2java
//			需求:数组的动态初始化和内存分析
//			步骤:
//			(1)动态初始化数组，并打印数组长度 
//			(2)重新初始化数组，并打印数组长度
//			(3)请在纸上画出以上代码的内存分析图
			
			int[] array1 = new int[4];
			System.out.println("本数组的长度:"+array1.length);
			array1 = new int[3];
			System.out.println("本数组的长度:"+array1.length);
			
			
		}
		
		{
//			3. 第三题 ArrayDemo3.java
//	需求:数组的基本操作
//	步骤:
//	(1)定义一个数组 nums,并静态初始化该数组 (2)定义一个变量 size 获取 nums 的数组长度 (3)获取数组元素
//	(4)设置数组元素
//	(5)遍历数组
			
			int[] nums = {1,2,3,4,5,6};
			int size = nums.length;
			
			System.out.println("元素A"+nums[1]);
			System.out.println("元素B"+nums[2]);
			nums[2] = 66;
			System.out.println("元素B"+nums[2]);
			
			for(int i=0;i<size;i++) {
				System.out.println("循环输出数组的元素:"+nums[i]);
			}
			
			
//			文锦的例题
			
			
			
		}
		
		{
			
//			4.第四题 ArrayDemo4.java
//			需求:找出数组值元素 22,在数组中第一次出现的索引位置 步骤:
//			(1)定义一个数组 nums，并初始化该数组
//			(2)定义一个变量 key，表示被搜索的元素
//			(3)遍历数组
//			(4)判断如果当前元素和 key 相等，证明找到元素，打印并结束循环
			
//			int[] array1 = {11,22,33,44,55};
			
			
			int[] nums = {11,22,33,44,55,66,22,77,88};
			int key = 22;
			for(int i=0;i<nums.length;i++) {
				
				if(nums[i]==key) {
					System.out.println("找到元素了.!");
					System.out.println("索引是位于:"+i);
					break;
				}
				
				
			}
 			
			
		}
		
		
		{
			
//			5.第五题 ArrayDemo5.java
//			需求:求出 int 类型数组中最大元素值 步骤:
//			(1)定义并初始化数组 nums
//			(2)定义一个变量 max 表示最大的元素，并假设 nums 的第一个元素为最大值 (3)使用 foreach 循环遍历 nums 数组
//			(4)判断如果遍历的元素和 max 比较，遍历的元素比较大，就将当前元素赋值给 max (5)遍历完成打印 max
			
			int[] nums = {11,22,33,44,55,66};
			int max = nums[0];
			for(int i:nums) {
				
				//感觉是线性比较
				if (i>max) {
					max = i;
				}
				
				
			}
			System.out.println(max);
			
			
		}
		
		{
			
//			6.第六题 ArrayDemo6.java
//			需求:按照某种格式来打印出数组中的元素，打印效果为:[11,22,33,44,22,55] 步骤:
//			(1)定义并初始化数组 nums 
//			(2)定义一个字符串类型的变量 str，用于拼接字符串 
//			(3)遍历数组并拼接元素到 str 
//			(4)判断为最后一个元素拼接“]”，否则拼接“，” 
//			(5)打印 str
//			
			
			int[] array1 = {11,22,33,44,22,55};
			
			String str ;
			
			str = "[";
			
			for(int i=0;i<array1.length;i++) {
				
				if(i==array1.length-1) {
					
					str +=array1[i];
					str +="]";
				}else {
					str+=array1[i]+",";
				}
				
			}
			
			System.out.println(str);
			
			
			
		}
		
		
		{
			
//			7.第七题 ArrayInArrayDemo.java
//			需求:演示二维数组的基本操作
//			步骤:
//			(1)定义一个二维数组 
//			(2)静态初始化二维数组 
//			(3)动态初始化二维数组 
//			(4)获取二维数组的元素 
//			(5)设置二维数组的元素
//			(6)for 循环遍历并打印二维数组的元素 
//			(7)foreach 循环遍历并打印二维数组的元素
			
			//定义二维数组
			int[][] array;
			
			array = new int[][] {{11,22,33},{44,55,66},{77,888}};
			
			//动态初始化二维数组
			int[][] array1 = new int[3][3];
			
			//定义一个数组去接收一个二维数组的其中一个一维数组
			
			int [] array2 = array1[0];
			
			//设置二维数组的元素
			array[0][0] = 3;
			
			System.out.println(array2.toString());
			
			for(int i=0;i<array.length;i++) {
				
				
				System.out.println(array[i]);
				for(int y=0;y<array[i].length;y++) {
					System.out.println(array[i][y]);
				}
				
			}
			
			
			
			
		}
		
		{
			
//			二、综合练习:
//				1.练习一 LocationDemo.java
//				需求:定义一个 int 类型数组,求出该数组索引是偶数位置元素之和 思路:注意区分索引和元素
			
			int[] array = {11,2,33,4,55,6};
			
			int sum = 0;
			for(int i=0;i<array.length;i++) {
				
				if((i+1)%2==0) {
					
					sum += array[i];
					
				}
				
			}
			
			System.out.println("他们的偶数索引的总分是:"+sum);
			
			
		}
		
		
			{
				//定义一个int类型数组
				int[] arr = new int[]{11, 2, 33, 4, 55, 6};
				//偶数总和变量
				int sum = 0;
				//利用for遍历数组
				for(int size = 0; size < arr.length; size++)
				{
					//利用if判断索引是否为偶数
					if(size % 2 == 0)
					{
						sum += arr[size];
					}
				}
				System.out.println(sum);
		}
			
			
			
			
			{
				
//				2.练习二 ReversedDemo.java
//				需求:定义一个元素为 String 类型数组，按照格式逆序打印该数组的元素，
				//例如 数组内容为:{“A”，”B”，”C”，”D”},打印效果为:[D,C,B,A]
//				思路:
//				(1)逆序遍历 (2)字符串拼接
				
				String[] s1 = {"A","B","C","D"};
				
				String str1 = "[";
				
				for(int i=s1.length-1;i>=0;i--) {
					
					if(i==0) {
						
						str1+=s1[i]+"]";
						
					}
					else {
						str1 += s1[i]+",";
					}
					
				}
				
				System.out.println(str1);
				
			}
			
			{
				
//				三、拓展练习
//				1. 拓展一 StatisticsDemo1.java
//				需求:定义一个 int 类型的数组，
//				返回一个长度为 2 数组，其索引 0 位置存放参数数组 偶数索引元素之和，索引 1 位置存放参数数组奇数索引元素之和。
//				思路:
				
				//设置两个变量去分别保存    奇数的总和     第二个是  偶数的总和
				
				int sum1 = 0;
				int sum2 = 0;
				
				
				
				int[] array1 = new int[2];
				
				//然后还得去定义一个数组,里面最好长度是4位以上就可以了
				int[] array2 = {11,2,33,4,55,6,77,8};
				
				for(int i=0;i<array2.length;i++) {
					
					
					//奇偶两种索引分开保存
					
					
					//保存索引为偶数的数值
					if(i%2==0) {
						
						sum2 += array2[i];
						
					}
					
					if(i%2!=0) {
						
						sum1 += array2[i];
						
					}
					//这两个统计结果分别保存到数组当中,奇数的结果放到1索引位置,偶数的放到0索引位置
					
					
					
					
				}
				
				array1[0] = sum2;
				array1[1] = sum1;
				
				System.out.println("奇数的数组总和"+sum1);
				System.out.println("偶数的数组总和"+sum2);
				
				System.out.println("尝试打印数组:"+array1);
				
				//尝试一下开挂的人生
				System.out.println(Arrays.toString(array1));

				
			}
			
			{
				
//				2. 拓展二 StatisticsDemo2.java
//				需求:定义一个方法接收一个 int 类型的二维数组，返回数组元素值是 0 的次数。
//				例如:数组:{{1,2,0,4,0}，{0,3,5}},结果为 3
				
				int test = 0;
				
				int[] array1 = new int[]{1,2,3,4,5};
				int[][] array2 = {{1,2,0,4,0},{0,3,5}};
				
				int[][] array3 = {{4,5,6},{7,8,9},{123,4,5,6}}; 
				int[][][] array4 = {{{4,5,6}},{{},{1234}},{{2,3,22,1}}};
				
				int[][][] array5 = new int[12][10][10];
				array5[0][0][5] = 123;
				//然后就禅师去搜索元素值为0的次数
//				for(int i2:)
				
				//尝试打印出来一个比较随意的三维数组
				System.out.println("打印我自己稍微用了点心的三维数组:--->+"+Arrays.deepToString(array4));
				
				//尝试看一下这个数组的长度
//				System.out.println("尝试看一下这个数组的长度:--->+"+array5.length);
//				System.out.println("尝试看一下"+Arrays.toString(array5));
//				System.out.println("尝试看一下初始化的数组都是什么"+array5[1][1][1]);  //结果是0
				//注意一下边界,就是,    [12]这个意思就是创建11个,所以其他的类推
				
				//然后就用for来循环输出所有的结果.
				for(int[][] i:array5) {
					
					for(int[] x:i) {
						
						for(int y:x) {
							System.out.print(y+" -- ");
						}
						
					}
					
				}
				
				System.out.println();
				System.out.println("尝试看一下初始化的数组都是什么"+array5[11][9][9]);  //结果是0
				System.out.println("仅仅是动态初始化,没有赋值的数组+"+array2[0]+"  test变量+"+test);
				//上面的结果,结果是0,看来int的初始化的确是   0   .
				
				//关于数组的长度问题,应该怎么去理解呢,我我看看吧.
				//就是本来java定义数组,就是有静态初始化,和动态初始化的.动态可以指定长度!.
				//int[][] array3 = 
				

				//设置一个专门保存对象的数组
				Shuzu[] array11 = {new Shuzu()};
				
				int count=0;
				for(int[] i:array2) {
					
					for(int x:i) {
						
						if(x==0) {
							count++;
						}
						
					}
					
				}
				
				System.out.println("这题的要求就是,总共出现了N次的0-->+"+count);
				
				
				
			}
			
			{
				
//				3.拓展三 StatisticsDemo3.java
//				需求:定义一个整型数组，将数组中的 0 去掉后返回一个新数组。
//				例如:数组为 int[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15}; 
//				要求将以上数组中为 0 的元素 去掉，将不为 0 的值存入一个新数组，
//				生成新的数组作为返回值: int[] newArr={1,13,45,5,16,6,25,4,17,6,7,15};
				
				
				int[] array1 = {1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
				
				int[] array2 = new int[array1.length];
				
				int count = 0;
				for(int i=0;i<array1.length;i++) {
					
					if(array1[i]!=0) {
						array2[count] = array1[i];
						count++;
					}
					
				}
				
				//尝试利用系统的数组复制
				int[] newArray2 = new int[count];
				System.arraycopy(array2, 0, newArray2, 0, count);
				
				int[] newArray = new int[count];
				for(int i=0;i<=count;i++) {
					if(array2[i]!=0) {
						newArray[i] = array2[i];
					}
				}
				
				System.out.println("这是新生成的数组-->+"+Arrays.toString(array2));
				System.out.println("这是新生成的数组-->+"+Arrays.toString(newArray));
				System.out.println("这是新生成的数组-->+"+Arrays.toString(newArray2));
				
				
			}
			
			{
				
				
			}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	2. 拓展二 StatisticsDemo2.java
//	需求:定义一个方法接收一个 int 类型的二维数组，返回数组元素值是 0 的次数。
//	例如:数组:{{1,2,0,4,0}，{0,3,5}},结果为 3
	public void shuzu(int[][] array1) {
		
	}
	
	

}


class Shuzu{
	
	public Shuzu() {
		
	}
	
}
