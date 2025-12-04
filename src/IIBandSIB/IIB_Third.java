package IIBandSIB;
public class IIB_Third {
	
	//IIB are executed when objects are created but it will be called before Constructor
	//Multiple IIB, then it will follow order in sequentially written.
	{
		System.out.println("FROM IIB 3");
		
	}
	
	{
		System.out.println("FROM IIB 1");
		
	}
	
	{
		System.out.println("FROM IIB 2");
		
	}
	//CONSTRUCTOR are executed when objects are created but it will be called  after IIB
	 IIB_Third() {
			System.out.println("FROM CONSTRUCTOR");
	}
	
public static void main(String[] args) {
		
	//IIB are executed when objects are created but it will be called before Constructor
	//CONSTRUCTOR are executed when objects are created but it will be called  after IIB
		IIB_Third b = new IIB_Third();
		System.out.println("MAIN");
		
	}

	{
	System.out.println("FROM IIB 4 After Main Method");
	
	}
}
