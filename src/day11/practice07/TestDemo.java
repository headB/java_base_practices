package day11.practice07;

//7. 第七题
//需求:使用 StringBuilder 拼接字符串 作业目的:熟练操作 StringBuilder 类中的常用方法 

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuilder 有什么用呢?我真的忘记了啦?我记得好像就是可以拼接字符串而不损失性能?
		
		
		//自己写一个for循环来测试一下是否真的比较慢!
		
		//先用buffer试试
//		StringBuffer sb1 = new StringBuffer();
//		
//		for(int i=0;i<=10000;i++) {
//			
//			sb1.append("six");
//			
//		}
//		System.out.println(sb1);
		
		
		//然后就是StringBuilder
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0;i<=10;i++) {
			sb2.append("six");
		}
		
		System.out.println(sb2);
		System.out.println(sb2.toString());
		
		

	}

}
