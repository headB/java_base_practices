package day12.comprehensive04;

//4. 练习四
//String[] strs = {"2+3+4","2+4","5+6","9+7"};
// 1)请把 strs 中的所有数字加起来; 
// 2)请求出所有数字的平均数

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"2+3+4","2+4","5+6","9+7"};
		
		split(strs);
		
	}
	
	TestDemo t1 = new TestDemo();
	
//	t1.echo();
	
	
	public void echo() {
		
		System.out.println("six six six!");
//		return "six six";
		
	}
	
	public static void  split(String[] str) {
		
		//总数字个数的统计
		double count = 0;
		//统计总的数值
		double sum = 0;
		
		//
		
		for(String s1:str) {
			
			//使用split去分离
			String[] str2 = s1.split("\\+");
			for(String str3:str2) {
				
				//进行强转然后累加统计,然后顺便
				sum += Integer.parseInt(str3);
				count ++;
				
			}
			
		}
		
//		然后得到平均数了
		
		double avg = sum / count;
		System.out.println(avg);
	}

}
