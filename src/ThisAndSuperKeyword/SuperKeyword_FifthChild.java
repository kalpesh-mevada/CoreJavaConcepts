package ThisAndSuperKeyword;
/*
 * Child class constructor, if you don’t create child class constructor 
   without argument, then compiler will automatically place no argument 
   constructor with super keyword.*/
public class SuperKeyword_FifthChild extends SuperKeyword_FifthParent {

	SuperKeyword_FifthChild(int i){
		// Compiler automatically consider as super();
		System.out.println("Constructor of Child: "+i);
		
	}
	public static void main(String[] args) {
		new SuperKeyword_FifthChild(100);
	}
}
