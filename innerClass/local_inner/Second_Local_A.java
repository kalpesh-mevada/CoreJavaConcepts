package local_inner;
/*	we can't access member of outer class using object 
 	of local inner class*/
public class Second_Local_A {
	// outer class member
	int j = 10; 
	//Local Inner Class
	class B{
		int i = 20;
	}
	public static void main(String[] args) {
		
		Second_Local_A a = new Second_Local_A();
		// using reference of outer class
		B b = a.new B();		
		System.out.println(b.i);
		// Error: j cannot be resolved or is not a field
		//System.out.println(b.j);
	}
}
