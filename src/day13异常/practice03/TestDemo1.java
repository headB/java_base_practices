package day13异常.practice03;

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//测试在数组当中,寻找得到最大值.
		
		int[] intArray = {99,34,101,3,4,5,6,7,101};
		
		//然后其实就是当个的冒泡排序
		
		int max = intArray[0];
		
		for(int i=0;i<intArray.length-1;i++) {
			
//			System.out.println(i);
			if(intArray[i] < intArray[i+1] ) {
				
				max = intArray[i+1];
				
			}
			
		}
		
		System.out.println("这次的最大值是-> "+max);
		

	}

}
