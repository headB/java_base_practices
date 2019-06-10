package day11.practice02;

public enum ArrayUtil3 {
	
	INSTANCE;
	
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
