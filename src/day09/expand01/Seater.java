package day09.expand01;

public class Seater implements IMannedable {

	//是个交通工具都是有牌子的.
	private String brand;
	
	//作为一个工具,我必须有一个赚钱的技能,比如说的士是靠行驶,飞机是靠飞行,船是靠航行.
	//输入一个对象,去判断,这里准备实现大家差异性的方法.

	//我终于稍微有点理解了,就是,在这个练习题中,需要的是用多态的知识去打印
	//后面要指定的6句话的!.唉.终于理解了.!晕啊!>!!!
	
	
	@Override
	public void manned() {
		// TODO Auto-generated method stub
		System.out.format("我是%s,我有载客功能!",this.brand);
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}

}
