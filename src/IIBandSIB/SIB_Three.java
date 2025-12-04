package IIBandSIB;

public class SIB_Three {

	int i =10;
	//IIB
	{
		System.out.println("IIB");
	}
	
	//CONSTRUCTOR
	SIB_Three() {
		System.out.println("CONSTRUCTOR");
	}
	
	//SIB
	static{
		System.out.println("SIB 1");
	}
	
	public static void main(String[] args) {
		/* - if we are not initialize class object then SIB will execute only.
		   - if we initialize object, then IIB and Main both executed but IIB will first Execute 
		     before main*/
		new SIB_Three();
	
		
		System.out.println(new SIB_Three().i);
	}
	//SIB
		static{
			System.out.println("SIB 2");
		}

}
