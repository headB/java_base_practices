package day08.override_demo;

public class Ostrich extends Bird {

	
	
	
	
	public Ostrich() {
		
	}
	
	//然后覆盖父类方法
	public void fly() {
		System.out.println("我虽然是属于鸟类,但是我是鸵鸟,所以我不会飞!");
	}
	
	
	//OK !还有这玩法,就是,这里返回的数据类型,可以返回子类的.那么,用Object也是无敌的啦?
	//不行,Object是大家的父类啊,所以呢,是冇办法写Object!
	public Bird returnIntValue(int whatEver) {
		
		return new Ostrich();
		
	}
	
}
