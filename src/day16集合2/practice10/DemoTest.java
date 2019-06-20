package day16集合2.practice10;

import java.util.HashMap;
import java.util.Map;

//10.作业十 
//需求:统计一个字符串中每个字符出现次数

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//??黑人问号??
		
		String string = "ABABBBBBAAAaskjasldkjsdlfjalkfjAAAAsdjfhsdlfAA";
		
		//然后的确需要将字符串转换成为char数组.
		char[] string1 = string.toCharArray();
		System.out.println(string1);
		
//		int count = 0;
//		for(char name:string1) {
//			
//			if(name=='A') {
//				count++;
//			}
//			
//		}
//		
//		System.out.println(count);
		
		//设置一个新的HashMap
		
		Map<Character,Integer> map = new HashMap<>();
		//用来保存重复的字符串?,各种字符串的记录啦.!不是单个
		
		for(char name:string1) {
			
			//先判断这个字符是否出现过
			if(map.containsKey(name)) {
				
				map.put(name,map.get(name)+1);
				
			}else {
				
				map.put(name, 1);
				
			}
			
			
		}
		
		System.out.println(map);
		
		//测试红黑  TreeMap  TreeHash
		// 
		

	}

}
