package day08.comprehensive.practice01;


//这是一个抽象类也好,父类也好.!


//继承

//下面是父类,也就是唐三藏的徒弟,大家拥有的模板

//字段：name，age，武器(weapon)，紧箍咒(formula)
//方法：吃斋(doMaigre)，
//念佛(buddha)，
//取经(doPilgrimage)，
//战斗(fight), 


public class Prentice {

	private String name;
	private int age;
	private String weapon;
	
	public Prentice() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
	
	//覆盖toString方法.
	public String toString() {
		
		//返回本个徒弟应该有的属性.
		String s1 = "[ name->" + name +" ,age->" +age + ",weapon->" + weapon + "]";
		
		return s1;
	}
	
	//然后是徒弟的基本功
	//方法：吃斋(doMaigre)，
	//念佛(buddha)，
	//取经(doPilgrimage)，
	//战斗(fight), 
	
	public void doMaigre() {
		System.out.println("吃斋(doMaigre)，");
	}
	
	public void buddha() {
		System.out.println("念佛(buddha)，");
	}
	
	public void doPilgrimage() {
		System.out.println("取经(doPilgrimage)，");
	}
	
	public void fight() {
		System.out.println("战斗(fight), ");
	}
	
	public void extDevil() {
		System.out.println("我会降魔!");
	}
	
	public void holdHorse() {
		System.out.println("我在牵马!");
	}
	
	public void pickUpLuge() {
		System.out.println("拿行李");
	}
	
	
	
}
