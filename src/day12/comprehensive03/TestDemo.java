package day12.comprehensive03;

//设计一个方法 getCpCode(double orderFee,String province)
//并且在 main 方法中调用,打印出 getCpCode(80,”北京市”)的返回结果.
//
//根据订单金额 orderFee 和 收货人省份 province 来判断使用哪家快递公司,

//具体需求如下 如果订单金额在 128 以上或者是广东省的收货地址,

//直接使用顺丰包邮, 返回 字符串 “SF”, 
//如果订单金额在 58 以上并且是北京市的收货地址,
//直接使用 EMS 包邮,返回字符串”EMS”, 其他情况默认为中通快递,返回字符串”ZTO”

public class TestDemo {
	
	
	public static void main(String[] args) {
		
		TestDemo t1 = new TestDemo();
		System.out.println(t1.getCpCode(129, "广西"));
		System.out.println(t1.getCpCode(59, "北京市"));
		System.out.println(t1.getCpCode(12, "北京市"));
		System.out.println(t1.getCpCode(129, "广东省"));
		System.out.println(t1.getCpCode(18, "广东省"));
		System.out.println(t1.getCpCode(129, "江西"));
		System.out.println(t1.getCpCode(12, "广西"));
		
		
		
	}
	
	
	
	public String getCpCode(double orderFree,String province) {
		
		
		//然后进行判断
		if(orderFree >=128 || "广东省".equals(province.trim())) {
			
			return "SF";
			
		}
		else if (orderFree >=58 && "北京市".equals(province.trim())) {
			
			return "EMS";
			
		}
		else {
			
			return "ZTO";
		}
		
		
		
	}

}
