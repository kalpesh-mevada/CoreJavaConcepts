package runTime;

public class Fourth_A {

	int i = 10;
	// Method with class name because it's return type void
	public void Fourth_A(Fourth_A d){
		System.out.println(d.i);
	}
	public static void main(String[] args) {
		Fourth_A d1 = null;
		d1.Fourth_A(d1);
		System.out.println("Completed");
	}
}
