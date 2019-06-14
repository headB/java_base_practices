package day09.expand01;

public class Taxi extends Seater implements IRunable {

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("出租车开始跑了;;;;这是一台用兰博基尼做的出租车!");
		super.name = "我是大众,香港叫复士,那就是了";
		System.out.println(this.name);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		this.run();
	}
	
	

	
	
}
