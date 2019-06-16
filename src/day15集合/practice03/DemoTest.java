package day15集合.practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3. 作业三:
//需求:调用 ArrayList 类的常用方法 添加操作
// boolean add(Object e):将元素添加到列表的末尾
// void add(int index, Object element):在列表的指定位置插入指定的元素
// booleanaddAll(Collectionc):把c列表中的所有元素添加到当前列表中
//
//删除操作
// Object remove(int index):从列表中删除指定索引位置的元素,并返回被删除的元素 
// booleanremoveAll(Collectionc):从此列表中移除c列表中的所有元素
//
//修改操作
// Object set(int index, Object ele):修改列表中指定索引位置的元素，返回被替换的旧元素

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个默认长度的数组   //利用ArrayList快速创建一个数组,长度是默认.
		List list = new ArrayList();
		
		//尝试打印数组里面有没有元素.按书本来说,应该是说,查看是否拥有元素.!
		System.out.println("数组的长度-> "+list.size());
		
		//添加操作!.
		list.add("lizhixuan");
		list.add(5566);
		System.out.println(list.add('A'));
		
		
		System.out.println("数组的长度-> "+list.size());
		
		//查询操作.
		System.out.println(list);
		//指定输出具体位置的元素.
		System.out.println(list.get(1));
		
		//修改操作
		list.set(1,"TVB");
		
		list.add(1, "CCTVB");
		list.add("CNN");
		
		System.out.println(list);
		
		//删除操作
		list.remove(1);
		System.out.println(list);
		
		list.addAll(list);
		
		List list1 = new ArrayList();
		list1.add("TVB");
		list1.add("A");
		
		//原来这里的removeall是指含有的这些元素.!
		list.removeAll(list1);
		list.add(3344);
		list.add(6677);
		
		
		System.out.println("测试数组转换"+Arrays.toString(list.toArray()));
		
		System.out.println(list);
		
		System.out.println("是否包换lizhixuan -> "+list.contains("lizhixuan"));
		
		System.out.println(list.isEmpty());
		
		
		
		
		
		

	}

}
