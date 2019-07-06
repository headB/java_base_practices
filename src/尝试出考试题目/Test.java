package 尝试出考试题目;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		if(i<-1)
			System.out.println("six");
		
			
			
		int number = 10;
		
		recall(number);
		
		int[] arr = {1 ,2,1,1,2,3,4,4,5};
		
		Integer x = sumTotalAll(5);
		System.out.println(x);
		
		int x1 = advanceSumTotal(5);
		System.out.println(x1);
		
		int x2 = highClassSumTotal(5);
		System.out.println(x2);
		
		
	}
	
	
	static int sumTotalAll(int number) {
		
		int total = 0;
		
//		int initVal = 1;
		
		for(int i=number;i>0;i--) {
			
			total += sumTotal(i,1);
			
		}
		
		return total;
		
	}
	
	//阶乘
	static Integer sumTotal(int number,int total) {
//		System.out.println("ss->"+total);
		int tempTotal  = total;
		
		Integer x=null;
		
		if(number<=1) {
			return tempTotal;
		}
		
		for(int i=number;i>=2;i--) {
				
			
				x = sumTotal(--i,++i * total);
				System.out.println("递归的出口-> "+x);
				return x;
				
				
		}
			
		System.out.println("this is end-> "+x);
//		return tempTotal;
		
//		return tempTotal;
		//return 
		
		return x;
		
	}
	
	
	//高级阶乘.
	
	static int advanceSumTotal(int number) {
		
		int total = 0;
		
		
		if(number<0) {
			return total;
		}
		
		//满足条件就进入递归.
		for(int i=number;i>=1;i--) {
		
			int initVal = 1;
			for(int i1=i;i1>=1;i1--) {
				
				initVal =  i1 * initVal;
				
			}
			total +=  initVal;
			
			
		}
		
		
		
		
		
		return total;
	}
	
	
	//终极递归
	static int highClassSumTotal(int number) {
		
		int total = 0;
		
		if(number<0) {
			return total;
		}
		
		int initVal = 1;
		
		for(int i=1;i<=number;i++) {
			
			initVal = initVal * i;
			total +=  initVal;
			
		}
		
		
		return total;
	}
	
	
//	4、已知数组 int[] arr = {1 ,2,1,1,2,3,4,4,5},
//			(6)int getElementCount(int[]arr ,int value),该方法返回value,在arr数组中出现的次数
//			(7)在主方法中,输出每个元素出现的次数:
//			例如:	1 在数组中出现了 3 次
//			        2 在数组中出现了 2 次
	static int getElementCount(int[]arr ,int value) {
		
		return -1;
		
	}
	
	
	
	static void recall(int number) {
		
		if(number!=0) {
			
			number--;
			
			recall(number);
			
		}else {
			System.out.println("结束");
		}
		
		
		
//		return -1;
		
		
	}
	
	
	
	
	

}
