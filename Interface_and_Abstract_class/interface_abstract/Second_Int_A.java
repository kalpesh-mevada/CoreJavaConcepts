package interface_abstract;
/*	We can’t create static method in interface as they 
 	are not inherited. If they are not inherited, 
 	then we can’t override. 
*/
public interface Second_Int_A {	
	/*	Error: Illegal modifier for the interface 
	 	method testStatic;
	 	only public & abstract are permitted*/
	public static void testStatic();
}
