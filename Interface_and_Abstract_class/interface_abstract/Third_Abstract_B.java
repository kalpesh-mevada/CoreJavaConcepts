package interface_abstract;
/*	We can’t create static method in Abstract class as they are 
 	not inherited. If they are not inherited, then we can’t 
 	override.*/
public abstract class Third_Abstract_B implements Third_Int_A {
	
	public abstract static void testB();
}
