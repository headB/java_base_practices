package day17.io.practice05;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//5. 作业五:FileDemo5.java
//需求:使用递归列出文件的分层结构 
//作业目的:综合使用 File 类中的方法

//黑人问号????


//6. 作业六:FileDemo6.java 
//需求:过滤文件夹中以.avi 结尾的文件
//作业目的:了解过滤器的使用

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> parents = new ArrayList<>();
		
		parents.add("Downloads");
		parents.add("lizhixuan");
		parents.add("Users");
		System.out.println(parents);
		//使用Collection集成的功能,把list倒叙一下
		java.util.Collections.reverse(parents);
		System.out.println(parents);
		
		
		//然后结果list形式,去组织新的目录
		File f1 = new File("/Users/lizhixuan/Downloads/kumanxuan/six.txt");
		System.out.println(f1.exists());
		
		List<String> parents1 = new ArrayList<>();
		
		listParent(parents1,f1);
		
		System.out.println(parents1);
		
		Collections.reverse(parents1);
		
		StringBuilder sb1 = new StringBuilder();
		
		for(String s1:parents1) {
			sb1.append(s1);
			sb1.append(" > ");
		}
		
//		sb1.deleteCharAt(sb1.length()-2);
		sb1.delete(sb1.length()-3, sb1.length()-1);
		
		System.out.println(sb1);
		
		File f2 = new File("/Users/lizhixuan/Documents/java基础/作业讲解/集合/day02集合作业讲解/");
		
		for(File f3:f2.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if(name!=null && name.contains("wmv") ) {
					return true;
				}
				return false;
			}
			
		})) {
			System.out.println(f3);
		}
		
	}
	
	
	
	public  static void listParent(List<String> parents,File f) {
		
		//根据当前的文件是否为目录,是的话,输出当前的单个路径.
		
		//当前是目录,判断上级是否也是目录
		
		if(f.isDirectory() && !"/".equals(f.toString())){
			System.out.println("我也是目录啊! -> "+f.getName());
			parents.add(f.getName());
		}
		
		File s2 = f.getParentFile();
		if(s2!=null && s2.isDirectory()) {
			listParent(parents,s2);
		}
		
	}

}
