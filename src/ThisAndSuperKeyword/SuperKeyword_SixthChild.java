package ThisAndSuperKeyword;

public class SuperKeyword_SixthChild extends SuperKeyword_SixthParent {

	/*ERROR Message : Implicit super constructor SuperKeyword_SixthParent() 
	                  is undefined for default constructor. Must define 
	                  an explicit constructor*/
	
	SuperKeyword_SixthChild() {
		super(500);
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
		new SuperKeyword_SixthChild();
	}

}
