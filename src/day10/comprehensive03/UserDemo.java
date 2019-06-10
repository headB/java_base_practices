package day10.comprehensive03;

public class UserDemo {
	
	public static void main(String[] args) {
		
		//实例化User
//		(2)请利用上述构造器，
//		在 main 方法中实例化网络用户类对象，
//		每创建一个对象，
//		用户 总人数(totalUser)加一，创建
//		
		
		User u1 = new User(1,"beetle","lizhixuan");
		
		System.out.println("当前已经添加了 " + User.getUserCount() + " 个人");
		
		User u2 = new User(2,"kumanxuan","lizhixuan123");
		
		User u3 = new User(3,"lizhixuan","lizhixuan123");
		
		System.out.println("当前已经添加了 " + User.getUserCount() + " 个人");
		
	}

}
