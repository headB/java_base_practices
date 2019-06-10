package day08.expand.expand01;

//定义一个网络用户类（User），
//包含用户ID(id)、
//用户密码（password）、
//email地址（emailAdrr）
//
//三个私有化成员变量，

public class User {
	
	private int id;
	private String password;
	private String emailAddr;
	
	
	//javabean规范
	
	//定义无参数构造器
	public User() {
		
	}
	
	
	//定义指定参数构造器
	public User(int id,String password) {
		this.id = id;
		this.password = password;
		
		//然后email初始化一下
		
		this.emailAddr = id+"@gameschool.com";
	}
	
	//覆写一下toString方法
	public String toString() {
		
		return "用户ID是->"+this.id+" ,email地址是" + this.emailAddr;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	
	
}
