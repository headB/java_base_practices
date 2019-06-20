package day16集合2.practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//看着扑克还是挺可以的>!

//Collections 是集合的工具类，封装了 Set、List、Map 操作的工具方法，比如拷贝、排序、搜索、比较大 小等。

//11.作业十一
//需求:调用 Arrays 和 Collections 工具类中的常用方法
//asList 方法
//作业目的:了解 Arrays 和 Collections 工具类中的常用方法

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//的确啊,就是,普通的set是可以转换成为  数组的.那么,心在就让数组转换成为List类型啦.!
		
		Integer[] array = {1,3,4,5,6,7};
		
		//然后利用Arrays工具来转换
		List<Integer> list = Arrays.asList(array);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,888,139139);
		
		List<String> list2 = Arrays.asList("A","B","C","D");
		System.out.println(list2);
		
		System.out.println(list1);
		
		System.out.println(list);
		
		//不能增加,也不能减少!.
		//list.add(66);
		
		List<Integer> array1 = new ArrayList<>();
		//用ArrayList创建的list是可以随意增加和减少的!.
		array1.add(4);
		array1.add(5);
		array1.add(6);
		
		
		
		System.out.println(array1);
		
		
		
		
//		按照斗地主游戏的规则，模拟对 54 张扑克牌的洗牌和发牌以及对手中牌排序操作
		
		List<String> colors = new ArrayList<>();
		
		colors.add("♠");
		colors.add("♣");
		colors.add("♥");
		colors.add("♦");
		
		List<String> numbers  = new ArrayList<>();
		//数字 345678910JQKA2
		
		//由于需要添加的数字个数比较多,所以,现在需要其他工具来帮忙快速添加.
		java.util.Collections.addAll(numbers, "A","2","3","4","5","6","7","8","9","10","J","Q","K");
		
		//然后这些扑克牌,需要怎么去组装呢?
		numbers.addAll(numbers);//把 13 张复制成 26 张
		numbers.addAll(numbers);//把 26 张复制成 52 张
		
		//定义 Map，用数字来记录每一张牌
		//每一张,岂不是要结合上面的梅花 阶砖,葵扇,红心
		//每一张牌都是有序号的.
		
		Map<Integer,String> map1 = new HashMap<>();
		
		int i=0;
		for(String number:numbers) {
			
			//的确是两个循环啊.
			for(String color:colors) {
				
				if(i<=51) {
					
					map1.put(i, color+" "+number);
					i++;
				}
				
			}
			
		}
		
		
	
		map1.put(i, "小☻"); i++; map1.put(i, "大☻"); i++;
		
		System.out.println(map1);
		
		//然后现在转换成为普通的数组?
		List<Integer> list11 = new ArrayList<>(map1.keySet());
		System.out.println("现在演示使用Collections工具.!");
		System.out.println(list11);
		java.util.Collections.shuffle(list11);
		//好像这个功能就是简单的打散功能吧?
		System.out.println(list11);
		
		
		//然后再次利用工具来进行数组和map转换.!
		
		//三个玩家和底牌
		List<Integer> player1 = new ArrayList<Integer>(); 
		List<Integer> player2 = new ArrayList<Integer>(); 
		List<Integer> player3 = new ArrayList<Integer>(); 
		List<Integer> end = new ArrayList<Integer>();
		
		//然后对这三个人进行发牌
		
//		现在发牌
		//首先是控制次数,
		for(int i1=0;i1<=53;i1++) {
			
			int index = i1 % 3;
			
			if(i1<51) {
				if(index==0) {
					
					player1.add(list11.get(i1));
					
				}else if (index==1) {
					player2.add(list11.get(i1));
				}else {
					player3.add(list11.get(i1));
				}
			}
			else {
				end.add(list11.get(i1));
			}
			
			
			
		}
		
		//然后查看大家的底牌.
		System.out.println("下面是测试查看大家的底牌");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		
		//然后将大家的底牌都进行一下排序
		java.util.Collections.sort(player1);
		java.util.Collections.sort(player2);
		java.util.Collections.sort(player3);
		
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		
		//排好序,然后就去获取对应的具体牌子的图案.
		
		
		List<String> player1Card = new ArrayList<>();
		List<String> player2Card = new ArrayList<>();
		List<String> player3Card = new ArrayList<>();
		List<String> end1 = new ArrayList<>();
		
		for(Integer card:player1) {
			
			player1Card.add(map1.get(card));
			
		}
		
		for(Integer card:player2) {
			
			player2Card.add(map1.get(card));
			
		}
		
		for(Integer card:player3) {
			
			player3Card.add(map1.get(card));
			
		}
		
		for(Integer card:end) {
			
			end1.add(map1.get(card));
			
		}
		
		System.out.println(player1Card);
		System.out.println(player2Card);
		System.out.println(player3Card);
		System.out.println(end1);
		
		

	}

}
