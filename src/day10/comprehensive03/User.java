package day10.comprehensive03;

//定义一个网络用户类(User)，
//包含用户 id(id)、
//用户名(username)
//用户密码(password)、 
//email 地址(emailAdrr)
//四个私有化成员变量和一个属于类的用户总人数(totalUser)，

public class User {
	
	private int id;
	private String username;
	private String password;
	private String emailAdrr;
	private static int totalUser;
	
	
	/*
	 * (1)请定义一个含有用户 id(id)、 用户名(username) 用户密码(password) 三个参数的构 造器，
	 *  完成四个实例成员变量的初始化，
	 * 其中 email 地址(emailAdrr)是用户名加上字符串 “@gameschool.com”。
	 */
	
	public User() {
		
	}
	
	public User(int id,String username,String password) {
		this.id = id;
		this.username = username;
		this.password = password;
		totalUser++;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setEmailAddr (String emailAdrr) {
		
		this.emailAdrr = emailAdrr;
		
	}
	
	public String getEmailAddr() {
		return this.emailAdrr;
	}
	
	public static int getUserCount() {
		return totalUser;
	}
	
}
