package day15集合.practice05;

import java.util.LinkedList;

//5. 作业五:
//需求:调用 LinkedList 类的常用方法
// void addFirst(Object e) 将指定元素插入此列表的开头。
// void addLast(Object e) 将指定元素添加到此列表的结尾。
//  Object getFirst() 返回此列表的第一个元素。
// Object getLast() 返回此列表的最后一个元素。
// Object removeFirst() 移除并返回此列表的第一个元素。 
// Object removeLast() 移除并返回此列表的最后一个元素。

public class DemoTest {

	public static void main(String[] args) {
		
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add("six");
		l1.add("kumanxuan");
		l1.add("cctv");
		
		l1.addFirst("CCTVB");
		l1.addLast("CCTV");
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		l1.addFirst("A");
		l1.add("A");
		l1.add("B");
		
		
		
		l2.add("A");
		l2.add("B");
		
		System.out.println(l1);
		
		l1.addAll(l2);
		l1.removeFirst();
		System.out.println(l1);
		
		//然后执行删除操作
		l1.removeAll(l2);
		
		System.out.println(l1);
		
		
		
		
		
		
		
		System.out.println("===========================");
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		Node n1 = new Node("cctv");
		Node n2 = new Node("ATV");
		Node n3 = new Node("CCTVB");
		
		//创建LinkedList
		MyLinkedList m1 = new MyLinkedList();
		
		m1.add(n1);
		m1.add(n2);
		m1.add(n3);
		
		System.out.println(n1.next.ele);
		System.out.println(n2.next.ele);
		
		System.out.println(n2.prev.ele);
		
		
		
//		System.out.println(n2.next);
//		
//		System.out.println(m1);
		

	}

}
