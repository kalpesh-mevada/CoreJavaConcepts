package over_ridding;
/*
 * 	While overriding, if you are increasing the scope of access 
 	specifier, then it will not give any error. 
 	(like protected -> public)
 	- private –  for same class – not be inherited
	- default –  protected/public/default
    - package needs to be same, then over riding happen in 
      inheritance, otherwise it can’t be over ride.
*/
public class First_AccessSpecifier_A {	
	
	protected void testProtected(){
		System.out.println("From Protected Method");
	}	
	
	private void testPrivate(){
		System.out.println("From Private Method");
	}	
	
	void testDefault(){
		System.out.println("From Default Method");
	}			
}

