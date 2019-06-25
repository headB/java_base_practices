package day17.io.test;

	
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

	//需求：字符解码和编码操作
	public class DemoTest2 {
		public static void main(String[] args) throws UnsupportedEncodingException {
			String str = "陈小.丹";
			//编码操作:String-->byte
			byte[] b = str.getBytes("UTF-8");//转换为UTF-8的字节
			System.out.println(Arrays.toString(b));
			//解码操作:byte-->String
			String ret = new String(b,"GBK");
			System.out.println(ret);
			//解决方案:重新对乱码编码回到byte[],按照UTF-8解码
			b = ret.getBytes("GBK");
			System.out.println(Arrays.toString(b));
			ret = new String(b,"UTF-8");
			System.out.println(ret);
			
			
			Integer i22 = new Integer("6");
			Integer i23 = new Integer(6);
			
					System.out.println(i22);
					System.out.println(i23);
			
//			while(1) {
//				System.out.println("ss");
//			}
			
		}
	}


