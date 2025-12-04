package ThisAndSuperKeyword;

/* Call Constructor using This Keyword 
-----------------------------------------------------------------------
 * In Constructor, Using this keyword we can call constructor of same class, 
   but then to do this keyword should be first statement.
 * we can't access constructor inside method using this keyword */
public class ThisKeyword_Sixth {

	int i =10 ; //Non-static variable
	
	ThisKeyword_Sixth() {		
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
	// parameterized constructor inside variable is local variable.
	ThisKeyword_Sixth(int i) { 
		this(); // Call Constructor using This Keyword, but it's 1st statement.
		this.i = i;
		System.out.println(this.i);
		//this(); //ERROR - Constructor call must be the first statement in a constructor.
	}
	
	public static void main(String[] args) {
		//System.out.println(new ThisKeyword_Sixth(100).i);		
		new ThisKeyword_Sixth(100);
	}

}
