package interface_abstract;

//public abstract class First_Abstract_B{
//abstract class can implements Interface
public abstract class First_Abstract_B implements First_Int_A {
	
	/*	Abstract class can have complete and incomplete method so 
 	we don't get Error if you don't override*/
	public abstract void testAbstract();
	
	public void testB(){
		System.out.println("Completed Method");
	}
}
