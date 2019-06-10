package day12.practice03;

import java.util.UUID;

//3. 第三题 UUIDDemo.java
//需求:
// 使用随机数UUID类，通过UUID类获取随机数
// 通过UUID类，获取验证码
//作业目的:掌握 UUID 获取随机数

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		UUID 表示通用唯一标识符 (Universally Unique Identifier) ，
//		其算法通过电脑的网卡、当地时间、 随机数等组合而成，优点是真实的唯一性，缺点是字符串太长了。
		
		String uuid1 = UUID.randomUUID().toString();
		System.out.println("打印UUID的随机数-> "+uuid1);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(uuid1.substring(0,8));
		System.out.println("截取获取随机数-> "+sb1);
		
		
		//将随机数转换成为大写
		System.out.println(sb1.toString().toUpperCase());

	}

}
