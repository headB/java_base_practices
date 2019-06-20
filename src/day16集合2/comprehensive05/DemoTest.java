package day16集合2.comprehensive05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//5.综合五
//已知 java 学院教课内容安排如下
//

//老师 stef   will       neld     hesj    bunny   hhaiy
//课程
//     p2p  javaWeb   springmvc   wms    javaWeb  javaSe
//
//
//
//要求:
//1:使用 Map， 以老师名字为 key 课程名为 value， 完成课程安排 
//2:添加一个新老师 dafei 教 jdbc
//3:hhaiy 改为教 javaWeb
//4:输出所有老师，以及老师教授课程
//5:查出所有教 javaWeb 的老师

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,String> map = new HashMap<>();
		map.put("stef","p2p");
		map.put("will","javaWeb");
		map.put("neld","springmvc");
		map.put("hesj","wms");
		map.put("bunny", "javaWeb");
		map.put("hhaiy", "javase");
		
		System.out.println(map);
		
		map.put("dafei","jdbc");
		
		map.put("hhaiy","javaWeb");
		
		System.out.println(map);
		
		for(Entry<String, String> o1:map.entrySet()) {
			
//			System.out.println(o1.getKey());
//			System.out.println(o1.getValue());
			if(!"javaWeb".equals(o1.getValue())) {
				
				continue;
			}
			
			System.out.format(" %s 教的是 -> %s \n",o1.getKey(),o1.getValue());
			
		}
		
		

	}

}
