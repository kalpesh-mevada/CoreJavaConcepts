package interface_p1;
/*	Interface are 100 % abstract(incomplete)
 	whereas class are 100% complete.*/
public interface First_Int_A {	
	
	public void test(); // by default abstract/incomplete
	
	// Not mandatory to write abstract,by default add in member
	public abstract void test3();
	//ERROR: Abstract methods do not specify a body
	/*public void test2(){		
	}*/
}
