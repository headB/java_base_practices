package day11.practice02;

//设置单例有三个步骤?



public class ArrayUtil2 {
	
	//首先私有化构造器
	private ArrayUtil2() {
	}
	
	//然后创建一个且仅有一个实例.而且是用static,因为这就可以定义成为类成员.!
	private static ArrayUtil2 arrayUtil = new ArrayUtil2();
	
	//还有向外暴露一个返回这个单例///   返回这个自身的这个对象.
	public static ArrayUtil2 returnInstance() {
		return arrayUtil;
	}
	
	public  void sort(int[] array) {
		System.out.println("这里是对数组进行排序!");
		
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
	
	public  void binarySeach(int array,int key) {
		System.out.println("二分法!");
	}
	

}
