package day06;

import java.util.Arrays;

public class Day06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//先定义一个数组
		int[] array1 = {11,22,33,44,55};
		int[] array2 = new int[10];
		
		ArrayCopyDemo.arrayCopy(array1, 0, array2, 2, 5);
		System.out.println("这个是复制后的数组-->"+Arrays.toString(array2));
		
		System.out.println("尝试使用系统自带的数组复制方法");
		
		System.arraycopy(array1, 0, array2, 1, 5);
		System.out.println("这个是System.复制后的数组-->"+Arrays.toString(array2));
		
		//测试冒泡算法
		int[] array3 = {11,6,99,103,3,9,34};
		ArraySortDemo.ArraySort(array3);
		System.out.println("打印冒泡法:->"+Arrays.toString(array3));
		
		
		//测试自带的排序
		int[] array4 = {151,6,99,103,3,9,34};
		Arrays.sort(array4);
		System.out.println("打印冒泡法:->"+Arrays.toString(array4));
		
		
		//测试自己手写的二分法
		int Index = ArraySearchDemo2.SearchDemo(array4, 34);
		
		System.out.println("好像找到索引了,索引是->"+Index+"--要寻找的数值是->"+array4[Index]);
		
		
		{
			
			//二、综合练习:
			//1.练习一 SreachDemo.java
			//需求:字符数组 char[] arr={‘A’,‘1’,‘R’,‘!’,‘e’,‘&’,‘A’,‘5’,‘A’,‘g’,‘#’,‘D’}，
			//请使用循环，统计出其中英文字 母‘A’的个数。
			
			int count = 0;
			char[] array= {'A','1','R','!','e','&','A','5','A','g','#','D'};
			for(char i:array) {
				
				if(i=='A') {
					count++;
				}
				
			}
			
			System.out.println("A总共是有->+"+count);
			
		}
		
		//然后测试数组交换值
		{
			int[] array = {11,19,89,64,51,1989};
			transfer(array,3,4);
			
		}
		
		//测试寻找最大的质数.
		PrimeNumbeDemo();
		PrimeNumbeDemo1();
		fallDemo();
		
		{
			
			double sum=100,height=100;
			for(int i=1;i<=9;i++)//计算第一次落地到第九次落地再弹起小球经过多少米
			{
			height=height/2;
			sum=sum+height*2;
			}//循环结束，小球第十次落地
			height=height/2;//第十次弹起的高度，按题意此时不再计算
			System.out.println("第十次落地时的高度是："+height+"\n小球共经过："+sum+"米");
			
		}
		
		
	}

	//2. 练习二 ChangeDemo.java
	//需求:定义一个方法 transfer(int[] arr, int index1, int index2)
	//实现交换数组 arr 中索引为 index1 和 index2 对应元素的值。
	
	public static void transfer(int[] array1,int index1,int index2) {
		
		
		System.out.println(Arrays.toString(array1));
		int temp = array1[index1];
		array1[index1] = array1[index2];
		array1[index2] = temp;
		System.out.println(Arrays.toString(array1));
		
	}
	
//	三、拓展练习
//	1.拓展一 PrimeNumbeDemo.java
//	需求:请输出 1-100 
//	以内最大的五个质数(质数又称素数。一个大于 1 的自然数，如果除了 1 和它自身外，不能被其他自然数整除的数)。
//	思路:
//	(1)一个数 num 和[2，num)这个范围的数进行对比，
//如果能被整除就不需要进行对比 
//(2)5 个数，那么需要我们定义一个计数器，来记录符合要求的个数 
//(3)最大的需要我们倒着循环
	
	public static void PrimeNumbeDemo() {
		
		//设置一个数组去保存 
		int[] maxPeime = new int[5];
		int count = 0;
		for(int i=100;i>1;i--) {
			
			if(count>4) {
				break;
			}
			
			//设置停止条件   2  到  i的前一个数,但是也去除了1,所以-2
			for(int count1=0;count1<i-2;count1++) {
			int min = 2 + count1;
			if(i % min==0) {
				break;
			}
			
			//除到自己前一个数还是不能整除
			if(min==i-1) {
				
				maxPeime[count]=i;
				count++;
				
			}
			
			}
			
			
			
			
			
		}
		
		System.out.println("最大的5个质数是->"+Arrays.toString(maxPeime));
		
	}
	
	public static void PrimeNumbeDemo1() {
	
		int[] array = new int[5];
		int count = 0;
	
		//设置一个优化版
		for(int i = 100;i>=1;i--) {
			
			//设置是否出现为1的情况.就是有可以整除的情况
			boolean isPrime = false;
			for(int x = 2;x<=i-1;x++) {
				
				if(i%x==0) {
//					System.out.println("I am X->"+i);
					isPrime = true;
					break;
				}
				
			}
			if(!isPrime) {
				array[count] = i;
				count++;
				if(count>4) {
					break;
				}
			}
			
		}
		
		System.out.println("打印5个100以内的质数:->"+Arrays.toString(array));
	
		
	}
	

