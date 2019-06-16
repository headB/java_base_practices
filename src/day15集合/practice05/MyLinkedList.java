package day15集合.practice05;

public class MyLinkedList {
	
	@Override
	public String toString() {
		return "MyLinkedList [first=" + first + ", last=" + last + ", size=" + size + "]";
	}

	private  Node first;
	private  Node last;
	private int size=0;
	
	//然后就是各种增删改查!
	
	public void add(Node node) {
		
		//判断是不是第一个,然后,估计就可以设置为第一个
		if(first==null) {
			first = node;
			last = node;
		}else {
			
			//如果不是,估计就得去操作node元素了.!		
			//前面是有元素的!
			
//			node.next = null;
			//后面就是添加新元素了.
			last.next = node;	
			node.prev = last;	
			
			
			last = node;
		}		
	}
}

//一环扣一环!.
class Node{
	
	@Override
	public String toString() {
		return "Node [prev=" + prev + ", next=" + next + ", ele=" + ele + "]";
	}

	Node prev;
	Node next;
	Object ele;
	
	public Node(Object ele) {
		
		this.ele = ele;
		
	}
	
	
}
