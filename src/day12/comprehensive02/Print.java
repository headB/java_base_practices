package day12.comprehensive02;

public class Print implements ILowercaseLetter, IUppercaseLetter {
	
	//这里还需要设置成员变量???
	String word = null;
	
	public Print() {
		
	}
	
	public Print(String word) {
		this.word = word;
	}
	

	@Override
	public void printUppercaseLetter() {
		// TODO Auto-generated method stub
//		this.word = this.word.toLowerCase();
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<this.word.length();i++) {
			
			//应该是逐个字符串去判断吧.
//			System.out.println(this.word.charAt(i));
			char filter = this.word.charAt(i);
			if(97<=filter && filter<= 122) {
				filter -= 32;
			}
			
			sb1.append(filter);
//			System.out.println(filter);
			
		}
		
		this.word = sb1.toString();
		
		
		System.out.println(this.word);
		

	}

	@Override
	public void printLowercaseLetter() {
		// TODO Auto-generated method stub
//		this.word = this.word.toUpperCase();
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<this.word.length();i++) {
			
			char filter = this.word.charAt(i);
			if(65<=filter && filter<= 90) {
				filter += 32;
			}
			
			sb1.append(filter);
			
		}
		
		this.word = sb1.toString();
		
		System.out.println(this.word);

	}
	
	public String getWord() {
		return this.word;
	}

}
