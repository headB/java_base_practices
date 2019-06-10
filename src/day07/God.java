package day07;


//需求

//自己的想法就是,其实,所有的东西都是可以先写上,为什么呢,因为,根据后面子类的特定,
//他们好像是自己无法添加新的属性的.
//这样吧,我去想想,就是面向接口编程的时候,我应该是怎么处理吧.
//父类有的功能,但是子类可能更加丰富,嗷嗷,我想起来了,就是,继承啊,继承了父类,然后自己
//自己继续添加新的功能啊~

//字段：name，age，武器(weapon)，紧箍咒(formula)
//方法：
//吃斋(doMaigre)，
//念佛(buddha)，
//取经(doPilgrimage)，
//战斗(fight),

public class God {
	
	
	//字段：name，age，武器(weapon)，
	private String name;
	private int age;
	private String weapon;
//	private String formula;
	
	//还有各种人的字段,专属字段
	
	//孙悟空
	//紧箍咒(formula)
	private String formula;
	
	//猪八戒
	private String wife;
	
	//沙增
	private String sandRiver;
	

	//无参数构造器
	God(){
		
	}
	

	//然后就是各种getter setter操作了
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public String getFormula() {
		return formula;
	}


	public void setFormula(String formula) {
		this.formula = formula;
	}


	public String getWife() {
		return wife;
	}


	public void setWife(String wife) {
		this.wife = wife;
	}


	public String getSandRiver() {
		return sandRiver;
	}


	public void setSandRiver(String sandRiver) {
		this.sandRiver = sandRiver;
	}

	//吃斋(doMaigre)，
		public void doMaigre() {
			System.out.println("吃斋(doMaigre)");
		}

	//念佛(buddha)，
	public void buddha() {
		System.out.println("念佛-念佛-念佛");
		
	}
	
	//取经(doPilgrimage)，
	public void doPilgrimage() {
		System.out.println("取经-取经-取经");
	}
	
	
	//战斗(fight),
	public void fight() {
		System.out.println("战斗-战斗-战斗");
	}
	
	
	//下面都是个性化的属性
	
	
	//孙悟空的降魔
	public void extDevil() {
		System.out.println("孙悟空的--降魔-降魔-降魔");
	}
	
	//猪八戒的骑马
	public void holdHorse() {
		System.out.println("猪八戒的骑马");
	}
	
	//沙增的拿行李
	public void pickUpLuge() {
		System.out.println("沙增的拿行李");
	}
	
	
	

}
