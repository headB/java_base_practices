package day10.practice02;

final public class Super  {
	
	private String name;
	public final String FIX_VAR = "固定变量,常量!123";
	public static final String FIX_VAR1 = "固定变量固定的类变量,static+final,常量!456";
	public static String FIX_WITHOUT_FINAL = "我是static定义的,类变量,但是我并不是常量啊~"; 
	
	void echo() {
		System.out.println("Super的echo!");
	}
	
	void print(final String word) {
		System.out.println(word);
		//word = "4444";  这个地方报错,为什么,因为,这里设置了局部变量不能再次设置数值!
		System.out.println(word);
	}
	
	public void setName(String name) {
		this.name = name;
	}

}



//class SpuserSub extends Super {
//这里报错了,无法继承.

class SpuserSub  {
	
	void echo() {
		System.out.println("six six six!");
	}
	
}





