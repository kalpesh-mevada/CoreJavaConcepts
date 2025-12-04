package ThisAndSuperKeyword;

/*
 * We can’t use “this keyword” and “super keyword” in the same constructor to 
   call another constructor as either of the statement becomes second statement, 
   then we will get an error*/
public class SuperKeyword_EighthChild extends SuperKeyword_EighthParent {
	
	SuperKeyword_EighthChild(){
		// compiler kept super() by default.
		super(100);
		System.out.println("Defual Constructor Of Child Class");
	}
		
	SuperKeyword_EighthChild(int i){
		/* Here compiler will not keep automatically super(),because this keyword is 
		   used to call child class constructor so.*/		
		this();
	   // super(); // ERROR: Constructor call must be the first statement in a constructor
		System.out.println("Parameterized Constructor Of Child Class: "+i);
	}
	public static void main(String[] args) {
		new SuperKeyword_EighthChild(200);
	}
}
