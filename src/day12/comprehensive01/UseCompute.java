package day12.comprehensive01;

public class UseCompute {
	
	//的确这里是体验多态啊,传递一个算法的类的接口进来,然后就可以进行操作了.
	//但是明明,直接用别的类可以完成的事,为什么一定需要用到这里呢?
	
	public void useCom(ICompute com, int num1,int num2) {
		
		int res = com.computer(num1, num2);
		System.out.println(res);
		
	}

}
