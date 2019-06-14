package day13异常.practice04;

public class Father {
	
	private String name;
	private int age;
	
	public Father() {
		System.out.println("我是没有操作的公共参数构造器,父类的.!");
	}
	
	//公共无参数构造器
	public Father(String word) {
		
		System.out.println("测试父类方法有没有被覆盖!");
	}

}
