package 尝试出考试题目.代码测试;

/*
目标:
	根据以下信息，定义类创建对象
步骤:
	调用方法
结论:
	格式要记牢
*/
//package work;

public class ExerciseTest2 {

	public static void main(String[] args) {
//		SunWukong exe1 = new SunWukong("孙悟空", 500, "金箍棒", "紧箍咒");
//		exe1.doMaigre();
//		exe1.buddha();
//		exe1.doPilgrimage();
//		exe1.fight();
//		exe1.extDevil();
		ZuBaJie exe2 = new ZuBaJie("猪八戒", 500, "猪八戒的武器");
		exe2.setWife("柳岩");
		ZuBaJie exe22 = new ZuBaJie("猪八戒", 500, "猪八戒的武器","海燕");
		exe2.fight();
		exe2.buddha();
		exe2.doPilgrimage();
		exe2.holding();
		
		exe22.holding();
//		SaHeShang exe3 = new SaHeShang("沙和尚", 500, "沙和尚的武器", "流沙河");
//		exe3.fight();
//		exe3.buddha();
//		exe3.doPilgrimage();
//		exe3.pickUpLuge();
	}
}

