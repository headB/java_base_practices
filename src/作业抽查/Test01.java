//asdasd

package 作业抽查;

public  class Test01 {

	public static void main(String[] args) {
//		int result = getCount(100, 2, 1, 3);
//		System.out.println(result);
		
		System.out.println(test1(4));
		
		
		
		
	}
	

	
	static int test1(int n) {
		
		int sum=0;
		if (n > 1 ) {
			
			for(int i=2;i<=n;i++) {
				
				sum += (i-1)*i;
				
			}
			
			return sum;
		}
		else {
			return -1;
		}
	}
	
	Object test() {
		
		return -1;
		
	}

	 static  int getCount(int num, int a, int b, int c) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				continue;
			}
			int temp = i;
			boolean contain = true;
			while (temp != 0 && contain) {
				int y = temp % 10;
				if (y == a || y == b || y == c) {
					temp = i / 10;
				} else {
					contain = false;
				}
				if (contain) {
					count++;
				}
			}

		}
		return count;
	}
}


abstract class Test001{
	
	Test001(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
}

class Test002 extends Test001{

	Test002(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	
}

abstract class Tt{
	
	abstract void test(int i);
	
}

class T1 extends Tt{

	@Override
	void test(int i) {
		// TODO Auto-generated method stub
		
	}
	
	void test(double i) {
		// TODO Auto-generated method stub
		
	}
	
}
