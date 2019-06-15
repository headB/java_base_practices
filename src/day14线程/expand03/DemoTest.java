package day14线程.expand03;

//3、定义两个类，一个 Person 类，一个 Gun 类。 
//Gun 里面有一个弹夹(int 类的数组)初始容量为 5，
//还有一个装子弹的方法 push，打出子弹的方法 pop。
//Person 
//类有一个实例方法 shoot 方法，调用 Gun 中 方法 pop，
//请用代码模拟一个人开枪射击的过程，装填子弹（装满了就不能再装填），
//射击（没子弹不能射击），先装进的子弹先射击出去。

public class DemoTest {
	
	public static void main(String[] args) {
		
		Gun gun = new Gun();
		
		Person p1 = new Person(gun);
		
		new Thread(p1).start();
		new Thread(p1).start();
		
	}

}
