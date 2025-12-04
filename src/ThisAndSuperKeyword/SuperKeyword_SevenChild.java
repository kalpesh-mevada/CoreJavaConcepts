package ThisAndSuperKeyword;

public class SuperKeyword_SevenChild extends SuperKeyword_SevenParent {
	
	SuperKeyword_SevenChild() {
		// compiler automatically as super();
		System.out.println("Child Class Default Constructor");
	}
	
	SuperKeyword_SevenChild(int i) {
		// compiler automatically as super();
		//super(200);
		System.out.println("With Arg Child Class Constructor: "+i);
	}
	public static void main(String[] args) {
		new SuperKeyword_SevenChild(100);
		new SuperKeyword_SevenChild();
	}

}
