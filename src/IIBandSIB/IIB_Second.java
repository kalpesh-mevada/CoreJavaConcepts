package IIBandSIB;

/*
 * IIB (Instance Initialization Block):
	- IIB are executed when objects are created.
	- Number of times we create the object same number of time IIB will be called.
	- IIB are used to initialize all instance variable into one place and that gives as better readability of code.
	- Multiple IIB then it follows order in sequence which written first, it will execute first and so on.
    - We can initialize both static and non-static variable inside IIB

*/
public class IIB_Second {

	int i;
	int j;
	// IIB
	{
		System.out.println("FROM IIB");
		i=10;
		j=0;
		System.out.println(i);
		System.out.println(j);
		// new IIB_Second(); it gives error stack overflow due to call and call again.
	}
	IIB_Second() {
		System.out.println("FROM CONSTRUCTOR");
	}
	public static void main(String[] args) {
		
		// IIB are executed when objects are created.
		// IIN are called before constructor called.
		IIB_Second b = new IIB_Second();
		System.out.println("MAIN");		
	}
}
