package day08.override_demo;

public class Bird {
	
//	private String name;
	
	
	public Bird() {
		
	}
	
	public void fly() {
		
		System.out.println("我是一只小鸟,我会飞!");
		
	}
	
	
	//测试更加高级的方法覆盖!
	
	public Bird returnIntValue(int whatEver) {
		
		return new Bird();
		
	}
	
	
	

}
