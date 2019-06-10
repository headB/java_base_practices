package day09.expand01;

public class Airliner extends Seater implements IFlyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞机开始飞天了飞啊飞,不过呢,我觉得,boeing和airbus你总得选择其中一个飞吧?");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		this.fly();
	}

}
