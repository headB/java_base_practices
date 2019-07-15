package day08.comprehensive.practice01;

//做大师兄,都有这个功能的!
public class Monkey extends Prentice {
	
	private String name;

	private String formula;
	
	
	public Monkey() {
		
		super();
			
		}
		
		//猴子应该构造器和当前字段是一模一样的,包括父类.
		
		public Monkey(String name,int age,String weapon,String formula) {
			super(name,age,weapon);
			this.formula = formula;
			
			
		}
		
	public void printNames() {
		System.out.println(super.getName());
	}
		
		
	
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
	
	//覆写toString功能.
	public String toString() {
		
		String s1 = "";
		s1+= super.toString();
		s1+= " + 追加属性 formula -  "+this.formula;
		return s1;
		
	}

	
}
