package day15集合.practice02;

import java.util.Arrays;

//需求:模拟 ArrayList 类，要求能够添加任何类型的对象。
//作业目的:通过模拟 ArrayList 类加深对数组算法的理解。

public class MyArrayList {
	
	public static void main(String[] args) {
		
		MyArrayList d1 = new MyArrayList();
		d1.add(11);
		d1.add("22");
		d1.add(33);
		d1.add("CCTV");
		d1.add(55);
		d1.add("TVB");
		d1.add("ATV");
		
		System.out.println(d1);
		
		System.out.println(Arrays.toString(d1.players));
		
		System.out.println("查询");
		System.out.println(d1.get(3));
		
		System.out.println("改");
		d1.set(3, 666);
		System.out.println(d1.get(3));
		System.out.println("改完后面的数值!");
		System.out.println(d1.get(3));
		
		System.out.println("删除");
		d1.remove(3);
		
//		System.out.println("查询第四个元素");
		
		
		
		System.out.println(d1);
		System.out.println(Arrays.toString(d1.players));
		
	}
	
	//玩家
	private Object[] players = null;
	
	//保存球场上面的人数
	private int size = 0;
	
	//自定义初始化球员
	//黑人问号?为什么需要重新用方法去初始化数值????,,不好意思,这里是构造器来的!
	public MyArrayList(int initValue) {
		//数组的长度
		if(initValue<0) {
			throw new RuntimeException("初始化的时候,数值不能为0");
		}
		
		players = new Object[initValue];
		
	}
	
	//初始化空的构造器
	public MyArrayList() {
		this(10);
	}
	
	
	
	
	//好像就是日常的增删改查.!
	
	//然后需要打印
	public String toString() {
		
		if(players==null) {
			
			return "null";
			
		}
		
		
		if(this.size==0) {
			return "为空";
		}
		
		
		//然后就是组织数组
		StringBuilder sb1 = new StringBuilder(40);
		
		sb1.append("[ ");
		
		for(int i=0;i<size;i++) {
			
			sb1.append(players[i]);
			
			if(i==size-1) {
				sb1.append(" ]");
			}else {
				sb1.append(" , ");
			}
			
		}
		
		
		
		return sb1.toString();
		
	}
	
	
	//保存操作,增加球员!
	public void add(Object players) {
		
		if(size==this.players.length) {
			
			//使用Arrays去添加操作.
			this.players = Arrays.copyOf(this.players, this.players.length*2);
			
			
			
		}
			this.players[size] = players;
			size++;
		
	}
	
	
	//查询   操作数组
	public Object get(int index) {
		
		//估计是检查范围
		if(index >=0 && index<this.players.length) {
			return this.players[index];
		}
		return -1;
		
	}
	//修改操作  操作数组
	public void set(int index,int value) {
		
		if(index >=0 && index < this.size) {
			
			this.players[index] = value;
			
		}else {
			System.out.println("操作错误!");
		}
	}

	
	//删除操作 操作数组   //把目标数组删除,其实就是,把后面的数据都往前面复制.
	public void remove(int index) {
		
		if(index >=0 && index < this.size) {
			
			for(int i=index;i+1<this.size;i++) {
				
				this.players[i] = this.players[i+1];
				
			}
			
			this.players[this.size-1] = null;
			this.size--;
			
			
		}else {
			System.out.println("操作异常!");
		}
		
	}
	
}
