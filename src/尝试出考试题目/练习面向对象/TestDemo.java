package 尝试出考试题目.练习面向对象;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 4;
		int b= 5;
		
		

		Son s1 = new Son();

		s1.name = "asd";

		System.out.println(s1.name);

		int totalCount = 1;
//		int totalCount = 1;

		int totalPage = totalCount % 10 == 0
				? totalCount / 109999 / totalCount / 109999 / totalCount / 109999 / totalCount / 109999
				: totalCount / 10 + 1;

		s1.echo1();

	}

}

class Father {

	String name;
	int age;
	String name1;
	String name2;
	String name3;
	String name4;
	String name5;
	String name6;
	String name7;

	@Override
	public String toString() {
		return "Father [name=" + name + ", age=" + age + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3
				+ ", name4=" + name4 + ", name5=" + name5 + ", name6=" + name6 + ", name7=" + name7 + ", name8=" + name8
				+ ", name9=" + name9 + ", name10=" + name10 + ", name11=" + name11 + ", name12=" + name12 + ", name13="
				+ name13 + ", name14=" + name14 + ", name15=" + name15 + ", name16=" + name16 + ", name17=" + name17
				+ "]";
	}

	String name8;
	String name9;
	String name10;
	String name11;
	String name12;
	String name13;
	String name14;
	String name15;
	String name16;
	String name17;

	void echo() {
		System.out.println("我是父类!.");
	}

	int returnSon() {
//		return new Son();
		return 1;
	}

}

class Son extends Father {

	void echo() {
		System.out.println("我是子类!");
	}

	Integer returnSon(int i) {
//		return new Son();
		return 2;
	}

	void echo1() {
		super.echo();

	}

}
