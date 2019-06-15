package day14线程.comprehensive03;



public class Programmer {

	private int netInCome;
	
	void eat(int money) {
		this.netInCome -= money;
	}
	
	void payRent(int money) {
		this.netInCome -= money;
	}
	
	void seeMovie(int money) {
		this.netInCome -= money;
	}
	
	void setNetInCome(int money) {
		this.netInCome = money;
	}
	
	int getNetInCome() {
		return this.netInCome;
	}
	
	
	
}
