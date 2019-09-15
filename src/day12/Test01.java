package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OK !搞掂了,差点就怀疑人生了.!
//		StringSum("xLAKSJDLIDVNIUdlkncoaeufaoihqeoiaaaahsjknzzx");
//
//		StringSumArray("xLAKSJDLIDVNIUdlkncoaeufaoihqeoiaaaahsjknzzx");

//		System.out.format("six I am six!\n");
		
		
		StringSumMap("xLAKSJDLIDVNIUdlkncoaeufaoihqeoiaaaahsjknzzx");
		
	}
	
	static void StringSumMap(String s1) {
		
		//利用map来统计一个字符串里面各字符出现次数.
		
		Map<Character, Integer> h1 = new HashMap<>();
		
		char[] x1 = s1.toCharArray();
		
		for(char ele:x1) {
			
			if(h1.containsKey(ele)) {
				
				h1.put(ele,h1.get(ele).intValue()+1);
				
			}else {
				h1.put(ele, 1);
			}
			
		}
		
		//然后遍历map,输出结果.
		
		for(Entry<Character, Integer> e:h1.entrySet()) {
			
			char x = e.getKey();
			int y = e.getValue();
			
			System.out.format("%s的出现次数是%s次\n",x,y);
			
			
		}
		
		
	}

	static void StringSum(String s1) {

		// 利用replace去替换关键字,然后减去长度.

		String s2 = s1;

		// 循环字符串的长度,每次都是取第一个字符串的第一个字符.然后替换.

		for (int i = 0; i < s2.length(); i=0) {

			// 记录替换第一次的长度.
			int oldLength = s2.length();

			// 定义第一个字符
			char x = s2.charAt(0);

			// 使用replace
			String s3 = s2.replaceAll(x + "", "");
//			System.out.format(s3+"\n");

			// 出现重复的字符数量.
			int num = s2.length() - s3.length();

			// 输出相关的信息

			System.out.format("%s字符出现的次数是%s次\n", x, num);

			s2 = s3;

		}

	}

	static void StringSumArray(String s1) {

		char[] s2 = s1.toCharArray();
		char[] s22 = new char[s2.length];

		if (s1.length() <= 1) {
			System.out.println("数组为空或者长度为1,没有统计的意义的!!");
			return;
		}
//		s22[0] = s2[0];

		int s22Index = 0;

		for (int i = 0; i < s1.length(); i++) {

			// 每次首先检查是否出现在s22数组里面的元素,s22表示已经检查过了的!.
			boolean repeat = false;

			for (char ele : s22) {
//				经过查询,得知,这个地方是可以无所顾忌了,因为呢,这里面的初始值是没有null的!.

				if (s2[i] == ele) {
					repeat = true;
					break;
				}

			}

			if (repeat == true) {
				continue;
			}

			// 自己当前默认是1,数量
			int count = 1;

			// 然后开始匹配自己后面的!
			for (int x = i + 1; x < s1.length(); x++) {

				if (s2[i] == s2[x]) {
					count++;

				}

			}

			// 然后输出统计结果
			System.out.format("%s 字符出现了 %s 次\n", s2[i], count);

			// 然后把结果添加到char数组s22里面.
			s22[s22Index++] = s2[i];

		}

	}

}
