package day01.加强练习题;

public class Page {
	
//	练习分页

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int current = 6;
		int total = 55;
		int pageSize = 10;
		int totalPage;
		
		totalPage = total % pageSize ==0 ? total / pageSize:total / pageSize +1;
		
		//上一页
		String prev;
		String next;
		
		prev = ( current >0 && current <= totalPage )? "上一页"+(current-1):"无效范围";
		next = ( current >0 && current < totalPage )? "下一页"+(current+1):"无效范围";
		
		System.out.println(prev);
		System.out.println(next);
		

	}

}
