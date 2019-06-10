package day09.practice05;

public class MotherBoard {
	
	//然后这里定义一个方法,然后呢,
	//类比,然后,这里,只给插入USB的设备.
	
	//所以呢,凡是实现了IUSB功能的,符合IUSB规范的,都是属于合格的USB设备,所以呢,
	
	//允许插入!>
	
	public void plugin(IUSB usb) {
		usb.swapData();
	}
	

}
