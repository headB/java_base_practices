package day17.io.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class DemoTest {
	
	public static void main(String[] args) throws Exception {
		
		String input = "美女";//模拟用户输入的中文数据
		
		//编码操作:String -> byte[]
		byte[] data = input.getBytes("UTF-8"); 
		System.out.println(Arrays.toString(data));//[-23, -66, -103, -27, -109, -91]
		//解码操作:byte[] -> String
		//因为服务器时老外写的,老外在解码的时候使用 ISO-8859-1,此时就乱码了
		
		String ret = new String(data, "ISO-8859-1"); 
//		System.out.println(Arrays.toString(ret));
		System.out.println(ret);//输出:é3⁄4å¥ //---------------------------------------------
		//解决方案:重新对乱码编码回到 byte[],重新按照 UTF-8 解码
		data = ret.getBytes("ISO-8859-1"); 
		System.out.println(Arrays.toString(data));//[-23, -66, -103, -27, -109, -91] ret = new String(data,"UTF-8"); //--------------------------------------------- System.out.println(ret);//输出:龙哥
		System.out.println(data);
		System.out.println(new String(data,"UTF-8"));
	}

}
