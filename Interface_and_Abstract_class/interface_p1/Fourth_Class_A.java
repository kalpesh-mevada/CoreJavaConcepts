package interface_p1;
// By default, every member of interface is final and static
public class Fourth_Class_A implements Fourth_Int_A{
	
	public static void main(String[] args) {
		// we can never create object of interface.
		// Error: Cannot instantiate the type Fourth_Int_A
		//Fourth_Int_A iA1 = new Fourth_Int_A();
		Fourth_Class_A a1 = new Fourth_Class_A();
		//i = 20; // final so can't re initialize
		System.out.println(Fourth_Int_A.i);
	}
}
