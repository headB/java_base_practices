package day14线程.expand03;

public class Person implements Runnable{
	
	private Gun gun;
	
	public Person(Gun gun) {
		this.gun = gun;
	}
	
	void shoot() {
		gun.pop();
	}
	
	public void run() {
		
		while(gun.getClip()>=1) {
			shoot();
		}
		
		
	}

}
