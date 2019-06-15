package day11.practice01;

public  class ArrayUtil {
	
	
//	使用 static 方法的方式定义一个数组的工具类，并测试
	
	//首先私有化构造器先
	private ArrayUtil() {
		
	}
	
	public static void sort(int[] array) {
		System.out.println("这里是对数组进行排序!");
		
		//所以这里是实现冒泡法
		
		//核心  ,就是把最大值放到最后一位
		//因为是互相交换,所以,所有操作游标不用操作到最后一个元素
		//比如5个数,主需要操作4次就可以了.
		//但是呢,每次只会把最大的数放到最后,但是第二大的数,并没有放到倒数第二.
		
		//这里先模拟第一次排序
		for(int x=1;x<array.length;x++) {
			for(int i=0;i<array.length-x;i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
				
			}
			
		}
		
	}
	
	public static void binarySeach(int array,int key) {
		System.out.println("二分法!");
	}
	

}
