package day11.comprehensive01;

import java.util.Arrays;

//1.实现功能对指定的敏感词汇进行过滤替换，把敏感词过滤成*号输出 
//
//如原句:“窝草，昨晚又停电了!”
//过滤后为:“**，昨晚又停电了!”
//
//分析:
//1，需要存储多个指定的敏感单词; 
//2，针对所有的敏感字都需要判断及过滤; 
//3，敏感字替换; 
//4，替换的*字符和原字符长度相同;


public class TestDemo {
	
	public static void main(String[] args) {
		
		String s1 = "窝草，昨晚又窝草停窝草电窝草了!";
		String keyword = "窝草";
		
		String s2 = returnFilterWord(s1, keyword);
		System.out.println(s2);
		
//		System.out.println(returnWord(s1,new String[] {keyword,"电"}));
//		System.out.println(s1);
		
//		System.out.println(s1.replaceAll("窝草","*"));
//		System.out.println(s1.replaceFirst("窝草", "*"));
		
		
		
	}
	
	static String returnFilterWord(String string,String keyword) {
		
		
//		看来需要用subString,还有字符串拼接.!
		
		//设置for循环
		//记录当前索引
		
		//关键字的长度需要记录下来!
		int keywordLength = keyword.length();
		
		//创建一个SB对象.
		StringBuilder sb = new StringBuilder();
		
		//现在不考虑性能问题,直接整条语句去subString
		
		String s1 = string;
		
		for(int i=0;i<string.length();i++) {
			
			//然后找到索引的话,需要记录!,并且改变i的数值!
			//问题还得记录替换字符串的长度.
			//先找到最邻近的那个索引.
			int lastIndex = s1.indexOf(keyword)+i;
			//然后截取前面符合条件的
			//条件就是当前的索引到符合条件的索引
			
			if(s1.indexOf(keyword)!= -1 ) {	
				//原来这里是可以省略的!
//				if(i==0) {
//
//				}
//				else 
//				{
					//这里是匹配到   '关键字'  前面的那些内容,然后索引操作应该是最后一个+长度-1
					
					sb.append(string.substring(i, lastIndex));
					
//				}
					
				//然后拼接多少个*
				for(int i1=0;i1<=keywordLength-1;i1++) {
					sb.append("*");
				}
				
				i = lastIndex+(keywordLength-1);
				
				//处理完了以后,处理一下准备用于下一个循环的语句,如果索引还没有超过的话
				if(i<=string.length()-1) {
					s1 = string.substring(i+1);
				}
				
			}else {
				//拼接剩下的,然后返回所有拼接字符串的结果
				sb.append(s1);
				
				return sb.toString();
			}
			
			//匹配到的那一个,后面的处理就是,继续去获取当前的索引到最后的字符串就可以了.!
				
		}
		
		return "";
	}



	static String returnWord(String string,String[] keyword) {
		
		String string1 = string;
		
//		尝试使用replace
		for(String i1:keyword) {
			
			if(string1.contains(i1)) {
				String word = "";
				for(int i=0;i<i1.length();i++) {
					word += "*";
				}
				
				string1 = string1.replace(i1,word);
				
			}
			
		}	
		
		
		
		return string1;
		
	}

}