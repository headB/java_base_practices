package 尝试出考试题目.测试在list前面添加元素;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestBeforeList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		{
			
			for(int i=1000;i>0;i++) {
				
				
				
			}
			
		}
		
		{
			int a = 1;
			System.out.println('z'>'b');
		}
		
		{
			boolean b1 = true;
//			System.out.println(b1==0);
			int a = -1 ;
			++a;
			while ( a < 5 ) {
				switch(a){
				case 0:
					case 3 : a = a + 6;
					case 1 :
					case 2 : a = a++;
					default : a = a + 6;
			}
			}
			System.out.println ( a ) ;
		}
		System.out.println("=================");
		
		System.out.println(0%2);
		System.out.println(1%2);
		System.out.println(2%2);
		System.out.println(3%2);
		
		int  a2 = -1 ;
		a2++;
		while ( a2 < 5 ) {
			switch(a2){
			case 0:
				case 3 : a2 = a2 + 6;
				case 1 :
				case 2 : a2 = a2 + 6;
				default : a2 = a2 + 6;
		}
		}
		System.out.println ( a2 ) ;
		
		int[] i2211 = new int[3];
		System.out.println("<---------->");
		System.out.println(i2211[0]);
		
		
		List<String> list = new ArrayList();
//		list.add("asd","asd","asd");
		String sx = "lizhixuan.kumanxuan";
		sx.length();
//		sx[1];
		sx.getBytes();
		
//		FileReader f1 = new FileReader("asd");
//		f1.read();
		
		Iterator<String> iccv = list.iterator();
		iccv.hasNext();
		
//		String c111 = new String(456);
		
//		list.sp
		
//		sx.charAt()
		
		System.out.println(Arrays.toString(sx.split("[\\.]")));
		
		
		FileWriter f = new FileWriter("ccctv.txt");
		
//		Writer f = new Writer();
		Integer i11 = 88;
		Integer i22 = 99;
		int c1 = i11 / i22;
//		i11.div
		f.write("cctv");
		
//		BufferedReader f1 = new BufferedReader(new FileReader("6.txt"));
//		f1.readLine();
		
//		f1.readline
//		"asdasd".trim()
		
//		f.wri
//		Integer.toString(i)
//		f.write()
//		Integer.toString(i);
		f.close();
		
//		Integer i22 = 66;
//		"sad".div
		
		String s11 = "My      name      is     kumanxuan";
		
		System.out.println("============");
		String[] target = s11.split(" ");
		
//		Pattern pattern = Pattern.compile(" .+$");  
//		Matcher matcher = pattern.matcher(s11);  
//		matcher.find()

		
		String res = "";
		
//		for(int i=0;i<target.length-1;i++) {
//			if(!(target[i].trim().length()<1)) {
//				res += target[i].trim()+" ";
//				System.out.println(target[i]);
//			}
//			
//		}
//		
//		res = res.trim();
//		
//		res += "="+target[target.length-1];
//		
//		
//		System.out.println("-----------------");
//		System.out.println(res);
		
		System.out.println(target[target.length-1]);
		
		System.out.println(s11.matches(" [.]+$"));
		
		System.out.println(s11.substring(3));
		
		String str = String.valueOf(44);
		System.out.println(str);
		
//		List list = new HashList<>();
		
		
		
		list.add("li");
		list.add("zhi");
		list.add("xuan");
		System.out.println(list);
		list.add(0,"Lai");
		System.out.println(list);
		
//		list.iterator();
		
		
		ArrayList<String> a1 = (ArrayList)list;
		String f2 = a1.toString();
		System.out.println("++++++++++++");
//		System.out.println(f1);
		
		for(String s1:list) {
			System.out.println(s1);
			if (s1.equals("zhi")) {
				System.out.println("这就是我的位置!");
				System.out.println(list.indexOf(s1));
			}
		}
		
		System.out.println("===================");
		
		Map<String,Integer>  map = new HashMap<>();
		
		map.put("name", 1);
		map.put("name1", 2);
		map.put("name2", 3);
		map.put("name3", 4);
		map.put("aname4", 5);
		
		Integer.parseInt("17");
		
		System.out.println(map);
		
		Collection<Integer> values =map.values();
		for (Integer i1 : values) {
			System.out.println(i1);
		}
		
		for (Entry<String, Integer> ele : map.entrySet()) {
			String s111 = ele.toString();
			System.out.println("asdsd");
			System.out.println(s111);
		}
//		Integer.toString(i)
		System.out.println("======");
		
		new FileOutputStream("asd.txt");
		
		for (Entry<String, Integer> i2 : map.entrySet()) {
			System.out.println(map.get(i2.getKey()));
		}
		
		

	}
	void test() {
//		private int = 55;
	}
	
	

}
