package day12.practice02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//2. 第二题 RandomDemo.java 
//需求:使用随机数 Random 类，通过 Random 类获取伪随机数
//作业目的:了解 Random 的作用，能够查 API 调用方法即可

public class TestDemo {
	
	public static void main(String[] args) {
		
		//OK !去试用一下random先.!
		
		//恩恩,原来Math的random,就是用Random底层的方法.
		
		Random r1 = new Random();
		
		//然后就是,哎呀,这个比起那个,Math的random要更加容易产生100以内的随机数啊~.
		System.out.println(r1.nextInt(100));
		
		// 随机获取 A~Z 之间的 5 个字母组成的字符串
		
		//创建SB来做字符串的拼接.
		
		StringBuilder sb1 = new StringBuilder();
		
		//然后定义char,然后输出随机数的范围.
		
		char c1;
		
		for(int i=0;i<5;i++) {
			
			//在java里面,不能一步到位的话,那么就拆分多不到位就可以了.!
			//步骤都是设置一个最小值,然后就是最大值,类似这样子.!
			c1 = (char)(65 + r1.nextInt(25));
			sb1.append(c1);
			
		}
		
		String str1 = "six six six!";
		System.out.println("this is charAt -> "+str1.charAt(4)+" ");
		
		//可以在一堆字符里面随机挑一堆去组成新的随机数.就好像验证码一样.!
		String randomCode = "AFGHJHJVIUOUYIghjkhjyugihjkhb4657867754423";
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0;i<8;i++) {
			
			sb2.append(randomCode.charAt(r1.nextInt(randomCode.length())));
			
		}
		
		System.out.println("这里是随机产生的验证码!-> "+sb2);
		
		System.out.println(sb1);
		
		//使用其他的方法去产生随机数
		ThreadLocalRandom t1 = ThreadLocalRandom.current();
		System.out.println(t1.nextInt(1, 30));
		
		//然后我这里测试一个伪随机数!
		
		
		//下面这些随机数都是采用想用的因子,所以会产生相同的随机数.!
		Random r11 = new Random(10);
		System.out.println(r11.nextInt());
		
		Random r12 = new Random(10);
		
		System.out.println(r12.nextInt());
		
		
		
	}

}
