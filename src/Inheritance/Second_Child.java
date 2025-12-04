package Inheritance;

/*	
 *  - No inheritance happen using extends
	- it is in same package otherwise we have to use 
	  import keyword used for package to accessing class*/
public class Second_Child {
	
	
	public static void main(String[] args) {
			Second_Parent a1 = new Second_Parent();
			System.out.println(a1.i);
	}

}
