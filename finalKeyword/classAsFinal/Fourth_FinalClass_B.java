package classAsFinal;

public class Fourth_FinalClass_B extends Fourth_FinalClass_A{
	@Override
	public void test(){
		System.out.println("From Test B");
	}
	@Override
	public final int testInt(){
		System.out.println("From Test A");
		return 30; // or 20 same value
	}
	public static void main(String[] args) {
		Fourth_FinalClass_B b1 = new Fourth_FinalClass_B();
		b1.test();
	}

}
