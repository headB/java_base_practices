package day07;

public class GodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//然后分别将三个徒弟都实例化一次
		
		//孙悟空
		God monkey = new God();
		monkey.setName("孙悟空-张卫健");
		System.out.println(monkey.getName());
		monkey.buddha();
		monkey.doMaigre();
		monkey.doPilgrimage();
		//孙悟空的特殊招式
		monkey.extDevil();
		
		System.out.println();
		
		//沙增  沙僧
		God monk = new God();
		monk.setName("沙僧-XXX唔记得了");
		System.out.println(monk.getName());
		monk.buddha();
		monk.doMaigre();
		monk.doPilgrimage();
		//特殊方法,特殊招式
		monk.pickUpLuge();
		
		System.out.println();
		
		//猪八戒--黎耀祥
		God pig = new God();
		pig.setName("猪八戒-黎耀祥");
		System.out.println(pig.getName());
		monk.buddha();
		monk.doMaigre();
		monk.doPilgrimage();
		//猪八戒的特殊招式
		monk.holdHorse();

	}

}
