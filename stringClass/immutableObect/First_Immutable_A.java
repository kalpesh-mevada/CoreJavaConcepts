package immutableObect;
/*	Immutable object are the one whose value can never change.
*/
final class First_Immutable_A {	
	final private int i;
	final private int j;
	
	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}	
	
	public First_Immutable_A(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {
		// Here,Initialize final variable in constructor
		First_Immutable_A a = new First_Immutable_A(10, 20);
		//a.i = 30; //Error
		System.out.println(a.getI());
		System.out.println(a.getJ());
	}
}
