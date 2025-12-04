package default_p1;

/* 	Class made as default can't access in different package
	while increasing visibility.
	-	it's Error in different package after inheriting,
	The type default_p1.Example1_A is not visible*/
public class Example1_A {
	protected int i = 10;
	
	void testDefault(){
		System.out.println("Default Method");
	}
	
	public void testPublic(){
		System.out.println("Public Method");
	}
	
	protected void testProtected(){
		System.out.println("Protected Method");
	}
	
	private void testPrivate(){
		System.out.println("Private Method");
	}
}
