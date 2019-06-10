package day10.practice02;

public class TestFinalMethodSub extends TestFinalMethod {

	
	
	//然后尝试覆写父类的final方法
	public final String name = "kumanxuan";
	//name = "six six six";   报错!
	
	
	public void setName(String name) {
		
//		this.name = name;
		
	}
	
	//报错
	//- Cannot override the final method from TestFinalMethod
	//- overrides 
	public void echoWithFinal1() {
		System.out.println("无法继承!");
	}
	
}
