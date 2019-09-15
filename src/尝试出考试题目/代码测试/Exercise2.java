package 尝试出考试题目.代码测试;

/*
目标:
	根据以下信息，定义类创建对象
步骤:
	创建方法
结论:
	格式要记牢
*/
//package work;

public class Exercise2 {
	private String name;
	private int age;
	private String weapon;

	public Exercise2() {

	}

	public Exercise2(String name, int age, String weapon) {
		this.name = name;
		this.age = age;
		this.weapon = weapon;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}

	public void setweapon(String weapon) {
		this.weapon = weapon;
	}

	public String getweapon() {
		return weapon;
	}

	public void doMaigre() {
		System.out.println(name + "吃斋");
	}

	public void buddha() {
		System.out.println(name + "念佛");
	}

	public void doPilgrimage() {
		System.out.println(name + "取经");
	}

	public void fight() {
		System.out.println(name + "拿着" + weapon + "战斗");
	}
}

