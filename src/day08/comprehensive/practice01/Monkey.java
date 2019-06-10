package day08.comprehensive.practice01;

//做大师兄,都有这个功能的!
public class Monkey extends Prentice {
	
	public Monkey() {
		
	}
	
	private String formula;
	
	public void setFormula(String formula) {
		this.formula = formula;
	}
	
	public String getFormula() {
		return this.formula;
	}
	
	//覆写方法
	@Override
	public void extDevil() {
		// TODO Auto-generated method stub
		super.extDevil();
		System.out.println("而且我还会72变!");
	}

	
}
