package ThisAndSuperKeyword;

public class ThisKeyword_Second {

	int i = 10;
	
	public static void main(String[] args) {
		ThisKeyword_Second a1 = new ThisKeyword_Second();
		ThisKeyword_Second a2 = new ThisKeyword_Second();
		
		//“This keyword points to the current object executed.”
		System.out.println(a1);
		a1.test();
		//“This keyword points to the current object executed.”
		System.out.println(a2);
		a2.test();
	}
	
	public void test(){
		System.out.println(this);
	}

}
