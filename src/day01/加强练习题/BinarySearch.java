package day01.加强练习题;

//这里是二分法搜索

public   class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//开始
		//前提是有序的数组排序
		int[] array = {1,2,34,78,98,101,201,300,305,405,500,600};
		
		System.out.println(binarySearch(array, 500));
		
		triangle(6);
		
		
	}
	
	private static void triangle(int lines) {
		// TODO Auto-generated method stub
		
		for(int line=1;line<=lines;line++) {
			
			//先输出空格.
			
			for(int i=0;i<line-1;i++) {
				System.out.print(" ");
			}
			
			
			//然后是*
			for(int i1=0;i1<2*(lines-line+1)-1;i1++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			
		}
		
		
	}

	static int binarySearch(int[] array,int key) {
		
		int high = array.length-1;
		int low = 0;
		
		//然后就是核心的二分法了.
		int mid;
		
		
		
		//设置
//		boolean done = false;
		//然后就尝试查看是否查到该数值.
		
		//然后顺便得设置好high和low的数值
		
		//设置条件,当搜索的次数多于???
		while(low<=high) {
			
			mid = (low + high) / 2;
			
			
			
			if(array[mid]==key) {
//				done = true;
				return mid;
			}
			
			
			
			if(array[mid]>key) {
				
				high = mid;
				
				
			}else if(array[mid]<key) {
				
				low = mid + 1;
				
				
				
			}
			
		}
		
		return -1;
		
		
		
		
		
	}

}
