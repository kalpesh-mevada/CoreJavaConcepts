package runTime;

public class Eight_A {

	int i  = 10;
	Eight_A(Eight_A b1){
		System.out.println(b1.i);
	}
	Eight_A(){
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		Eight_A b = new Eight_A();
		Eight_A a  = b;
		new Eight_A(a);
		System.out.println(a);
		System.out.println(b);
	}
}
