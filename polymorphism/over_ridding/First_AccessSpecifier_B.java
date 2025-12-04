package over_ridding;

/*	While overriding, if you are increasing the scope of access 
 	specifier, then it will not give any error. 
 	(like protected -> public)*/
public class First_AccessSpecifier_B extends First_AccessSpecifier_A {
	
	//Here we increase the scope, decrease not possible
	@Override
	public void testProtected(){
		System.out.println("Modfied Protected To Public");
	}
	@Override
	protected void testDefault(){
		System.out.println("From Default Method To Protected");
	}		
	
	public static void main(String[] args) {
		First_AccessSpecifier_B b = new First_AccessSpecifier_B();
		b.testProtected();
		b.testDefault();		
		//b.testPrivate(); private can't be inherited for same class
	}
}