//2.拓展二 FallDemo.java
//需求:在 main 方法中实现如下功能并打印结果:一球从 100 米高度自由落下，每次落地后
//反跳回原高度的一半;再落下，求它在第10次落地时，共经过多少米?第10次反弹多高?

	public static void fallDemo() {
	
	double height = 100;
	double total_height = 100;
	
	for(int i=0;i<9;i++) {
		
		height /= 2;
		total_height += height*2;
		
	}
	
	System.out.println("向前转体三周半,落地冇水花"+height/2+",总共经过了->"+(total_height));
	
	{
		
		
	}
	
	
}

}

//7.第七题 ArrayCopyDemo.java 需求:定义一个方法，进行数组拷贝，并调用 System 中的数组拷贝方法
//思路:
//要求就是:1.把一个数组拼接到另外一个数组去.!

class ArrayCopyDemo{
	
	//src 原数组
	//srcPos 源数组中的开始索引
	//desc 目标数组
	//descPos 目标数组中的开始索引
	//length  要复制的长度
	
	public static void arrayCopy(int[] src,int srcPos,int[] desc,int descPos,int length) {
		
		//长度成了关键的结束索引,不过开始都是0,用于定义究竟循环多少次
		
		for(int x=0;x<length;x++) {
			
			desc[descPos+x] = src[srcPos+x];
			
		}
		
		
	}
	//文锦的答案
	//根本没有这个答案.!
	
}

//8.第八题 ArraySortDemo.java
//需求:定义一个方法，进行数组排序，并调用 Arrays 中的排序方法 思路:
//(1)第一趟比较 遍历所有元素，比较元素之间的大小，上一个元素>下一个元素，两个元素进行交
//换 (2)比较多趟之后，总结规律

//冒泡排序
//二分法排序

//然而我们可以用arrays的sort去进行排序

class ArraySortDemo{
	
	public static void  ArraySort(int[] array1) {
		
		//然后还得分析,
		
		//根据具体有多少个元素来决定有多少次的轮回,
		int temp;
		
		for(int i1=0;i1<array1.length-1;i1++) {
			
		
		for(int i=1;i<=array1.length-1;i++) {
			
			//如何进行比较呢,就是,前一个和后一个比较,然后再继续下一个.
			if(array1[i-1] > array1[i]) {
				
				//如果到这里,证明了前一个比后一个打, 先把前一个索引的数值,大的数值,放到temp
				temp = array1[i-1];
				//然后将后一个的数值,小的这个,给前面第一个赋值,
				array1[i-1] = array1[i];
				//然后最后把temp这个较大的数值赋值给后一个元素.
				array1[i] = temp;
				
			}
			
		}
		}
		System.out.println("黑人问号");
		System.out.println((0+9)/2);
		
		
			
			int i=0;
			while(i<10) {
				i++;
				if(i==5) {
					continue;
//					break;
//					return 1;
				}
				System.out.println("我是i+"+i);
				
			}
			
		
	}
	
	
	
}


//9.第九题 ArraySreachDemo2.java 需求:定义一个方法，进行数组二分查找，并调用 Arrays 中的二分查找方法
//思路:

//思路就是,类似猜字游戏,每次都猜一个中间数,看看是否接近,每次都可以减少近一半的工作
//不过前提就是数组都是需要有序的.!
//OK!刚刚稍微加强了一下关于打印等边三角形的问题,看来啊,我有空,去尝试打印一下杨辉三角吧.!
//OK!现在来演示二分法

class ArraySearchDemo2{
	
	//输入一个有序的数组,然后输入你想查找的数的值,然后返回具体的数值.
	public static int SearchDemo(int[] array1,int value) {
		
		//然后做算法
		
		//取中间的索引
		
		int firstIndex = 0;
		int lastIndex = array1.length-1;
		
		
		for(int i=0;i<array1.length;i++) {
			
			
			 int midIndex = (firstIndex+lastIndex) /2;
			
			
			//成功获取中间的索引
			int midValue = array1[midIndex];
			
			//证明值还没有找到,而且是在右边
			if(value > midValue) {
				
				//设置下一次开始的索引
				firstIndex = midIndex+1;
				
			}else if (value < midValue) {
				//证明值还没有找到,而且是在左边
				lastIndex = midIndex-1;
			}else {
//				break;
				return midIndex;
			}
			
		}
		
		
		
		
		return -1;
		
	}
	
	//2. 练习二 ChangeDemo.java
	//需求:定义一个方法 transfer(int[] arr, int index1, int index2)
	//实现交换数组 arr 中索引为 index1 和 index2 对应元素的值。
	
	public static void transfer(int[] array1,int index1,int index2) {
		
		
		System.out.println(array1);
		int temp = array1[index1];
		array1[index1] = array1[index2];
		array1[index2] = temp;
		System.out.println(array1);
		
	}
	
}








