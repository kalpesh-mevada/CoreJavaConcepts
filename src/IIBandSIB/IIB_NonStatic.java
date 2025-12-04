package IIBandSIB;

/*	We can initialize both static and non-static 
 	variable in IIB*/
public class IIB_NonStatic {

	int i;
	static int j;
	{
		System.out.println("IIB followed ordered sequence");
	}
	{
		/* 	Non-static and Static member both can 
			be initialize in IIB*/
		i = 20;
		j = 30;
		System.out.println("Non-Static: "+i);
		System.out.println("Static: "+j);
//it gives error StackOverflowError due to call and call again.
		//new IIB_NonStatic();		
	}
	public static void main(String[] args) {	
		
		IIB_NonStatic a = new IIB_NonStatic();		
	}
}
