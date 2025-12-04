package ThisAndSuperKeyword;

/*
 * When variables are same, this can access only non-static varible.
 * it can't access local variable.*/
public class ThisKeyword_Fifth {

	int i = 10; // Non-static variable
	
	
	public static void main(String[] args) {
		ThisKeyword_Fifth  a1 = new ThisKeyword_Fifth();
	//ERROR: Cannot make a static reference to the non-static field i
		//System.out.println(i);
		System.out.println(a1.i);
		a1.test(); 
	}
	public void test(){
		int i = 20; //local variable
		System.out.println(this.i);	// 10	
	} 	

}
