package interface_p1;
/*	In java classes doesn't support multiple inheritance,
 	but then interface supports multiple inheritance.*/
public class Seventh_Class_A implements Seventh_Int_A,Seventh_Int_B {
	
	public static void main(String[] args) {
		Seventh_Class_A d1 = new Seventh_Class_A();
		d1.testA();
		d1.testB();
	}

	@Override
	public void testA() {
		System.out.println("From Interface A Completed");
	}

	@Override
	public void testB() {
		System.out.println("From Interface A Completed");		
	}
}
