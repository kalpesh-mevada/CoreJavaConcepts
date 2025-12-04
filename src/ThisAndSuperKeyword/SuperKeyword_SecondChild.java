package ThisAndSuperKeyword;

public class SuperKeyword_SecondChild extends SuperKeyword_SecondParent {
	
	
	public static void main(String[] args) {		
		SuperKeyword_FirstChild b = new SuperKeyword_FirstChild();
		b.test();			

	}
	public void test(){		
		super.xyz();		
	}
}
