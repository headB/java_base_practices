package day16集合2.practice08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//8. 作业八
//需求:调用 HashMap 的常用方法 添加操作
// boolean put(Objectkey,Objectvalue):存储一个键值对到Map中
// boolean putAll(Map m):把 m 中的所有键值对添加到当前 Map 中




//作业目的:掌握 HashMap 常用方法的使用

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Object> map = new HashMap<>();
		
		Map<String,Object> map1 = new HashMap<>();
		
		//嗯嗯,不用自己去设置算法
		map.put("name", "kumanxuan");
		map.put("age",18);
		map.put("score",100);
		map.put("class", "3年5班周杰伦");
		map.put("昆凌", "有两个儿子?");
		
		map1.put("class33", "3年5班周杰伦");
		map1.put("昆凌22", "有两个儿子?");
		
		
		System.out.println(map);
		
		System.out.println("输出有多少个 "+map.size());
		
		
		//查询
		System.out.println(map.get("age")+ " 查询age");
		
		
		
		
		
//		删除操作
//		 Object remove(Object key):从Map中删除指定key的键值对，并返回被删除key
//		对应的 value

		System.out.println(map.remove("昆凌")+" 这个位置居然是有返回值的!");
		
		System.out.println(map);
		
		


//		修改操作
//		 无专门的方法，可以调用put方法，存储相同key，不同value的键值对，可以覆 盖原来的。

		map.put("class","杰伦说我的地盘听我的!");
		
		System.out.println(map);
		
//		查询操作
//		  int size():返回当前Map中键值对个数
		System.out.println(map.size());
//		  boolean isEmpty():判断当前Map中键值对个数是否为0.
		System.out.println(map.isEmpty()+" 判断是否为空!");
//		  Object get(Object key):返回Map中指定key对应的value值，如果不存在该key，
//		返回 null
		System.out.println(map.get("sx"));
//		  boolean containsKey(Object key):判断Map中是否包含指定key
		System.out.println(map.containsKey("class"));
		
//		  boolean containsValue(Object value):判断Map中是否包含指定value
		System.out.println(map.containsValue("杰伦说我的地盘听我的!"));
		System.out.println(map.containsValue("杰伦说我的")+" 测试部分内容会不会进行匹配");
		
//		  SetkeySet():返回Map中所有key所组成的Set集合
		System.out.println(map.keySet());
//		  Collection values():返回Map中所有value所组成的Collection集合
		System.out.println(map.values());
//		  Set<Entry>entrySet():返回Map中所有键值对所组成的Set集合 注意，标红的是重度使用的方法。
		System.out.println(map.entrySet());
		
		Set<Entry<String,Object>> set  = map.entrySet();
//		Object[] testArray = set.toArray();
//		for(Object name:testArray) {
//			
//			System.out.println(name);
//			
//		}
		
//		for(Entry name:set) {
		for(Entry name:map.entrySet()) {
			
			System.out.println("this key is "+name.getKey());
			System.out.println("this value is "+name.getValue());
			
		}
		
		System.out.println("========利用循环去遍历keySet这个容器=============");
		
		for(String name:map.keySet()) {
			System.out.println(name);
		}
		
		System.out.println("========利用循环去遍历value这个容器=============");
		for(Object name:map.values()) {
			
			if(name instanceof String) {
				
				System.out.println("我是String ");
				
			};
			
			if(name instanceof Integer) {
				
				System.out.println("我是Integer ");
				
			};
			
			
			System.out.println(name);
			
		}
		
		System.out.println(map);
		map.putAll(map1);
		System.out.println(map);
		
		//创建hashmap来观察key的排序
		Map setTest = new HashMap<>();
		setTest.put("v", "B");
		setTest.put("a", "B");
		setTest.put("b", "B");
		setTest.put("c", "B");
		
		System.out.println(setTest);
		
		
		//下面是测试treeMap,其实就是添加了一下算法.!
		Map map3 = new TreeMap<>(map);
		System.out.println(map3);
		

	}

}
