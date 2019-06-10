package day09.expand02;

public class NetworkOperator {

	private String type;
	
	public NetworkOperator() {
		
	}
	
	public NetworkOperator(String type) {
		this.type = type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void installBroadband(){
		System.out.println("题目要求这里需要懂得如何安装宽带");
	}
	
	public void installCableTV() {
		System.out.println("题目要求我还需要安装有线电视!");
	}

}
