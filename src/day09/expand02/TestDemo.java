package day09.expand02;


//2.拓展二
//现有中国电信(ChinaTelecom),
//中国移动(ChinaMobile),
//中国联通(ChinaUnicom) 
//
//他们都属 于网络运营商(NetworkOperator),
//
//都有各自的网络类型(type),
//比如中国电信的网络类型为 LTE,
//中国移动的网络类型为 TD-LTE,
//中国联通的网络类型为 WCDMA.
//网络运营商都有安装宽 
//带(installBroadband)和安装有线电视(installCableTV)的行为.
//都实现了上网(IInternet) 和打电话(ICall)的功能,此外,
//
//中国移动通过飞信实现了聊天(IChat)的功能.
//
//  要求:使用继承知识模拟各网络运营商的关系，使用接口实现功能关系。

public class TestDemo {
	
	public static void main(String[] args) {
		//实例化三大运营商
		
		//中国电信
		ChinaMobile chinaMoble = new ChinaMobile();
		chinaMoble.setType("LTE");
		System.out.println(chinaMoble.getType());
		
		//中国联通
		ChinaUnicom chinaUnicom = new ChinaUnicom("WCDMA");
		System.out.println(chinaUnicom.getType());
		
		
		//中国电信
		ChinaTelecom chinaTelcom = new ChinaTelecom();	
		System.out.println(chinaTelcom.getType());
		
		//测试实例化第二个中国电信
		ChinaTelecom chinaTelcom1 = new ChinaTelecom("good day");	
		
		
		
		
		
	}
	
	
	
	

}
