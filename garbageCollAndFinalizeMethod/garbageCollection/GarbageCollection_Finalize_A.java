package garbageCollection;

/*  Here JVM call finalise method when it required.
 	its mandatory to execute finalize
 	when call garbage collection*/
public class GarbageCollection_Finalize_A {
	
	@Override
	protected void finalize(){
		System.out.println("From Finalise");		
	}
	public static void main(String[] args) {
		GarbageCollection_Finalize_A a1 = 
				new GarbageCollection_Finalize_A();
		a1 = null; // unused object
		System.gc();
	}
}
