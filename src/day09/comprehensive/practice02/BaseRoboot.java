package day09.comprehensive.practice02;

public  class BaseRoboot{

	
	//名字
	private String name;
	//型号
	private String model;
	
	public BaseRoboot() {
		
	}

	
	public BaseRoboot(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("作为机器人,我们都是会走路的!!!还会跑路!!!");
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

}
