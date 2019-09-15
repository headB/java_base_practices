package 尝试出考试题目.代码测试;

/*
目标:
	根据以下信息，定义类创建对象
步骤:
	继承Exercise2类
	修改参数
结论:
	格式要记牢
*/
//package work;

public class ZuBaJie extends Exercise2 {
	private String name;
	private int age;
	private String weapon;
	private String wife;
	
	public ZuBaJie(String name, int age, String weapon,String wife) {
		super(name, age, weapon);
		this.wife = wife;
		if (this.wife == "柳岩") {
			System.out.println("太好了");
		}
	}

	public synchronized String getWife() {
		return wife;
	}

	public synchronized void setWife(String wife) {
		this.wife = wife;
	}

	public ZuBaJie() {
		super();
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized int getAge() {
		return age;
	}

	public synchronized void setAge(int age) {
		this.age = age;
	}

	public synchronized String getWeapon() {
		return weapon;
	}

	public synchronized void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void holding() {
		System.out.println(super.getname() + "牵马"+"带着"+ wife);
	}

	public ZuBaJie(String name, int age, String weapon) {
		super(name, age, weapon);
	}

	public ZuBaJie(String wife) {
		this.wife = wife;
	}

}
