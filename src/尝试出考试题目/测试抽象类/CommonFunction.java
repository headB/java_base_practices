package 尝试出考试题目.测试抽象类;

public abstract class CommonFunction implements IRunnable,ISpeakable {
	
	//定义一些常用的普通变量.
	public String name;
	public int age;
	
	public CommonFunction(){
		
		System.out.println("I am 抽象类!");
		System.out.println("可能我的作用仅仅是作用于初始化参数的了.!");
		
	}
	
	public void run(){
		
		System.out.println("我具备跑步功能!");
		
	}
	
	public void speak() {
		System.out.println("我具备讲话功能!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
