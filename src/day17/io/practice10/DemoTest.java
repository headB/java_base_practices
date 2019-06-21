package day17.io.practice10;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//二、综合练习
//1. 综合一: 
//1、请根据以下描述完成操作。
//1)请用 IO 的知识点，获取文件的内容。文件内容如下:
//2)创建一个 Map 集合将统计文件 D:/calcCharNum.txt 中各个字母出现次数 。
//3)遍历 Map 集合并按照以下格式打印，格式如下:“A(2),B(5),C(4),D(6),E(3),F(7)”， 
//括号内代表字符出现次数。


public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
//		Map<Character,Integer> map = new HashMap<>();
		Map<Character,Integer> map = new TreeMap<>();
		
		//然后批量读取文件.
		FileInputStream f1 = new FileInputStream("/Users/lizhixuan/Downloads/kumanxuan/six.txt");
		byte[] b1 = new byte[30];
		int i=0;
		while(((i=f1.read(b1))!=-1)) {
			
			//那么,需要转换成为char数组吧.!
			char[] c1 = new String(b1).toCharArray();
			for(char c2:c1) {
				
				if( (65<=c2 && c2<=90) || (97<=c2 && c2<=122)) {
					if(map.containsKey(c2)) {
						map.put(c2,map.get(c2)+1);
					}else {
						map.put(c2,1);
					}
				}
				
			}
			
			
		}
		
		System.out.println(map);
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.print(entry.getKey()+"(");
			System.out.print(entry.getValue()+"), ");
		}
		
	}

}
