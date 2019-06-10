package day08.extend_demo;

public class Employee extends Person {
	
	
	private String hiredDate;
	
	public void work() {
		System.out.println("我正在工作中!");
	}
	
	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}
	
	public String getHiredDate() {
		return this.hiredDate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
